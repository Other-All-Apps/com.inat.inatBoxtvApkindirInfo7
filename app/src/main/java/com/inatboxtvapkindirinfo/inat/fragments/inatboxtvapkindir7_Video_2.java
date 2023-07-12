package com.inatboxtvapkindirinfo.inat.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.inatboxtvapkindirinfo.inat.R;
import com.inatboxtvapkindirinfo.inat.inatboxtvapkindir7_Video_view_1;
import com.inatboxtvapkindirinfo.inat.inatboxtvapkindir7_Video_view_2;
import com.inatboxtvapkindirinfo.inat.inatboxtvapkindir7_Video_view_3;
import com.inatboxtvapkindirinfo.inat.inatboxtvapkindir7_Video_view_4;
import com.inatboxtvapkindirinfo.inat.inatboxtvapkindir7_Video_view_5;


public class inatboxtvapkindir7_Video_2 extends Fragment {

    public inatboxtvapkindir7_Video_2() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.inatboxtvapkindir7_fragment_video_2, container, false);


        rootView.findViewById(R.id.play1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), inatboxtvapkindir7_Video_view_1.class);
                startActivity(i);
            }
        });
        rootView.findViewById(R.id.play2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), inatboxtvapkindir7_Video_view_2.class);
                startActivity(i);
            }
        });

        rootView.findViewById(R.id.play3).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), inatboxtvapkindir7_Video_view_3.class);
                startActivity(i);
            }
        });

        rootView.findViewById(R.id.play4).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), inatboxtvapkindir7_Video_view_4.class);
                startActivity(i);
            }
        });

        rootView.findViewById(R.id.play5).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(getActivity(), inatboxtvapkindir7_Video_view_5.class);
                startActivity(i);
            }
        });


        return rootView;


    }
}