package com.sharinamatul.android.dicodingsubmission;

import android.content.Context;
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
        judul.setText("Ini Judul");

        TextView deskripsi = listItemView.findViewById(R.id.deskripsi);
        deskripsi.setText("tools:text=\"Pretend that this is something I really want to pursue but what if I cannot achieve that? that'd be embarassing.\"\n");

        return listItemView;
    }
}
