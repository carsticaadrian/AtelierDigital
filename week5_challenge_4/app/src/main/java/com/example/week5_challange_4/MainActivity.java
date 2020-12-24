package com.example.week5_challange_4;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;

import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;
import static android.Manifest.permission.CALL_PHONE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText url=findViewById(R.id.txt_url);
        EditText location=findViewById(R.id.txt_location);
        EditText share=findViewById(R.id.txt_share);
        EditText call=findViewById(R.id.txt_call);

        findViewById(R.id.btn_website).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent webIntent=new Intent(Intent.ACTION_VIEW);
                webIntent.setData(Uri.parse(url.getText().toString()));
                startActivity(webIntent);
            }
        });

        findViewById(R.id.btn_location).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent locationIntent=new Intent(Intent.ACTION_VIEW);
                String slocation=location.getText().toString();
                locationIntent.setData(Uri.parse ("geo:0,0?q=" + slocation));
                if (locationIntent.resolveActivity(getPackageManager()) != null) {
                    startActivity(locationIntent);
                }

            }
        });

        findViewById(R.id.btn_share).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shareIntent=new Intent(Intent.ACTION_SEND);
                shareIntent.setType("text/plain");
                shareIntent.putExtra(Intent.EXTRA_TEXT,share.getText().toString());
                startActivity(Intent.createChooser(shareIntent ,"Share"));
            }
        });

        findViewById(R.id.btn_call).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent callItent =new Intent(Intent.ACTION_CALL);
                callItent.setData(Uri.parse("tel:"+call.getText().toString()));
                if (ContextCompat.checkSelfPermission(getApplicationContext(), CALL_PHONE) == PackageManager.PERMISSION_GRANTED) {
                    startActivity(callItent);
                } else {
                    requestPermissions(new String[]{CALL_PHONE}, 1);
                }
            }
        });
    }
}