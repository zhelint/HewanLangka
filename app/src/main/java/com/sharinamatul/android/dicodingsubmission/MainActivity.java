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
        ArrayList<String> binatang = new ArrayList<>();

        binatang.add("Harimau");
        binatang.add("Macan");

        //binatang.add(new InfoBinatang("Androchan", "Androchan punah saat perjalanannya menuju Bandung.", R.mipmap.ic_launcher_round));

        //Menggunakan ArrayAdapter untuk mengambil tiap elemen, dan menampilkannya di ListView
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, binatang);

        //ListView untuk menggunakan layout dari "ArrayAdapter" dan menampilkannya dlm bentuk list
        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(adapter);
        listView.setDivider(null);
        listView.setDividerHeight(0);
    }
}