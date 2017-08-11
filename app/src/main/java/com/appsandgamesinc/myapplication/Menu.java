package com.appsandgamesinc.myapplication;


import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class Menu extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.menu);
        init();

    }

    public void init()
    {
        Button btnListview = (Button) findViewById(R.id.btnListview);
        Button btnGridview = (Button) findViewById(R.id.btnGridview);

        btnListview.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(Menu.this, MainActivity.class));
            }
        });

        btnGridview.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View view)
            {
                startActivity(new Intent(Menu.this, Gridview.class));
            }
        });
    }

}
