package com.sharinamatul.android.dicodingsubmission;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Notification;
import android.os.Bundle;
import android.transition.Slide;

public class MyProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_my_profile);

        /* Get the action bar */
        ActionBar actionBar = getSupportActionBar();

        //Set the title of Activity (placed at the top bar)
        actionBar.setTitle(R.string.profile);

        //Add the back button at the top bar
        actionBar.setDisplayHomeAsUpEnabled(true);

        /*Set the transition when go back to its parent activity*/
        Slide slide = new Slide();
        slide.setDuration(500);
        getWindow().setExitTransition(slide);


    }
}