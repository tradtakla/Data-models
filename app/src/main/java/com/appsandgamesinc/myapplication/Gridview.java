package com.appsandgamesinc.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

import com.appsandgamesinc.myapplication.Adapters.GridAdapter;

/**
 * Created by me on 8/11/17.
 */

public class Gridview extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview);
        populateGridview();
    }

    public void populateGridview()
    {

        final String[] items = {"Marwan", "Charbel", "Michel", "Anthony"};
        final int[] picture = {R.drawable.landscape, R.drawable.download, R.drawable.gorgeous_stage_background_04_hd_picture_169913,R.drawable.image};

        GridView gridView = (GridView) findViewById(R.id.gvGrid);
        GridAdapter adapter = new GridAdapter(this, items, picture);
        gridView.setAdapter(adapter);

        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l)
            {
                Intent profile = new Intent(Gridview.this, FirstProfile.class);
                profile.putExtra("username", items[position]);
                profile.putExtra("picture", picture[position]);
                startActivity(profile);
            }
        });
     }

}
