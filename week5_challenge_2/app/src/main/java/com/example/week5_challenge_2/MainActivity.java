package com.example.week5_challenge_2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Intent intent=new Intent(this,secondActivity.class);

        findViewById(R.id.textOne).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("text",getResources().getString(R.string.text_one));
                startActivity(intent);


            }
        });

        findViewById(R.id.textTwo).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("text",getResources().getString(R.string.text_two));
                startActivity(intent);

            }
        });

        findViewById(R.id.textThree).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("text",getResources().getString(R.string.text_three));
                startActivity(intent);

            }
        });
    }
}