package com.datagene.daggerexample22.di;


import java.util.Date;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    @Singleton
    @Provides
    static Date provideDate() {
        return new Date();
    }

}
















