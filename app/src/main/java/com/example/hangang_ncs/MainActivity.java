package com.example.hangang_ncs;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView; // 바텀 네비게이션 뷰
    private FragmentManager fm;
    private FragmentTransaction ft;
    private Fragment1 fragment1;
    private Fragment2 fragment2;
    private Fragment3 fragment3;
    private Fragment4 fragment4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView = findViewById(R.id.bottom_nav);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()) {
                    case R.id.icon_food:
                        setFrag(0);
                        break;
                    case R.id.icon_picnic:
                        setFrag(1);
                        break;

                    case R.id.icon_bicycle:
                        setFrag(2);
                        break;

                    case R.id.icon_community:
                        setFrag(3);
                        break;

                }
                return true;
            }
        });
        fragment1 = new Fragment1();
        fragment2 = new Fragment2();
        fragment3 = new Fragment3();
        fragment4 = new Fragment4();
        setFrag(0); //첫 프래그먼트 화면 지정

    }

    // 프래그먼트 교체가 일어나는 실행문
    private void setFrag(int n) {
        fm = getSupportFragmentManager();
        ft = fm.beginTransaction();

        switch (n) {
            case 0:
                ft.replace(R.id.main_frame, fragment1);
                ft.commit();
                break;
            case 1:
                ft.replace(R.id.main_frame, fragment2);
                ft.commit();
                break;

            case 2:
                ft.replace(R.id.main_frame, fragment3);
                ft.commit();
                break;

            case 3:
                ft.replace(R.id.main_frame, fragment4);
                ft.commit();
                break;

        }
    }
}