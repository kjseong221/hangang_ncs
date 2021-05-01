package com.example.hangang_ncs;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.text.util.Linkify;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment2 extends Fragment {
    Context context;
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment2, container, false);

        //Button 객체 picnic_gotobtn1 생성, picnic_gotobtn1의 id를 가져온다.
        Button picnic_gotobtn1 = (Button) view.findViewById(R.id.picnic_gotobtn1);

        //버튼 클릭 시 이벤트 오버라이딩
        picnic_gotobtn1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                goto_btn1(picnic_gotobtn1);
            }
        });
        return view;
    }

    //피크닉 "사이트 바로가기" 클릭 시 웹 페이지 이동 함수
    public void goto_btn1(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://startent.modoo.at/"));
        startActivity(intent);

    }
}
