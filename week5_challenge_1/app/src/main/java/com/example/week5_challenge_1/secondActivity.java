package com.example.week5_challenge_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class secondActivity extends AppCompatActivity {

    public secondActivity() {
        super();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Log.d("SecondActivity class","OnCreate method");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("SecondActivity class","OnStart method");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("SecondActivity class","OnRestart method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("SecondActivity class","OnStop method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("SecondActivity class","OnDestroy method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("SecondActivity class","OnPause method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("SecondActivity class","OnResume method");
    }
}