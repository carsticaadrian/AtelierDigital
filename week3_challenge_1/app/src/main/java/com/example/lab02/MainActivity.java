package com.example.lab02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

import java.util.regex.Pattern;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button submit=findViewById(R.id.btn_submit);
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(validate()){
                    Toast.makeText(MainActivity.this,"Welcome",Toast.LENGTH_LONG).show();

                }
            }
        });
    }

    private boolean validate() {
        boolean valid=true;
        EditText email=findViewById(R.id.inp_email);
        EditText phone=findViewById(R.id.inp_phone);
        CheckBox terms=findViewById(R.id.chb_accept);

        if(!Patterns.EMAIL_ADDRESS.matcher(email.getText().toString()).matches()){
            email.setError("Fill the input with a valid email value!");
            valid=false;
        }
        if(!Patterns.PHONE.matcher(phone.getText().toString()).matches()){
            phone.setError("Fill the input with a valid phone number");
            valid=false;
        }
        if(!terms.isChecked()){
            valid=false;
            Toast.makeText(this,"You need to accept T&C",Toast.LENGTH_LONG).show();
        }

        return valid;


    }
}