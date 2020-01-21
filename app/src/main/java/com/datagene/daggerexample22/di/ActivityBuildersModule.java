package com.datagene.daggerexample22.di;


import com.datagene.daggerexample22.MainActivity;
import com.datagene.daggerexample22.di.main.MainModule;
import com.datagene.daggerexample22.di.main.MainViewModelsModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {
    @ContributesAndroidInjector(modules = {MainViewModelsModule.class, MainModule.class})
    abstract MainActivity contributeMainActivity();
}
