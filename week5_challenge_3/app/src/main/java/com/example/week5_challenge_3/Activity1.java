package com.example.week5_challenge_3;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Activity1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Intent intent=new Intent(this,Activity2.class);
        EditText text=findViewById(R.id.act1_editText);

        findViewById(R.id.act1_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent.putExtra("message",text.getText().toString());
                startActivityForResult(intent,2000);
            }
        });

    }
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);
        TextView tv1=findViewById(R.id.act1_firstTv);
        TextView tv2=findViewById(R.id.act1_secondTv);
        if (requestCode == 2000 && resultCode == Activity.RESULT_OK) {
            if (data != null) {
                String result = data.getStringExtra("message");
                tv1.setText("Reply received");
                tv2.setText(result);

            }
        }
    }
}