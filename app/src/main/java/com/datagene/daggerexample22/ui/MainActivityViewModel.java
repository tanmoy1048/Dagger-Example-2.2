package com.datagene.daggerexample22.ui;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import java.util.Calendar;
import java.util.Date;

import javax.inject.Inject;

public class MainActivityViewModel extends ViewModel {

    private static final String TAG = "AuthViewModel";


    @Inject
    public MainActivityViewModel(Date drawable, Calendar calendar) {
        Log.d("zzzzzz", "auth viewmodel is working" + (drawable != null) + (calendar != null));
    }

}









