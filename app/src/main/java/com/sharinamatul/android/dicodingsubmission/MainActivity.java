package com.sharinamatul.android.dicodingsubmission;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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
                startActivity(new Intent(getApplicationContext(), MyProfile.class));
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
        binatang.add(new InfoBinatang(R.string.title_harimau_sumatera, R.string.desc_harimau_sumatera, R.mipmap.ic_launcher_round));
        binatang.add(new InfoBinatang(R.string.title_burung_cendrawasih, R.string.desc_burung_cendrawasih, R.drawable.burung_jalak_bali));
        binatang.add(new InfoBinatang(R.string.title_burung_cendrawasih, R.string.desc_burung_cendrawasih, R.drawable.burung_jalak_bali));


        //Menggunakan ArrayAdapter untuk mengambil tiap elemen, dan menampilkannya di ListView
        BinatangAdapter adapter = new BinatangAdapter(this, binatang);//Harusnya clickEvents dipanggil di sini

        //ListView untuk menggunakan layout dari "ArrayAdapter" dan menampilkannya dlm bentuk list
        ListView listView = findViewById(R.id.listview);
        listView.setAdapter(adapter);
        listView.setDivider(null);
        listView.setDividerHeight(0);
    }

    public void detailHewan(View view){
        Intent detailIntent = new Intent(view.getContext(), DetailHewan.class);
        startActivity(detailIntent);
    }
}