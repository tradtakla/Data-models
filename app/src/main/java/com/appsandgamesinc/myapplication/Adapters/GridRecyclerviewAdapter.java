package com.appsandgamesinc.myapplication.Adapters;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.appsandgamesinc.myapplication.GridRecyclerview;
import com.appsandgamesinc.myapplication.Models.People;
import com.appsandgamesinc.myapplication.R;

import java.util.ArrayList;

public class GridRecyclerviewAdapter extends RecyclerView.Adapter<GridRecyclerviewAdapter.MyViewHolder>
{
    private ArrayList<People> peopleAL = new ArrayList<>();

    public GridRecyclerviewAdapter(ArrayList<People> peopleAL)
    {
        this.peopleAL = peopleAL;
    }


    public class MyViewHolder extends RecyclerView.ViewHolder
    {
        public TextView txtview;
        public ImageView imgview;

        public MyViewHolder(View view)
        {
            super(view);
            txtview = (TextView) view.findViewById(R.id.gridTv);
            imgview = (ImageView) view.findViewById(R.id.gridIv);
        }
    }

    public GridRecyclerviewAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_layout, parent, false);

        return new GridRecyclerviewAdapter.MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position)
    {
        holder.txtview.setText(peopleAL.get(position).getName());
        holder.imgview.setImageResource(peopleAL.get(position).getImageId());
    }


    @Override
    public int getItemCount()
    {
        return peopleAL.size();
    }


}
