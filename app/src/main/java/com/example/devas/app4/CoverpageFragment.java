package com.example.devas.app4;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by devas on 9/18/2017.
 */

public class CoverpageFragment extends Fragment {

    @Override
    public View onCreateView (LayoutInflater inflater , ViewGroup container , Bundle savedInstanceState ) {
        return inflater.inflate ( R.layout.coverpage , container , false );
    }

    private static final String ARG_SECTION_NUMBER = "section_number";


    public static CoverpageFragment newInstance(int sectionNumber) {
        CoverpageFragment coverpage = new CoverpageFragment();
        Bundle args = new Bundle();
        args.putInt(ARG_SECTION_NUMBER, sectionNumber);
        coverpage.setArguments(args);
        return coverpage;
    }

    public CoverpageFragment() {

    }

}


