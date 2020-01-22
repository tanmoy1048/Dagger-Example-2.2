package com.datagene.daggerexample22.ui

import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class AnotherActivityViewModel @Inject constructor(s: String) : ViewModel() {
    init {
        Log.d("zzzzzz", "another viewmodel is working$s")
    }
}