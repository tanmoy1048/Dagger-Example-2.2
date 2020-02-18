package com.datagene.daggerexample22.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import com.datagene.daggerexample22.data.LocalDao
import javax.inject.Inject

class AnotherActivityViewModel @Inject constructor(localDao: LocalDao) : ViewModel() {
    companion object {
        private const val TAG = "AnotherActivityViewModel"
    }
    init {
        Log.d("zzzzzz", "another viewmodel is working$localDao")
    }
}