package com.datagene.daggerexample22.ui;

import android.util.Log;

import androidx.lifecycle.ViewModel;

import java.util.Calendar;
import java.util.Date;

import javax.inject.Inject;

public class AnotherActivityViewModel extends ViewModel {
    @Inject
    public AnotherActivityViewModel(String s) {
        Log.d("zzzzzz", "another viewmodel is working" + s);
    }
}









