package com.appsandgamesinc.myapplication;


import android.media.MediaPlayer;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;

public class Music extends AppCompatActivity
{
    MediaPlayer mMediaPlayer;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music);
        mMediaPlayer = MediaPlayer.create(getApplicationContext(), R.raw.katy);
        mMediaPlayer.start();
    }

    @Override
    protected void onPause()
    {
        super.onPause();
        mMediaPlayer.stop();
        mMediaPlayer.release();
    }
}
