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
