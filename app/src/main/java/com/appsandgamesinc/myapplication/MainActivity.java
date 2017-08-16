package com.appsandgamesinc.myapplication;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;

import com.appsandgamesinc.myapplication.Adapters.CustomAdapter;

public class MainActivity extends AppCompatActivity
{
    MediaPlayer mMedia;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        populateListview();

    }

    public void populateListview()
    {

        final String[] items = {"Marwan", "Charbel", "Michel", "Anthony"};
        final int[] picture = {R.drawable.landscape, R.drawable.download, R.drawable.gorgeous_stage_background_04_hd_picture_169913, R.drawable.image};

        final ListAdapter adapter = new CustomAdapter(this, items, picture);

        ListView listView = (ListView) findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener()
        {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long l)
            {
                if (position == 0)
                {
                    Intent profile = new Intent(MainActivity.this, FirstProfile.class);
                    profile.putExtra("username", items[position]);
                    profile.putExtra("picture", picture[position]);
                    startActivity(profile);
                }
                else if (position ==1)
                {
                    Intent video = new Intent(MainActivity.this, Video.class);
                    startActivity(video);
                }
                else if (position == 2)
                {
                    Intent music = new Intent(MainActivity.this, Music.class);
                    startActivity(music);
                }

            }
        });
    }

}
