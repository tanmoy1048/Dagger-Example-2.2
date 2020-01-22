package com.datagene.daggerexample22.ui

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.datagene.daggerexample22.R
import com.datagene.daggerexample22.viewmodels.ViewModelProviderFactory
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class AnotherActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var providerFactory: ViewModelProviderFactory

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_main)
        val viewModel = ViewModelProviders.of(this, providerFactory).get(AnotherActivityViewModel::class.java)
    }
}