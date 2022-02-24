package com.sharinamatul.android.dicodingsubmission;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.os.Bundle;

public class MyProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        ActionBar actionBar = getSupportActionBar();
        actionBar.setTitle(R.string.profile);
    }
}