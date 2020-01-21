package com.datagene.daggerexample22.di.another;


import android.app.Application;
import android.graphics.drawable.Drawable;

import androidx.core.content.ContextCompat;

import com.datagene.daggerexample22.R;

import java.util.Calendar;

import dagger.Module;
import dagger.Provides;

@Module
public class AnotherModule {
    @Provides
    static String provideString() {
        return "just a string";
    }
}
