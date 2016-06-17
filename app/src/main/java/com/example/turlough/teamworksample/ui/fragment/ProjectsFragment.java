package com.example.turlough.teamworksample.ui.fragment;

import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.turlough.teamworksample.R;

public class ProjectsFragment extends Fragment {


    public ProjectsFragment() {
        // Required empty public constructor
    }



    @Override
    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        return inflater.inflate(R.layout.fragment_projects, container, false);
    }


    @Override
    public void onAttach(Context context) {

        super.onAttach(context);
    }


}
