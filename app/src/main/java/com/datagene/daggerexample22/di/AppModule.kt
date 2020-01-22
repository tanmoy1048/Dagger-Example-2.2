package com.datagene.daggerexample22.di

import dagger.Module
import dagger.Provides
import java.util.*
import javax.inject.Singleton

@Module
class AppModule {

    @Singleton
    @Provides
    fun provideDate(): Date {
        return Date()
    }
}