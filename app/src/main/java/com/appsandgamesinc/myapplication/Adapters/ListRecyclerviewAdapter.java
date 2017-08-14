package com.appsandgamesinc.myapplication.Adapters;


import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;

import com.appsandgamesinc.myapplication.ListRecyclerview;
import com.appsandgamesinc.myapplication.Models.People;
import com.appsandgamesinc.myapplication.R;

import java.util.ArrayList;
import java.util.List;

public class ListRecyclerviewAdapter extends RecyclerView.Adapter<ListRecyclerviewAdapter.MyViewHolder>
{
    private ArrayList<People> peopleAL = new ArrayList<>();

    public ListRecyclerviewAdapter(ArrayList<People> peopleAL)
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
            txtview = (TextView) view.findViewById(R.id.txtView);
            imgview = (ImageView) view.findViewById(R.id.imgView);
        }
    }

    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType)
    {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.custom_row, parent, false);

        return new MyViewHolder(itemView);
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
