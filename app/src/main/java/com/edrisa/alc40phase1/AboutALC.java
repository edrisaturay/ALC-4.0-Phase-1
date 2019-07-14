package com.edrisa.alc40phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebChromeClient;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class AboutALC extends AppCompatActivity {

    private WebView mAboutALCWebView;

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        mAboutALCWebView = findViewById(R.id.wv_about_alc);
        mAboutALCWebView.getSettings().setLoadsImagesAutomatically(true);
        mAboutALCWebView.getSettings().setJavaScriptEnabled(true);
        mAboutALCWebView.getSettings().setLoadWithOverviewMode(true);
        mAboutALCWebView.getSettings().setDomStorageEnabled(true);
        mAboutALCWebView.getSettings().setUseWideViewPort(true);

        mAboutALCWebView.setWebViewClient(new WebViewClient(){
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });
        mAboutALCWebView.loadUrl("https://google.com");

//        mAboutALCWebView.loadUrl("231shop.com");
    }
}
