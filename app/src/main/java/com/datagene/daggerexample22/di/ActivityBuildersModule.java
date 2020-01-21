package com.datagene.daggerexample22.di;


import com.datagene.daggerexample22.di.main.ProfileFragmentBuildersModule;
import com.datagene.daggerexample22.ui.MainActivity;
import com.datagene.daggerexample22.di.main.MainModule;
import com.datagene.daggerexample22.di.main.MainViewModelsModule;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuildersModule {
    @ContributesAndroidInjector(modules = {ProfileFragmentBuildersModule.class, MainViewModelsModule.class, MainModule.class})
    abstract MainActivity contributeMainActivity();
}
