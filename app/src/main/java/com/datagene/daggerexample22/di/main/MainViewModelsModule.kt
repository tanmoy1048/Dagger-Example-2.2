package com.datagene.daggerexample22.di.main

import androidx.lifecycle.ViewModel
import com.datagene.daggerexample22.di.ViewModelKey
import com.datagene.daggerexample22.ui.MainActivityViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class MainViewModelsModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel::class)
    abstract fun bindMainActivityViewModel(viewModel: MainActivityViewModel): ViewModel
}