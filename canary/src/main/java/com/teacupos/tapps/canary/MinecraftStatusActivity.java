package com.teacupos.tapps.canary;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class MinecraftStatusActivity extends ActionBarActivity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minecraft_status);

        WebView webView = (WebView) findViewById(R.id.xpawStatus);
        webView.loadUrl("http://xpaw.ru/mcstatus/");
        webView.getSettings().setJavaScriptEnabled(true);
    }

}
