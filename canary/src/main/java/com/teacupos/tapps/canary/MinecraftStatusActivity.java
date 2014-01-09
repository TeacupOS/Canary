/*
 * Canary - Awesome Minecraft companion application for Android.
 *     Copyright (C) 2014 TeacupOS
 *
 *     This program is free software: you can redistribute it and/or modify
 *     it under the terms of the GNU Affero General Public License as published
 *     by the Free Software Foundation, either version 3 of the License, or
 *     (at your option) any later version.
 *
 *     This program is distributed in the hope that it will be useful,
 *     but WITHOUT ANY WARRANTY; without even the implied warranty of
 *     MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *     GNU Affero General Public License for more details.
 *
 *     You should have received a copy of the GNU Affero General Public License
 *     along with this program.  If not, see [http://www.gnu.org/licenses/].
 */

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
