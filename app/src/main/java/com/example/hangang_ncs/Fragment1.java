package com.example.hangang_ncs;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.GridView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import java.util.List;

public class Fragment1 extends Fragment {
    Context context;

    private View view;

    GridView gridView; //이미지를 위한 그리드 뷰

    //가게 사진
    String[] values = {
            "한강주변맛집", "한강주변맛집", "한강주변맛집", "한강주변맛집", "한강주변맛집", "한강주변맛집",
            "한강주변맛집", "한강주변맛집", "한강주변맛집", "한강주변맛집", "한강주변맛집", "한강주변맛집",
    };
    //가게 이름
    int[] images = {
            R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f,
            R.drawable.a, R.drawable.b, R.drawable.c, R.drawable.d, R.drawable.e, R.drawable.f,
    };

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment1, container, false);
        ;

        context = container.getContext();

        //GridVuew (이미지)
        gridView = (GridView) view.findViewById(R.id.gridview);
        GridAdapter gridAdapter = new GridAdapter(context, values, images);
        gridView.setAdapter(gridAdapter);

        //fragment1의 id "mangoplate_info"를 가져와, Textview 객체 mangoplate_info 생성
        TextView mangoplate_info = (TextView) view.findViewById(R.id.food_mangoplate_info);

        //id, mangoplate_info를 클릭 시 망고플레이트 함수 출력(오버라이딩)
        mangoplate_info.setOnClickListener(new TextView.OnClickListener() {
            @Override
            public void onClick(View view) {
                goto_mangoplate(mangoplate_info);
            }
        });

        return view;

    }

    //"한강 공원 주변 맛집, Mangoplate" TextView 클릭 시 "망고플레이트 한강 추천 맛집" 사이트로 이동하는 함수
    public void goto_mangoplate(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.mangoplate.com/mango_picks/1601"));
        startActivity(intent);

    }
}
