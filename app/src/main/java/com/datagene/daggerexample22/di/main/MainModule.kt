package com.datagene.daggerexample22.di.main

import android.app.Application
import android.graphics.drawable.Drawable
import androidx.core.content.ContextCompat
import com.datagene.daggerexample22.R
import dagger.Module
import dagger.Provides
import java.util.*

@Module
class MainModule {

    @Provides
    fun provideCalendar(): Calendar {
        return Calendar.getInstance()
    }


    @Provides
    fun provideDrawable(application: Application): Drawable? {
        return ContextCompat.getDrawable(application, R.mipmap.ic_launcher)
    }
}