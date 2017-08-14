package com.appsandgamesinc.myapplication.Adapters;

import android.app.Activity;
import android.content.Context;
import android.media.Image;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.appsandgamesinc.myapplication.R;


public class CustomAdapter extends ArrayAdapter<String>
{

    private final int[] image;
    private final String[] item;

    public CustomAdapter(Context context, String[] items, int[] pictures)
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
        View customView = mInflater.inflate(R.layout.custom_row, parent, false);

        ImageView imgView = customView.findViewById(R.id.imgView);
        TextView txtView = customView.findViewById(R.id.txtView);

        txtView.setText(item[position]);
        imgView.setImageResource(image[position]);


        return customView;
    }
}
