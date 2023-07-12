package com.inatboxtvapkindirinfo.inat.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.inatboxtvapkindirinfo.inat.R;


public class inatboxtvapkindir7_Video_1 extends Fragment {


    public inatboxtvapkindir7_Video_1() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View rootView =inflater.inflate(R.layout.inatboxtvapkindir7_fragment_video_1, container, false);



        rootView.findViewById(R.id.play1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                inatboxtvapkindir7_Video_2 newFragment = new inatboxtvapkindir7_Video_2();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout, newFragment);
                transaction.commit();
            }
        });

        rootView.findViewById(R.id.play2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                inatboxtvapkindir7_Video_2 newFragment = new inatboxtvapkindir7_Video_2();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout, newFragment);
                transaction.commit();

            }
        });

        rootView.findViewById(R.id.play3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                inatboxtvapkindir7_Video_2 newFragment = new inatboxtvapkindir7_Video_2();
                FragmentTransaction transaction = getFragmentManager().beginTransaction();
                transaction.replace(R.id.frame_layout, newFragment);
                transaction.commit();
            }
        });



        return rootView;
    }

}