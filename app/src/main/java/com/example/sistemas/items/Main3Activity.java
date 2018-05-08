package com.example.sistemas.items;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.webkit.WebViewDatabase;

public class Main3Activity extends AppCompatActivity {

    private WebView wv1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        wv1=findViewById(R.id.webView);
        String URL=getIntent().getStringExtra("URL");
        wv1.getSettings().setJavaScriptEnabled(true);
        wv1.setWebViewClient(new WebViewClient());
        wv1.loadUrl("http://"+URL);

    }

    public void Cerrar (View view){

        finish();
    }


}
