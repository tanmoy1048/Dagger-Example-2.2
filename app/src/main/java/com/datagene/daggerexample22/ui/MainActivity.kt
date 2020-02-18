package com.datagene.daggerexample22.ui

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.Canvas
import android.os.Bundle
import android.text.TextUtils
import android.view.View
import android.webkit.WebResourceError
import android.webkit.WebResourceRequest
import android.webkit.WebView
import android.webkit.WebViewClient
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProviders
import com.datagene.daggerexample22.R
import com.datagene.daggerexample22.viewmodels.ViewModelProviderFactory
import dagger.android.support.DaggerAppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*
import javax.inject.Inject


class MainActivity : DaggerAppCompatActivity() {

    @Inject
    lateinit var providerFactory: ViewModelProviderFactory
    lateinit var viewModel:MainActivityViewModel

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModel = ViewModelProviders.of(this, providerFactory).get(MainActivityViewModel::class.java)

        //webView.settings.javaScriptEnabled = true
        webView.webViewClient = object : WebViewClient() {

            override fun onPageFinished(view: WebView, url: String) {
                super.onPageFinished(view, url)
                progressBar.visibility = View.INVISIBLE
            }

            override fun onReceivedError(view: WebView, request: WebResourceRequest, error: WebResourceError) {
                super.onReceivedError(view, request, error)
                Toast.makeText(this@MainActivity, "Cannot load page", Toast.LENGTH_SHORT).show()
                progressBar.visibility = View.INVISIBLE
            }
        }
        webView.loadUrl("https://www.google.com/")
        progressBar.visibility = View.VISIBLE

        goButton.setOnClickListener {
            if (!TextUtils.isEmpty(urlEditText.text.toString())) {
                progressBar.visibility = View.VISIBLE
                webView.loadUrl(urlEditText.text.toString())
            }
        }

        captureButton.setOnClickListener {
            if(progressBar.visibility==View.INVISIBLE && !TextUtils.isEmpty(urlEditText.text.toString())){
                viewModel.saveScreenshot(getBitmapOfWebView(), urlEditText.text.toString())
            }
        }

        historyButton.setOnClickListener {
            startActivity(Intent(this, AnotherActivity::class.java))
        }

        subscribeUI()
    }

    private fun subscribeUI(){
        viewModel.errorMessage.observe(this, Observer {
            Toast.makeText(this@MainActivity, it, Toast.LENGTH_SHORT).show()
        })

        viewModel.successMessage.observe(this, Observer {
            Toast.makeText(this@MainActivity, it, Toast.LENGTH_SHORT).show()
        })
    }

    private fun getBitmapOfWebView():Bitmap{
        val bitmap = Bitmap.createBitmap(webView.width, webView.height, Bitmap.Config.ARGB_8888)
        val canvas = Canvas(bitmap)
        webView.draw(canvas)
        return bitmap
    }
}