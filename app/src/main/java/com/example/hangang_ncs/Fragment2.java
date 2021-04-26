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

public class Fragment2 extends Fragment implements View.OnClickListener {
    Context context;
    private View view;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment2, container, false);

        Button picnicbutton1 = (Button)view.findViewById(R.id.picnic_button1);
        picnicbutton1.setOnClickListener(this);

        return view;
    }

    @Override
    public void onClick(View v) {
        Toast.makeText(getContext(),"피크닉 사이트 이동",Toast.LENGTH_SHORT).show();
    }

    public void onButton1(View view){
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("www.naver.com"));
        startActivity(intent);
    }
}
