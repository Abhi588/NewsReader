package com.example.abhishek.newsreader;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;

public class NewsDetails extends AppCompatActivity {
    WebView webview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);
        webview = (WebView) findViewById(R.id.webview);
        Bundle bundle =getIntent().getExtras();
        webview.loadUrl(bundle.getString("Link"));
    }
}
