package com.datagene.daggerexample22.ui.fragment

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProviders
import com.datagene.daggerexample22.R
import com.datagene.daggerexample22.ui.AnotherActivity
import com.datagene.daggerexample22.viewmodels.ViewModelProviderFactory
import dagger.android.support.DaggerFragment
import javax.inject.Inject

class ProfileFragment : DaggerFragment() {
    @JvmField
    @Inject
    var providerFactory: ViewModelProviderFactory? = null

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        val view = inflater.inflate(R.layout.fragment_main, container, false)
        view.findViewById<View>(R.id.button).setOnClickListener {
            val intent = Intent(activity, AnotherActivity::class.java)
            startActivity(intent)
        }
        return view
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val viewModel = ViewModelProviders.of(this, providerFactory).get(ProfileFragmentViewModel::class.java)
        Log.d("zzzz", "fragment viewmodel is created")
    }
}