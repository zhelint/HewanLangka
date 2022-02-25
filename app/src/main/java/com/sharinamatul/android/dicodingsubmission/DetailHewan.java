package com.sharinamatul.android.dicodingsubmission;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailHewan extends AppCompatActivity {

    public static final String JUDUL_EXTRA = "judul";
    public static final String DESC_EXTRA = "deskripsi";
    public static final String FOTO_EXTRA = "foto";
    int judulValue, descValue, fotoValue;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hewan);

        //Get the data from BinatangAdapter View
        Intent intent = getIntent();
        judulValue = intent.getIntExtra(JUDUL_EXTRA, 0);
        descValue = intent.getIntExtra(DESC_EXTRA, 0);
        fotoValue = intent.getIntExtra(FOTO_EXTRA, 0);
        Log.v("detilhewan", ""+ judulValue + ", " + descValue);

        TextView judulKonten = findViewById(R.id.hewan_title);
        TextView deskripsiKonten = findViewById(R.id.hewan_descripton);
        judulKonten.setText(judulValue);
        deskripsiKonten.setText(descValue);

        //Set the ImageView. The content will be the photos from ArrayAdapter
        ImageView fotoKonten = findViewById(R.id.hewan_image);
        fotoKonten.setImageResource(fotoValue);

        /* Get the ActionBar*/
        ActionBar actionBar = getSupportActionBar();

        //Set the title at the top bar to match the article title
        actionBar.setTitle(judulValue);

        //Add the back button at the top bar
        actionBar.setDisplayHomeAsUpEnabled(true);

        /*Set the transition when go back to its parent activity*/
        Slide slide = new Slide();
        slide.setDuration(500);
        getWindow().setExitTransition(slide);


/*        //Get the data from BinatangAdapter View
        //Btw, what does Bundle means?
        Bundle extras = getIntent().getExtras();
        if(extras != null){
            judulValue = extras.getInt(JUDUL_EXTRA, 0);
            descValue = extras.getInt(DESC_EXTRA, 0);
        }

        judulKonten.setText(judulValue);
        deskripsiKonten.setText(descValue);*/

    }

//    private void setContentTitle(){
//
//    }
    private String activityTitle(){
        TextView title = findViewById(R.id.hewan_title);
        return title.getText().toString();
    }
}