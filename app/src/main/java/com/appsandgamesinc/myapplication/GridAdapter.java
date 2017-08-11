package com.appsandgamesinc.myapplication;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class GridAdapter extends ArrayAdapter<String>
{
    private final int[] image;
    private final String[] item;

    public GridAdapter(Context context, String[] items, int[] pictures)
    {
        super(context, R.layout.custom_row, items);

        this.image = pictures;
        this.item = items;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent)
    {

        LayoutInflater mInflater = LayoutInflater.from(getContext());
        View customView = mInflater.inflate(R.layout.custom_layout, parent, false);


        ImageView imgView = customView.findViewById(R.id.gridIv);
        TextView txtView = customView.findViewById(R.id.gridTv);

        txtView.setText(item[position]);
        imgView.setImageResource(image[position]);


        return customView;
    }
}
