package com.example.devas.app4;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.HashMap;


/**
 * Created by devas on 9/19/2017.
 */

public class Movie_details_fragment extends Fragment{


    HashMap<String,?> movieData;
    public static int position;

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        if(getArguments()!=null)
        {
            movieData = (HashMap<String, ?>)getArguments().getSerializable("movie");
        }
    }


    @Override
    public View onCreateView (LayoutInflater inflater , ViewGroup container , Bundle savedInstanceState ) {

        View rootView =inflater.inflate(R.layout.movie_details_fragment,container, false);
        final TextView name = (TextView)rootView.findViewById(R.id.textView12);
        final TextView overview = (TextView)rootView.findViewById(R.id.textView7);
        final TextView releaseDate = (TextView) rootView.findViewById(R.id.textView8);
        final TextView voteCount = (TextView)rootView.findViewById(R.id.textView13);
        final TextView popularity = (TextView)rootView.findViewById(R.id.textView14);
        final ImageView image = (ImageView)rootView.findViewById(R.id.imageView);

        name.setText(movieData.get("name").toString());
        overview.setText(movieData.get("overview").toString());
        releaseDate.setText(movieData.get("year").toString());
        voteCount.setText(movieData.get("vote_count").toString());
        popularity.setText(movieData.get("popularity").toString());
        image.setImageResource((Integer) movieData.get("image"));


        return rootView;

    }


    public static Movie_details_fragment newInstance(HashMap<String,?> movieData) {
        Movie_details_fragment movie_details_fragment = new Movie_details_fragment();
        Bundle args = new Bundle();
        args.putSerializable("movie",movieData);
        movie_details_fragment.setArguments(args);
        return movie_details_fragment;
    }

    public Movie_details_fragment() {

    }

}
