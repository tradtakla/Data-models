package com.appsandgamesinc.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.appsandgamesinc.myapplication.Adapters.CustomAdapter;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateListview();

    }

    public void populateListview(){

        final String[] items = {"Marwan", "Charbel", "Michel", "Anthony"};
        final int[] picture = {R.drawable.landscape, R.drawable.download, R.drawable.gorgeous_stage_background_04_hd_picture_169913,R.drawable.image};

        final ListAdapter adapter = new CustomAdapter(this, items, picture);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l)
            {

                System.out.println(position);
                Intent profile = new Intent(MainActivity.this, FirstProfile.class);
                profile.putExtra("username", items[position]);
                profile.putExtra("picture", picture[position]);
                startActivity(profile);
            }
        });
    }

}
