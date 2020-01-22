package com.datagene.daggerexample22.di

import com.datagene.daggerexample22.di.another.AnotherModule
import com.datagene.daggerexample22.di.another.AnotherViewModelsModule
import com.datagene.daggerexample22.di.main.MainModule
import com.datagene.daggerexample22.di.main.MainViewModelsModule
import com.datagene.daggerexample22.di.main.ProfileFragmentBuildersModule
import com.datagene.daggerexample22.ui.AnotherActivity
import com.datagene.daggerexample22.ui.MainActivity
import dagger.Module
import dagger.android.ContributesAndroidInjector

@Module
abstract class ActivityBuildersModule {
    @ContributesAndroidInjector(modules = [ProfileFragmentBuildersModule::class, MainViewModelsModule::class, MainModule::class])
    abstract fun contributeMainActivity(): MainActivity

    @ContributesAndroidInjector(modules = [AnotherViewModelsModule::class, AnotherModule::class])
    abstract fun contributeAnotherActivity(): AnotherActivity
}