package com.datagene.daggerexample22.di

import android.app.Application
import androidx.room.Dao
import androidx.room.Room
import com.datagene.daggerexample22.data.LocalDao
import com.datagene.daggerexample22.data.ScreenshotDatabase
import dagger.Module
import dagger.Provides
import java.util.*
import javax.inject.Singleton

@Module
class AppModule {

    @Provides
    @Singleton
    fun provideDealDatabase(application: Application): ScreenshotDatabase {
        return Room.databaseBuilder(
                application,
                ScreenshotDatabase::class.java,
                "screenshot.db"
        ).build()
    }

    @Provides
    @Singleton
    fun provideDealDao(screenshotDatabase: ScreenshotDatabase): LocalDao {
        return screenshotDatabase.localDao()
    }
}