package com.datagene.daggerexample22.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import java.util.*
import javax.inject.Inject

class MainActivityViewModel @Inject constructor(drawable: Date?, calendar: Calendar?) : ViewModel() {
    companion object {
        private const val TAG = "AuthViewModel"
    }

    init {
        Log.d("zzzzzz", "main activity viewmodel is working" + (drawable != null) + (calendar != null))
    }
}