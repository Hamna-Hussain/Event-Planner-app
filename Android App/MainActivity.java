package com.example.eventmanagement;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.ContextMenu;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tv = (TextView) findViewById(R.id.tv1);
        registerForContextMenu(tv);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.cmenu,menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected( MenuItem item)
    {
        int itemid = item.getItemId();
        if(itemid==R.id.cm1)
            tv.setText("About is selected");
        if(itemid==R.id.cm2)
            tv.setText("Contact-us is selected");
        if(itemid==R.id.cm3)
            tv.setText("Setting is selected");
        if(itemid==R.id.cm1)
            tv.setText("Logout is selected");

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo)
    {
        getMenuInflater().inflate(R.menu.context,menu);
        super.onCreateContextMenu(menu, v, menuInfo);
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item)
    {
        int val= item.getItemId();
        if(val==R.id.m1)
            tv.setText("Home page selected");
        if(val==R.id.m2)
            tv.setText("Venue page selected");
        if(val==R.id.m3)
            tv.setText("Event page selected");
        if(val==R.id.m4)
            tv.setText("About page selected");
        if(val==R.id.m5)
        tv.setText("System Setting selected");

        return super.onContextItemSelected(item);

    }
}