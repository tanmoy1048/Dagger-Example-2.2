package com.datagene.daggerexample22.ui.fragment

import android.graphics.drawable.Drawable
import android.util.Log
import androidx.lifecycle.ViewModel
import javax.inject.Inject

class ProfileFragmentViewModel @Inject constructor(drawable: Drawable?) : ViewModel() {
    init {
        Log.d("zzzz", "MainFragmentViewModel: view model is working." + (drawable != null))
    }
}