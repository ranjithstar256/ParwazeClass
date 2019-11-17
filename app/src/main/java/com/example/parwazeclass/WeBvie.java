package com.example.parwazeclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.EditText;

public class WeBvie extends AppCompatActivity {
    WebView  webView;
    EditText editText;
    String addr;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_we_bvie);
        webView=findViewById(R.id.webv);
        editText = (EditText) findViewById(R.id.editText4);
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.google.com");
    }
    public void india(View view) {
        addr = editText.getText().toString();
        webView.loadUrl("https://"+addr);
    }
}
