package com.datagene.daggerexample22.di.main;


import android.app.Application;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import com.datagene.daggerexample22.R;

import java.util.Calendar;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {
    @Provides
    static Calendar provideCalendar() {
        return Calendar.getInstance();
    }

    @Provides
    static Drawable provideDrawable(Application application){
        return ContextCompat.getDrawable(application, R.mipmap.ic_launcher);
    }
}
