package com.datagene.daggerexample22.di.another

import androidx.lifecycle.ViewModel
import com.datagene.daggerexample22.di.ViewModelKey
import com.datagene.daggerexample22.ui.AnotherActivityViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
abstract class AnotherViewModelsModule {
    @Binds
    @IntoMap
    @ViewModelKey(AnotherActivityViewModel::class)
    abstract fun bindMainActivityViewModel(viewModel: AnotherActivityViewModel): ViewModel
}