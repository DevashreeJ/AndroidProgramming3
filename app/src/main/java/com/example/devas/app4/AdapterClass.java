package com.example.devas.app4;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;
import java.util.Map;
import java.util.zip.Inflater;

/**
 * Created by devas on 9/27/2017.
 */

public class AdapterClass extends BaseAdapter {

    private final Context context;
    private final List<Map<String, ?>> movielist;
   // LayoutInflater inflater;

    MovieData movieData = new MovieData();

    public AdapterClass(Context context, List<Map<String, ?>> movielist)
    {
        this.context = context;
        this.movielist = movielist;

    }
    public int getCount()
    {
        return movieData.getSize();
    }

    public View getView(int position, View view, ViewGroup parent)
    {
        LayoutInflater inflater = (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rootView =  inflater.inflate(R.layout.list_item_layout, parent, false);
        final TextView name = (TextView)rootView.findViewById(R.id.textView5);
        final TextView overview = (TextView)rootView.findViewById(R.id.textView6);
        final ImageView image = (ImageView)rootView.findViewById(R.id.imageView3);
        name.setText(movieData.getItem(position).get("name").toString());
        overview.setText(movieData.getItem(position).get("overview").toString());
        image.setImageResource((Integer) movieData.getItem(position).get("image"));
        return rootView;
    }



    public long getItemId(int position)
    {
        return 0;
    }

    public Object getItem(int position)
    {
        return movieData.getItem(position);
    }
}
