package com.datagene.daggerexample22.ui

import android.os.Bundle
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import com.datagene.daggerexample22.R
import com.datagene.daggerexample22.data.model.Screenshot
import com.datagene.daggerexample22.utils.afterTextChanged
import com.datagene.daggerexample22.viewmodels.ViewModelProviderFactory
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_second.*
import javax.inject.Inject

class AnotherActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var providerFactory: ViewModelProviderFactory
    lateinit var viewModel:AnotherActivityViewModel
    val screenshots = mutableListOf<Screenshot>()
    private val dealAdapter = DealAdapter(screenshots)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
        viewModel = ViewModelProviders.of(this, providerFactory).get(AnotherActivityViewModel::class.java)
        urlEditText.afterTextChanged {
            viewModel.setSearchQuery(it)
        }
        initializeList()
        subscribeUI()
        viewModel.setSearchQuery("")
    }


    fun subscribeUI(){
        viewModel.screenShots.observe(this, Observer {
            screenshots.clear()
            screenshots.addAll(it)
            dealAdapter.notifyDataSetChanged()
        })
    }

    private fun initializeList() {
        list.layoutManager = LinearLayoutManager(this)
        list.adapter = dealAdapter
    }
}