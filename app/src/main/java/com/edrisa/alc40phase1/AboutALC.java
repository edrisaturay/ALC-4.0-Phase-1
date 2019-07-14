package com.edrisa.alc40phase1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;

public class AboutALC extends AppCompatActivity {

    private WebView mAboutALCWebView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        mAboutALCWebView = findViewById(R.id.wv_about_alc);
        mAboutALCWebView.loadUrl("https://andela.com/alc/");
    }
}
