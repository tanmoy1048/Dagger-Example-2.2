package com.datagene.daggerexample22.di.main;


import java.util.Calendar;

import dagger.Module;
import dagger.Provides;

@Module
public class MainModule {
    @Provides
    static Calendar provideCalendar() {
        return Calendar.getInstance();
    }
}
