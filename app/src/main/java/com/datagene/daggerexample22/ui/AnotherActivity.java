package com.datagene.daggerexample22.ui;


import android.os.Bundle;

import androidx.lifecycle.ViewModelProviders;

import com.datagene.daggerexample22.R;
import com.datagene.daggerexample22.ui.fragment.ProfileFragment;
import com.datagene.daggerexample22.viewmodels.ViewModelProviderFactory;

import javax.inject.Inject;

import dagger.android.support.DaggerAppCompatActivity;

public class AnotherActivity extends DaggerAppCompatActivity {

    @Inject
    ViewModelProviderFactory providerFactory;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_main);

        AnotherActivityViewModel viewModel = ViewModelProviders.of(this, providerFactory).get(AnotherActivityViewModel.class);
    }
}
