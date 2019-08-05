package com.rulerbug.toilte.Activity

import android.annotation.SuppressLint
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.webkit.WebViewClient
import com.rulerbug.toilte.R
import com.rulerbug.toilte.Utils.JsUtils
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initWebView()
    }

    @SuppressLint("JavascriptInterface")
    private fun initWebView() {
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("file:///android_asset/index.html");
        webView.webViewClient = WebViewClient()
        webView.addJavascriptInterface(JsUtils(), "register_js")
    };
}
