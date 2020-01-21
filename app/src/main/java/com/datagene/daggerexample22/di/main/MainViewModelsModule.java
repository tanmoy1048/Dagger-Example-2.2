package com.datagene.daggerexample22.di.main;

import androidx.lifecycle.ViewModel;

import com.datagene.daggerexample22.ui.MainActivityViewModel;
import com.datagene.daggerexample22.di.ViewModelKey;
import com.datagene.daggerexample22.ui.fragment.ProfileFragmentViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class MainViewModelsModule {
    @Binds
    @IntoMap
    @ViewModelKey(MainActivityViewModel.class)
    public abstract ViewModel bindMainActivityViewModel(MainActivityViewModel viewModel);

    @Binds
    @IntoMap
    @ViewModelKey(ProfileFragmentViewModel.class)
    public abstract ViewModel bindProfileFragmentViewModel(ProfileFragmentViewModel viewModel);
}
