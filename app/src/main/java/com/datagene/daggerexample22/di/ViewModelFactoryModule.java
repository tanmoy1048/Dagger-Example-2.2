package com.datagene.daggerexample22.di;

import androidx.lifecycle.ViewModelProvider;

import com.datagene.daggerexample22.viewmodels.ViewModelProviderFactory;

import dagger.Binds;
import dagger.Module;


@Module
public abstract class ViewModelFactoryModule {
    @Binds
    public abstract ViewModelProvider.Factory bindViewModelFactory(ViewModelProviderFactory viewModelFactory);
}
