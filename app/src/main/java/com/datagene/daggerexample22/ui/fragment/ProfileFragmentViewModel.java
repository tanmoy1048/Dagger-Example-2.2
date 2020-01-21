package com.datagene.daggerexample22.ui.fragment;

import android.graphics.drawable.Drawable;
import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;


import javax.inject.Inject;

public class ProfileFragmentViewModel extends ViewModel {
    @Inject
    public ProfileFragmentViewModel(Drawable drawable) {
        Log.d("zzzz", "MainFragmentViewModel: view model is working." + (drawable != null));
    }
}




















