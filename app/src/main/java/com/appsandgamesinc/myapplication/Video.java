package com.appsandgamesinc.myapplication;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.VideoView;

public class Video extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video);
        init();
        Button btnBack = (Button) findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                Intent intent = new Intent(Video.this, MainActivity.class);
                startActivity(intent);
            }
        });
    }

    public void init()
    {
        final VideoView viewVideo = (VideoView) findViewById(R.id.viewVideo);
        MediaController mediaController = new MediaController(this);
        mediaController.setAnchorView(viewVideo);
        Uri uri = Uri.parse("android.resource://"+ getPackageName()+"/" + R.raw.oneminvideo);
        viewVideo.setMediaController(mediaController);
        viewVideo.setVideoURI(uri);
        viewVideo.start();
    }


}
