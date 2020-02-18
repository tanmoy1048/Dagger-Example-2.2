package com.datagene.daggerexample22.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import com.datagene.daggerexample22.data.LocalDao
import java.util.*
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(localDao: LocalDao) : ViewModel() {
    companion object {
        private const val TAG = "MainActivityViewModel"
    }

    init {
        Log.d("zzzzzz", "main activity viewmodel is working" + localDao)
    }
}