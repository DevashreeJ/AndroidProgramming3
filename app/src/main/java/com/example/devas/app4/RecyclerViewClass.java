package com.example.devas.app4;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by devas on 9/27/2017.
 */

public class RecyclerViewClass extends AppCompatActivity  {
    //MovieData movieData = new MovieData();
    //RecyclerAdapter adapter = new RecyclerAdapter();
    MovieData movieData = new MovieData();
    RecyclerAdapter recyclerViewAdapter = new RecyclerAdapter(getBaseContext(),movieData.getMoviesList());

    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);

        setContentView(R.layout.recycler_view);

        getSupportFragmentManager().beginTransaction()
                .replace(R.id.containerforlist, RecyclerViewFragment.newInstance(R.id.cardlist))
                .commit();

    }

   /* public View onCreateView (LayoutInflater inflater , ViewGroup container , Bundle savedInstanceState ) {

        View view = inflater.inflate(R.layout.recycler_view,container,false);
        Button selectAll = (Button)view.findViewById(R.id.selectAll);
        Button Delete = (Button)view.findViewById(R.id.Delete);
        Button ClearAll = (Button)view.findViewById(R.id.clearAllButton);
        selectAll.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public  void onClick(View v)
            {
                List<Map<String,?>> movie = movieData.getMoviesList();
                for(int i =0 ; i<movie.size();i++)
                {
                    movieData.getItem(i).put("selection",true);
                    recyclerViewAdapter.notifyDataSetChanged();
                }
            }

        });

        return view;
    }*/

    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        getMenuInflater().inflate(R.menu.menufilefrontpage, menu);
        return true;

    }
   /* public void onSelectOption()
    {
        recyclerViewAdapter.selectAll();
    }*/



    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();
        Intent intent;
        switch (id)
        {
            case R.id.task1 :
                intent = new Intent(this,MainActivity.class);
                startActivity(intent);
                return  true;

            case R.id.task2 :
                intent = new Intent(this,RecyclerViewClass.class);
                startActivity(intent);
                return  true;

        }
        return true;
    }

}
