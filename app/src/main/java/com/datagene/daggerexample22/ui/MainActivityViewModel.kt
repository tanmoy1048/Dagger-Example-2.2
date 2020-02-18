package com.datagene.daggerexample22.ui

import android.app.Application
import android.content.Context.MODE_PRIVATE
import android.content.ContextWrapper
import android.graphics.Bitmap
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.datagene.daggerexample22.data.LocalDao
import com.datagene.daggerexample22.data.model.Screenshot
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.Dispatchers.Main
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.File
import java.io.FileOutputStream
import java.io.IOException
import javax.inject.Inject


class MainActivityViewModel @Inject constructor(val localDao: LocalDao, val application: Application) : ViewModel() {
    companion object {
        private const val TAG = "MainActivityViewModel"
    }

    val errorMessage = MutableLiveData<String>()
    val successMessage = MutableLiveData<String>()

    fun saveBitmap(bitmap: Bitmap, fileName:String):String{
        val cw = ContextWrapper(application)
        // path to /data/data/yourapp/app_data/imageDir
        val directory = cw.getDir("imageDir", MODE_PRIVATE)
        // Create imageDir
        val file = File(directory, fileName)

        var fos: FileOutputStream? = null
        try {
            fos = FileOutputStream(file)
            // Use the compress method on the BitMap object to write image to the OutputStream
            bitmap.compress(Bitmap.CompressFormat.JPEG, 100, fos)
        } catch (e: Exception) {
            errorMessage.postValue(e.message)
            e.printStackTrace()
        } finally {
            try {
                fos!!.close()
            } catch (e: IOException) {
                errorMessage.postValue(e.message)
                e.printStackTrace()
            }
        }
        return file.absolutePath
    }

    fun saveScreenshot(bitmap: Bitmap, url:String){
        viewModelScope.launch {
            withContext(IO) {
                val currentTimestamp = System.currentTimeMillis()

                localDao.insertScreenshot(Screenshot(url, saveBitmap(bitmap, "$currentTimestamp.jpg"), currentTimestamp))

                withContext(Main){
                    successMessage.postValue("Everything is saved")
                }
            }


        }

    }
}