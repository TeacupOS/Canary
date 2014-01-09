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

import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;

public class MainActivity extends Activity {

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.action_bar, menu);
        return true;
    }

    public boolean launchStatus(MenuItem menuItem) {
        Intent intent = new Intent(this, MinecraftStatusActivity.class);
        startActivity(intent);
        return true;
    }

    public boolean addServer(MenuItem menuItem) {
        Intent intent = new Intent(this, AddServerActivity.class);
        startActivity(intent);
        return true;
    }

}
