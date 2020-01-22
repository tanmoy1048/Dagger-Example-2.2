package com.datagene.daggerexample22.ui

import android.os.Bundle
import androidx.lifecycle.ViewModelProviders
import com.datagene.daggerexample22.R
import com.datagene.daggerexample22.ui.fragment.ProfileFragment
import com.datagene.daggerexample22.viewmodels.ViewModelProviderFactory
import dagger.android.support.DaggerAppCompatActivity
import javax.inject.Inject

class MainActivity : DaggerAppCompatActivity() {
    @JvmField
    @Inject
    var providerFactory: ViewModelProviderFactory? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val viewModel = ViewModelProviders.of(this, providerFactory).get(MainActivityViewModel::class.java)
        supportFragmentManager.beginTransaction().replace(R.id.fragmentHolder, ProfileFragment()).commit()
    }
}