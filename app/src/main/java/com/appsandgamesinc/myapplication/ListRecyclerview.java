package com.appsandgamesinc.myapplication;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.appsandgamesinc.myapplication.Adapters.ListRecyclerviewAdapter;
import com.appsandgamesinc.myapplication.Models.People;

import java.util.ArrayList;

public class ListRecyclerview extends AppCompatActivity
{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState)
    {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.list_recyclerview);

        initVars();
    }

    private void initVars()
    {
        ArrayList<People> peopleAL = new ArrayList<>();

        peopleAL.add(new People("Takla Trad", R.drawable.gorgeous_stage_background_04_hd_picture_169913));
        peopleAL.add(new People("Marwan Harb", R.drawable.landscape));

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rvPeople);

        ListRecyclerviewAdapter mAdapter = new ListRecyclerviewAdapter(peopleAL);
        RecyclerView.LayoutManager mLayoutManager = new LinearLayoutManager(getApplicationContext());
        recyclerView.setLayoutManager(mLayoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(mAdapter);
    }


}
