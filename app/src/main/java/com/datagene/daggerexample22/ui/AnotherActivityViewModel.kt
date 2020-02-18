package com.datagene.daggerexample22.ui

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Transformations
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.datagene.daggerexample22.data.LocalDao
import javax.inject.Inject

class AnotherActivityViewModel @Inject constructor(localDao: LocalDao) : ViewModel() {
    companion object {
        private const val TAG = "AnotherActivityViewModel"
    }
    private val searchQuery = MutableLiveData<String>()
    val screenShots = Transformations.switchMap(searchQuery) {
        localDao.getScreenshot(it)
    }

    fun setSearchQuery(query:String){
        searchQuery.postValue(query)
    }
}