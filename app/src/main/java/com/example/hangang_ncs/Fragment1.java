package com.example.hangang_ncs;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.GridView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment1 extends Fragment {
    Context context;

    private View view;

    GridView gridView; //이미지를 위한 그리드 뷰

    //가게 사진
    String[] values = {

    };
    //가게 이름
    int[] images = {

    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment1, container, false);

        context = container.getContext();

        //GridVuew (이미지)
        gridView = (GridView) view.findViewById(R.id.gridview);
        GridAdapter gridAdapter = new GridAdapter(context, values, images);
        gridView.setAdapter(gridAdapter);

        return view;
    }
}
