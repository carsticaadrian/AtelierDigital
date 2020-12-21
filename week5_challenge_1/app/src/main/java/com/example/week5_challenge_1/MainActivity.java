package com.example.week5_challenge_1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity class","OnCreate method");

        Button button=findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(v.getContext(),secondActivity.class);
                startActivity(intent);

            }
        });


    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d("MainActivity class","Onstart method");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("MainActivity class","OnRestart method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("MainActivity class","OnStop method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("MainActivity class","OnDestroy method");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d("MainActivity class","OnPause method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("MainActivity class","OnResume method");
    }
}