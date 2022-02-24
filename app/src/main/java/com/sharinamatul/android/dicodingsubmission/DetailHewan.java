package com.sharinamatul.android.dicodingsubmission;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class DetailHewan extends AppCompatActivity {

    public static final String JUDUL_EXTRA = "judul";
    public static final String DESC_EXTRA = "deskripsi";
    int judulValue, descValue;
    TextView judulKonten, deskripsiKonten;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_hewan);

        //Set the title at the top bar to match the article title
        getSupportActionBar().setTitle(activityTitle());

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