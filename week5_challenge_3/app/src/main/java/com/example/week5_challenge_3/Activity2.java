package com.example.week5_challenge_3;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView tv1=findViewById(R.id.act2_firstTv);
        tv1.setText("Message received");

        TextView tv2=findViewById(R.id.act2_secondTv);
        tv2.setText(getIntent().getStringExtra("message"));

        Intent intent=new Intent();
        EditText text=findViewById(R.id.act2_editText);

        findViewById(R.id.act2_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("message",text.getText().toString());
                intent.putExtra("reply","Yes");
                setResult(Activity.RESULT_OK,intent);
                finish();
            }
        });


    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("destroy","OnDestroy");
    }
}