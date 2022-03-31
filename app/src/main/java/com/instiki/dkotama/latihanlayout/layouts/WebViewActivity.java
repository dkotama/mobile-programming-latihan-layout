package com.instiki.dkotama.latihanlayout.layouts;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.webkit.WebView;

import com.instiki.dkotama.latihanlayout.R;

public class WebViewActivity extends AppCompatActivity {
    WebView webView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);

        webView = findViewById(R.id.webview_container);
//        String customHtml =  "<html><body><h1>Welcome to INSTIKI Mobile Programming</h1>" +
//                "<h2>Welcome to INSTIKI Mobile Programming</h2><h3>Welcome to INSTIKI Mobile Programming</h3>" +
//                "<p>Ini adalah konten HTML Statis!</p>" +
//                "</body></html>";
//
//        webView.loadData(customHtml, "text/html", "UTF-8");

        // Load External URL
        webView.getSettings().setJavaScriptEnabled(true);
        webView.loadUrl("https://instiki.ac.id");


        // Mengatur actionbar agar ada tombol back
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home :
                this.finish();
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}