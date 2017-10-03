package com.example.devas.app4;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.OvershootInterpolator;
import android.widget.Button;

import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by devas on 9/28/2017.
 */

public class RecyclerViewFragment extends Fragment  {

    RecyclerView recycler;
    //RecyclerViewClass viewClass = new RecyclerViewClass();
    MovieData movieData = new MovieData();
    Button selectAllButton;
    Button clearSelected;
    Button deleteSelected;
    Button sortData;
    //List<Map<String,?>> movie = movieData.getMoviesList();
    //private RecyclerView.Adapter rAdapter;
    private static final String ARG_SECTION_NUMBER = "section_number";
    RecyclerAdapter recyclerViewAdapter = new RecyclerAdapter(getActivity(),movieData.getMoviesList());
    public static RecyclerViewFragment newInstance(int sectionNumber) {
        RecyclerViewFragment recyclerViewFragment = new RecyclerViewFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        recyclerViewFragment.setArguments(args);
        return recyclerViewFragment;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstance)
    {
        final View rootView = inflater.inflate(R.layout.recycler_view_layout, container, false);
        selectAllButton = (Button)rootView.findViewById(R.id.selectAllButton);
        clearSelected=(Button)rootView.findViewById(R.id.clearAllButton);
        deleteSelected=(Button)rootView.findViewById(R.id.delete);
        sortData = (Button)rootView.findViewById(R.id.sort);

        recycler = (RecyclerView)rootView.findViewById(R.id.cardlist);
        recycler.setHasFixedSize(true);
        LinearLayoutManager manager = new LinearLayoutManager(getActivity());
        recycler.setLayoutManager(manager);

        recycler.setAdapter(recyclerViewAdapter);
        recyclerViewAdapter.setOnItemClickListener(new RecyclerAdapter.OnItemClickListener()
        {
            @Override
            public void itemClick(View v,int position)
            {

                //viewClass.itemClick(v,position);
                HashMap<String,?> movie = (HashMap<String,?>)movieData.getMoviesList().get(position);
                getActivity().getSupportFragmentManager().beginTransaction()
                        .replace(R.id.containerforlist,Movie_details_fragment.newInstance(movie))
                        .addToBackStack(null).commit();
            }

            @Override
            public void onItemLongClick(View view, int position) {
                movieData.addItem(position+1, (HashMap)((HashMap) movieData.getItem(position)).clone());
                recyclerViewAdapter.notifyItemInserted(position+1);
            }

            @Override
            public void onCheckBoxClick(View view, int position) {
                HashMap<String,Boolean>item = (HashMap<String,Boolean>)movieData.getItem(position);
                boolean checked = item.get("selection");
                if(checked == true){
                    item.put("selection",false);
                }else if(checked == false){
                    item.put("selection",true);
                }
            }
        });


        selectAllButton.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public  void onClick(View v)
            {
                List<Map<String,?>> movie = movieData.getMoviesList();
                for(int i =0 ; i<recyclerViewAdapter.getItemCount();i++)
                {
                    HashMap<String, Boolean> selected = (HashMap<String, Boolean>)movieData.getItem(i);
                    selected.put("selection",true);
                }
                recyclerViewAdapter.notifyDataSetChanged();
            }

        });

        clearSelected.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public  void onClick(View v)
            {
                List<Map<String,?>> movie = movieData.getMoviesList();
                for(int i =0 ; i<recyclerViewAdapter.getItemCount();i++)
                {
                    HashMap<String, Boolean> selected = (HashMap<String, Boolean>)movieData.getItem(i);
                    selected.put("selection",false);
                }
                recyclerViewAdapter.notifyDataSetChanged();
            }

        });

        deleteSelected.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public  void onClick(View v)
            {
                List<Map<String,?>> movie = movieData.getMoviesList();
                for(int i =recyclerViewAdapter.getItemCount()-1 ; i>=0;i--)
                {
                   HashMap<String,Boolean>movieDataItem = (HashMap<String,Boolean>)movieData.getItem(i);
                    boolean selectedStatus = movieDataItem.get("selection");
                    if(selectedStatus==true)
                    {
                        movieData.removeItem(i);
                        recyclerViewAdapter.notifyItemRemoved(i);
                    }
                }
            }

        });


      //  ItemAnimation();
        //AdapterAnimation();
        sortData.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View v)
            {
                Collections.sort(movieData.getMoviesList(), new Comparator<Map<String, ?>>() {
                    @Override
                    public int compare(Map<String, ?> o1, Map<String, ?> o2) {
                         return o2.get("year").toString().compareTo(o1.get("year").toString());
                    }
                });
                recyclerViewAdapter.notifyDataSetChanged();
                recyclerViewAdapter.boolval=true;
            }
        });



        //animationForList();
        return rootView;
    }
    /*private void ItemAnimation(){
        FlipInLeftYAnimator animator = new FlipInLeftYAnimator(new OvershootInterpolator(1f));
        recycler.setItemAnimator(animator);
        recycler.getItemAnimator().setAddDuration(500);
        recycler.getItemAnimator().setRemoveDuration(1000);
    }

    private void AdapterAnimation(){
        AlphaInAnimationAdapter alphaInAnimationAdapter = new AlphaInAnimationAdapter(recyclerViewAdapter);
        alphaInAnimationAdapter.setDuration(1000);
        alphaInAnimationAdapter.setInterpolator(new OvershootInterpolator());
        alphaInAnimationAdapter.setFirstOnly(false);
        recycler.setAdapter(new ScaleInAnimationAdapter(alphaInAnimationAdapter));
    }*/
}
