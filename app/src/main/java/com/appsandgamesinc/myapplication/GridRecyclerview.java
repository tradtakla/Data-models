package com.appsandgamesinc.myapplication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.GridLayoutManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.appsandgamesinc.myapplication.Adapters.GridRecyclerviewAdapter;
import com.appsandgamesinc.myapplication.Adapters.ListRecyclerviewAdapter;
import com.appsandgamesinc.myapplication.Models.People;

import java.util.ArrayList;

public class GridRecyclerview extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.grid_recyclerview);

        initVars();
    }

    public void initVars()
    {
        ArrayList<People> peopleAL = new ArrayList<>();

        peopleAL.add(new People("Takla Trad", R.drawable.gorgeous_stage_background_04_hd_picture_169913));
        peopleAL.add(new People("Marwan Harb", R.drawable.landscape));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvNumbers);

        GridRecyclerviewAdapter mAdapter = new GridRecyclerviewAdapter(peopleAL);
        RecyclerView.LayoutManager mLayoutManager = new GridLayoutManager(getApplicationContext(),3);
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }
}
