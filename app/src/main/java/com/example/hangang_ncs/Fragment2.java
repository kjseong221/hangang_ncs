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
        Button picnic_gotobtn1 = (Button) view.findViewById(R.id.picnic_gotobtn1); //갑자기피크닉
        Button picnic_gotobtn2 = (Button) view.findViewById(R.id.picnic_gotobtn2); //써니텐트
        Button picnic_gotobtn3 = (Button) view.findViewById(R.id.picnic_gotobtn3); //별빛텐트
        Button picnic_gotobtn4 = (Button) view.findViewById(R.id.picnic_gotobtn4); //스마일피크닉
        Button picnic_gotobtn5 = (Button) view.findViewById(R.id.picnic_gotobtn5); //한강에피크닉
        Button picnic_gotobtn6 = (Button) view.findViewById(R.id.picnic_gotobtn6); //피크닉109

        //피크닉 바로가기, 갑자기피크닉
        picnic_gotobtn1.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                goto_suddenly_picnic(picnic_gotobtn1);
            }
        });
        //피크닉 바로가기, 써니텐트
        picnic_gotobtn2.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                goto_ssuny_picnic(picnic_gotobtn2);
            }
        });
        //피크닉 바로가기, 별빛텐트
        picnic_gotobtn3.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                goto_starlight_picnic(picnic_gotobtn3);
            }
        });
        //피크닉 바로가기, 스마일피크닉
       picnic_gotobtn4.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                goto_smile_picnic(picnic_gotobtn4);
            }
        });
        //피크닉 바로가기, 한강에피크닉
        picnic_gotobtn5.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                goto_hangang_picnic(picnic_gotobtn5);
            }
        });
        //피크닉 바로가기, 피크닉109
        picnic_gotobtn6.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View view) {
                goto_109_picnic(picnic_gotobtn6);
            }
        });

        return view;
    }

    //갑자기피크닉 홈페이지 이동 함수, 피크닉 "사이트 바로가기" 클릭 시 웹 페이지 이동 함수
    public void goto_suddenly_picnic(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://suddenpicnic.modoo.at/?link=9rarbcrt"));
        startActivity(intent);
    }

    //써니텐트 홈페이지 이동 함수, 피크닉 "사이트 바로가기" 클릭 시 웹 페이지 이동 함수
    public void goto_ssuny_picnic(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://sunnytent.modoo.at/"));
        startActivity(intent);
    }

    //별빛텐트 홈페이지 이동 함수, 피크닉 "사이트 바로가기" 클릭 시 웹 페이지 이동 함수
    public void goto_starlight_picnic(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://startent.modoo.at/"));
        startActivity(intent);
    }

    //별빛텐트 홈페이지 이동 함수, 피크닉 "사이트 바로가기" 클릭 시 웹 페이지 이동 함수
    public void goto_smile_picnic(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://smiletent.modoo.at/"));
        startActivity(intent);
    }

    //한강에피크닉 홈페이지 이동 함수, 피크닉 "사이트 바로가기" 클릭 시 웹 페이지 이동 함수
    public void goto_hangang_picnic(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://hangang-picnic.com/"));
        startActivity(intent);
    }

    //한강에피크닉 홈페이지 이동 함수, 피크닉 "사이트 바로가기" 클릭 시 웹 페이지 이동 함수
    public void goto_109_picnic(View view) {
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://picnic109.modoo.at/"));
        startActivity(intent);
    }
}
