package com.datagene.daggerexample22.di.main;


import com.datagene.daggerexample22.ui.fragment.ProfileFragment;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ProfileFragmentBuildersModule {
    @ContributesAndroidInjector
    abstract ProfileFragment contributeProfileFragment();
}
