package com.example.helloworld;

import com.example.helloworld.R;
import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebChromeClient; 

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
 
        // Load the webview
        WebView webView = (WebView)findViewById(R.id.webView);
 
        // Activate JavaScript
        webView.getSettings().setJavaScriptEnabled(true);
        webView.setWebChromeClient(new WebChromeClient());

        // Load the main page
        webView.loadUrl("file:///android_asset/www/index.html");
    }
}