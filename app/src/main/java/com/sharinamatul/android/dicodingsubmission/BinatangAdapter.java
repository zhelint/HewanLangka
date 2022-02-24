package com.sharinamatul.android.dicodingsubmission;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class BinatangAdapter extends ArrayAdapter<InfoBinatang> {

    private ClickEvents clickEvents;
    public static final String JUDUL_EXTRA = "judul";
    public static final String DESC_EXTRA = "deskripsi";

    public BinatangAdapter(@NonNull Context context, @NonNull ArrayList<InfoBinatang> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        View listItemView = convertView;
        if(listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.card_view, parent, false);
        }

        InfoBinatang currentInfoBinatang = getItem(position);

        ImageView fotoBinatang = listItemView.findViewById(R.id.foto);
        fotoBinatang.setImageResource(R.mipmap.ic_launcher);

        TextView judul = listItemView.findViewById(R.id.judul);
        if(currentInfoBinatang.getResourceNamaBinatang() != 0){
            judul.setText(currentInfoBinatang.getResourceNamaBinatang());
        } else {
            judul.setText(currentInfoBinatang.getStringNamaBinatang());
        }

        TextView deskripsi = listItemView.findViewById(R.id.deskripsi);
        if(currentInfoBinatang.getResourceDeskripsi() != 0){
            deskripsi.setText(currentInfoBinatang.getResourceDeskripsi());
        } else {
            deskripsi.setText(currentInfoBinatang.getStringDeskripsi());
        }

/*        //OnClickListener for the View in ArrayAdapter
        //When the View is clicked, it will open DetailHewan activity, and pass the data contains judul and description
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getContext(), DetailHewan.class);
                int judulValue = currentInfoBinatang.getResourceNamaBinatang();
                int deskripsiValue = currentInfoBinatang.getResourceDeskripsi();

                intent.putExtra(JUDUL_EXTRA, judulValue);
                intent.putExtra(DESC_EXTRA, deskripsiValue);
                getContext().startActivity(intent);
                Log.v("konteks", getContext().toString());
            }
        });*/
        return listItemView;
    }

}
