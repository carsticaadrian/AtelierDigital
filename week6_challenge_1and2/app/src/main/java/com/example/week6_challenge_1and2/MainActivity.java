package com.example.week6_challenge_1and2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        FragmentTransaction ft=getSupportFragmentManager().beginTransaction();
        ft.replace(R.id.placeHolder,new SecondFrament());
        ft.commit();
    }
}