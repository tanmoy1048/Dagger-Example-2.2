package com.datagene.daggerexample22.di.another;

import androidx.lifecycle.ViewModel;

import com.datagene.daggerexample22.di.ViewModelKey;
import com.datagene.daggerexample22.ui.AnotherActivityViewModel;
import com.datagene.daggerexample22.ui.MainActivityViewModel;
import com.datagene.daggerexample22.ui.fragment.ProfileFragmentViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class AnotherViewModelsModule {
    @Binds
    @IntoMap
    @ViewModelKey(AnotherActivityViewModel.class)
    public abstract ViewModel bindMainActivityViewModel(AnotherActivityViewModel viewModel);
}
