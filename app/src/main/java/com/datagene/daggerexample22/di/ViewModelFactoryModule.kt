package com.datagene.daggerexample22.di

import androidx.lifecycle.ViewModelProvider
import com.datagene.daggerexample22.viewmodels.ViewModelProviderFactory
import dagger.Binds
import dagger.Module

@Module
abstract class ViewModelFactoryModule {
    @Binds
    abstract fun bindViewModelFactory(viewModelFactory: ViewModelProviderFactory): ViewModelProvider.Factory
}