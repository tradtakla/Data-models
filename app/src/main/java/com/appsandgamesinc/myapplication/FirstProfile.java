package com.appsandgamesinc.myapplication;


import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

public class FirstProfile extends AppCompatActivity
{

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.first_profile);

        String username = getIntent().getStringExtra("username");
        int picture = getIntent().getIntExtra("picture", 0);

        TextView fpTxt = (TextView) findViewById(R.id.fpTxt);
        ImageView fpImg= (ImageView) findViewById(R.id.fpImg);

        fpTxt.setText(username);
        fpImg.setImageResource(picture);

    }
}
