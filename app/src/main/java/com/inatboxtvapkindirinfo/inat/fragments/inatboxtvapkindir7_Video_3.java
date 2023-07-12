package com.inatboxtvapkindirinfo.inat.fragments;

import android.content.ContentUris;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


import com.inatboxtvapkindirinfo.inat.R;
import com.inatboxtvapkindirinfo.inat.adapaters.inatboxtvapkindir7_AdapterVideoList;
import com.inatboxtvapkindirinfo.inat.adapaters.inatboxtvapkindir7_ModelVideo;

import java.util.ArrayList;
import java.util.Locale;


public class inatboxtvapkindir7_Video_3 extends Fragment {
    private ArrayList< inatboxtvapkindir7_ModelVideo > videosList = new ArrayList< inatboxtvapkindir7_ModelVideo >();
    private inatboxtvapkindir7_AdapterVideoList adapterVideoList;
    public inatboxtvapkindir7_Video_3() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
       View rooView = inflater.inflate(R.layout.inatboxtvapkindir7_fragment_video_3, container, false);


        RecyclerView recyclerView = rooView.findViewById(R.id.recyclerView_videos);
        recyclerView.setLayoutManager(new GridLayoutManager(getActivity(), 2)); //3 = column count
        adapterVideoList = new inatboxtvapkindir7_AdapterVideoList(getActivity(), videosList);
        recyclerView.setAdapter(adapterVideoList);
        loadVideos();
        return rooView;

    }

    private void loadVideos() {
        new Thread() {
            @Override
            public void run() {
                super.run();
                String[] projection = {MediaStore.Video.Media._ID, MediaStore.Video.Media.DISPLAY_NAME, MediaStore.Video.Media.DURATION};
                String sortOrder = MediaStore.Video.Media.DATE_ADDED + " DESC";

                Cursor cursor = getActivity().getContentResolver().query(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, projection, null, null, sortOrder);
                if (cursor != null) {
                    int idColumn = cursor.getColumnIndexOrThrow(MediaStore.Video.Media._ID);
                    int titleColumn = cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DISPLAY_NAME);
                    int durationColumn = cursor.getColumnIndexOrThrow(MediaStore.Video.Media.DURATION);

                    while (cursor.moveToNext()) {
                        long id = cursor.getLong(idColumn);
                        String title = cursor.getString(titleColumn);
                        int duration = cursor.getInt(durationColumn);

                        Uri data = ContentUris.withAppendedId(MediaStore.Video.Media.EXTERNAL_CONTENT_URI, id);

                        String duration_formatted;
                        int sec = (duration / 1000) % 60;
                        int min = (duration / (1000 * 60)) % 60;
                        int hrs = duration / (1000 * 60 * 60);

                        if (hrs == 0) {
                            duration_formatted = String.valueOf(min).concat(":".concat(String.format(Locale.UK, "%02d", sec)));
                        } else {
                            duration_formatted = String.valueOf(hrs).concat(":".concat(String.format(Locale.UK, "%02d", min).concat(":".concat(String.format(Locale.UK, "%02d", sec)))));
                        }

                        videosList.add(new inatboxtvapkindir7_ModelVideo(id, data, title, duration_formatted));
                        getActivity().runOnUiThread(new Runnable() {
                            @Override
                            public void run() {
                                adapterVideoList.notifyItemInserted(videosList.size() - 1);
                            }
                        });
                    }
                }

            }
        }.start();
    }


    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);



    }

}