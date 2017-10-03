package com.example.devas.app4;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.HashMap;

/**
 * Created by devas on 9/28/2017.
 */

public class listViewFragment extends Fragment {

    private static final String ARG_SECTION_NUMBER = "section_number";
    int counter=0;
    MovieData movieData = new MovieData();
    //private OnClickingButton onclicking;

    public static listViewFragment newInstance(int sectionNumber) {
        listViewFragment listPage = new listViewFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        listPage.setArguments(args);
        return listPage;
    }

    public listViewFragment() {

    }
    /*public interface OnClickingButton {
        public void onClickingButton(HashMap<String, ?> movie);
    }*/

    @Override
    public View onCreateView (LayoutInflater inflater , ViewGroup container , Bundle savedInstanceState )
    {
        View rootView = inflater.inflate(R.layout.listviewlayout, container, false);
        ListView listView = (ListView)rootView.findViewById(R.id.listview);

        AdapterClass adapter = new AdapterClass(getActivity(),movieData.getMoviesList());
        listView.setAdapter(adapter);
        return rootView;
    }

    /*@Override
    @Deprecated
    public void onAttach ( Activity activity ) {
        super . onAttach ( activity );
        onclicking = (listViewFragment.OnClickingButton) activity ;
    }*/
}
