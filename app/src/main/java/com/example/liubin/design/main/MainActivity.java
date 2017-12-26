package com.example.liubin.design.main;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.liubin.design.R;
import com.example.liubin.design.defalt.DefaultActivity;
import com.example.liubin.design.floating_action_button.FloatingActionButtonActivity;
import com.example.liubin.design.material.MaterialActivity;
import com.example.liubin.design.test.TestActivity;
import com.example.liubin.design.text_input_layout.TextInputLayoutActivity;
import com.zhy.autolayout.utils.L;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.defalt).setOnClickListener(this);
        findViewById(R.id.floating).setOnClickListener(this);
        findViewById(R.id.textInputLayout).setOnClickListener(this);
        findViewById(R.id.material).setOnClickListener(this);
        findViewById(R.id.test).setOnClickListener(this);
        Log.i(TAG, "onCreate: ");
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.defalt:
                startActivity(new Intent(this, DefaultActivity.class));
                break;
            case R.id.floating:
                startActivity(new Intent(this, FloatingActionButtonActivity.class));
                break;
            case R.id.textInputLayout:
                startActivity(new Intent(this, TextInputLayoutActivity.class));
                break;
            case R.id.material:
                startActivity(new Intent(this, MaterialActivity.class));
                break;
            case R.id.test:
                startActivity(new Intent(this, TestActivity.class));
                break;
        }
    }
}
