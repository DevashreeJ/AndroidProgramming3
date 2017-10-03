package com.example.devas.app4;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Map;



/**
 * Created by devas on 9/29/2017.
 */

public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {

    // MovieData movies = new MovieData();
    private List<Map<String, ?>> data;
    public boolean boolval= false;
    private Context context;
    OnItemClickListener itemClickListener;
    boolean isSelectedAll;
    //  RecyclerView recycler ;

    //MovieData movie = new MovieData();

    public RecyclerAdapter(Context mcontext, List<Map<String, ?>> dataset) {
        context = mcontext;
        data = dataset;
    }

    public RecyclerAdapter() {
    }

    /*public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v;
        v = LayoutInflater.from(parent.getContext()).inflate(R.layout.cardviewlayout, parent, false);

        ViewHolder vhc = new ViewHolder(v);
        return vhc;
    }*/

    public void setOnItemClickListener(final OnItemClickListener itemListener) {
        this.itemClickListener = itemListener;

    }

    public interface OnItemClickListener {
        public void itemClick(View v, int position);
        public void onItemLongClick(View view, int position);
        public void onCheckBoxClick(View view, int position);
    }


    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        Map<String, ?> movie = data.get(position);

        holder.bindMovieData(movie);
    }

    @Override
    public int getItemCount() {
        return data.size();
    }

    @Override
    public RecyclerAdapter.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        View v;
        switch (viewType){
            case 0 :
                v = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.cardviewlayout,parent,false);
                break;
            case 1 :
                v = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.cardviewlayout2,parent,false);
                break;
            case 2 :
                v = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.cardviewlayout3,parent,false);
                break;
            default:
                v = LayoutInflater.from(parent.getContext())
                        .inflate(R.layout.cardviewlayout,parent,false);
        }

        ViewHolder vh = new ViewHolder(v);
        return vh;
    }

    @Override
    public int getItemViewType(int position){
        if(position < 5 && boolval== true)
            return 1;
        else if(position > (data.size()-6) && boolval ==true)
            return 2;
        else
            return 0;
    }


    public class ViewHolder extends RecyclerView.ViewHolder {
        public ImageView image;
        public TextView title;
        public TextView description;
        public CheckBox checker;

        public ViewHolder(View v) {
            super(v);
            image = (ImageView) v.findViewById(R.id.imageView3);
            title = (TextView) v.findViewById(R.id.textView5);
            description = (TextView) v.findViewById(R.id.textView6);
            checker = (CheckBox) v.findViewById(R.id.checkBox);

            v.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (itemClickListener != null) {
                        itemClickListener.itemClick(v, getAdapterPosition());

                    }
                }
            });
            v.setOnLongClickListener(new View.OnLongClickListener() {
                @Override
                public boolean onLongClick(View v) {
                    if (itemClickListener != null) {
                        itemClickListener.onItemLongClick(v, getAdapterPosition());
                    }
                    return true;
                }
            });
           checker.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    itemClickListener.onCheckBoxClick(v, getAdapterPosition());
                }
            });
        }

        public void bindMovieData(Map<String, ?> movie) {
            title.setText(movie.get("name").toString());
            description.setText(movie.get("overview").toString());
            image.setImageResource((Integer) movie.get("image"));
            checker.setChecked((Boolean) movie.get("selection"));
        }

    }
}






