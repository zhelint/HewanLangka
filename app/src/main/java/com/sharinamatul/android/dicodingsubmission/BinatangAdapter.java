package com.sharinamatul.android.dicodingsubmission;

import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import org.w3c.dom.Text;

import java.util.ArrayList;
import java.util.List;

public class BinatangAdapter extends ArrayAdapter<InfoBinatang> {

    private ClickEvents clickEvents;
    public static final String JUDUL_EXTRA = "judul";
    public static final String DESC_EXTRA = "deskripsi";
    public static final String FOTO_EXTRA = "foto";

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

        //Store each data needed from InfoBinatang in a variable
        int resourcesJudul = currentInfoBinatang.getResourceNamaBinatang();
        int resourcesDeskripsi = currentInfoBinatang.getResourceDeskripsi();
        int resourcesFoto = currentInfoBinatang.getIdFotoBinatang();

        //Set the onClickListener to listView LinearLayout
        //Will do this if the Card (LinearLayout) is clicked
        LinearLayout linearLayout = listItemView.findViewById(R.id.cardLinearLayout);
        linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Declare a variable, contains this context
                Context context = getContext();

                //Create new intent when the view is clicked
                Intent intent = new Intent(context, DetailHewan.class);

                //Declare a variable

                //Put extra, so that the data can be passed to another DetailHewan intent
                intent.putExtra(JUDUL_EXTRA, resourcesJudul);
                intent.putExtra(DESC_EXTRA, resourcesDeskripsi);
                intent.putExtra(FOTO_EXTRA, resourcesFoto);
                Log.v("ekstra val: ", ""+ resourcesJudul + ", " + resourcesDeskripsi);
                context.startActivity(intent);

//                Toast.makeText(getContext(), "Clicked!", Toast.LENGTH_SHORT).show();
//                Log.v("konteks", ""+getContext());
            }
        });

        ImageView fotoBinatang = listItemView.findViewById(R.id.foto);
        fotoBinatang.setImageResource(resourcesFoto);

        TextView judul = listItemView.findViewById(R.id.judul);
        if(resourcesJudul != 0){
            judul.setText(resourcesJudul);
        }

        TextView deskripsi = listItemView.findViewById(R.id.deskripsi);
        if(resourcesDeskripsi != 0){
            deskripsi.setText(resourcesDeskripsi);
        }

/*        //OnClickListener for the View in ArrayAdapter
        //When the View is clicked, it will open DetailHewan activity, and pass the data contains judul and description
        listItemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(view.getContext(), "Clicked!", Toast.LENGTH_SHORT);
                Log.v("konteks", ""+getContext());
            }
        });*/
        return listItemView;
    }

}
