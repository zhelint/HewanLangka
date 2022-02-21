package com.sharinamatul.android.dicodingsubmission;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Membuat ArrayList untuk menampung semua informasi tentang hewan
        ArrayList<InfoBinatang> binatang = new ArrayList<>();

        binatang.add(new InfoBinatang("Androchan", "Androchan punah saat perjalanannya menuju Bandung.", R.mipmap.ic_launcher_round));

        //Menggunakan ArrayAdapter untuk mengambil tiap elemen, dan menampilkannya di ListView
        ArrayAdapter<InfoBinatang> adapter = new ArrayAdapter<InfoBinatang>(this, android.R.layout.simple_list_item_1, binatang);

        //ListView untuk menggunakan layout dari "ArrayAdapter" dan menampilkannya dlm bentuk list
        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(adapter);
    }
}