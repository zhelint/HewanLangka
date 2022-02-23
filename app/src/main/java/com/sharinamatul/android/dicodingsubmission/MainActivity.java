package com.sharinamatul.android.dicodingsubmission;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    //Kenapa pakai item coba? Bukan view, layout, or sth?
    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch(item.getItemId()) {
            case R.id.profile_button:
                Toast.makeText(this, "Profile is clicked", Toast.LENGTH_SHORT).show();
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_file, menu);
        return true;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Membuat ArrayList untuk menampung semua informasi tentang hewan
        ArrayList<InfoBinatang> binatang = new ArrayList<>();

        binatang.add(new InfoBinatang("Sasatoan", "Apa gitu terserah", R.mipmap.ic_launcher_round));
        binatang.add(new InfoBinatang("Sasatoan", "Apa gitu terserah", R.mipmap.ic_launcher_round));
        binatang.add(new InfoBinatang("Sasatoan", "Apa gitu terserah", R.mipmap.ic_launcher_round));

        //binatang.add(new InfoBinatang("Androchan", "Androchan punah saat perjalanannya menuju Bandung.", R.mipmap.ic_launcher_round));

        //Menggunakan ArrayAdapter untuk mengambil tiap elemen, dan menampilkannya di ListView
        BinatangAdapter adapter = new BinatangAdapter(this, binatang);

        //ListView untuk menggunakan layout dari "ArrayAdapter" dan menampilkannya dlm bentuk list
        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(adapter);
        listView.setDivider(null);
        listView.setDividerHeight(0);
    }
}