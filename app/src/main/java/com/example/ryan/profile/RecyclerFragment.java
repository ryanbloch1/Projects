package com.example.ryan.profile;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RecyclerFragment extends Fragment {

    private RecyclerView mRecyclerView;
    private RecyclerView.Adapter mAdapter;
    private RecyclerView.LayoutManager mLayoutManager;
    String[] myDataset = {"dsfsdfdfd","jdshfdsfkldsf", "dhsflkjdhflkd", "jsdhfldskhflkdf","jdshfdsfkldsf", "dhsflkjdhflkd", "jsdhfldskhflkdf","jdshfdsfkldsf", "dhsflkjdhflkd", "jsdhfldskhflkdf","jdshfdsfkldsf", "dhsflkjdhflkd", "jsdhfldskhflkdf"};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.recycler_demo_list, container, false);

        mRecyclerView = view.findViewById(R.id.my_recycler_view);

        mLayoutManager = new LinearLayoutManager(getContext());
        mRecyclerView.setLayoutManager(mLayoutManager);

        mAdapter = new MyAdapter(myDataset);
        mRecyclerView.setAdapter(mAdapter);

        return  view;
    }
}
