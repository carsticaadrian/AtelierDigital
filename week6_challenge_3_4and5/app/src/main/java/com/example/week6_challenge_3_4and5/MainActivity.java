package com.example.week6_challenge_3_4and5;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements Listener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Bundle bundle = new Bundle();
        bundle.putString("label", "Data transfer through bundle");
        bundleFragment fragment = new bundleFragment();
        fragment.setArguments(bundle);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.frame, fragment, bundleFragment.class.getSimpleName())
                .commit();

        getSupportFragmentManager().beginTransaction()
                .add(R.id.frame1,new methodFragment(),methodFragment.class.getSimpleName())
                .commit();

        listenerFragment fragment1=new listenerFragment();
        fragment1.setListener(this);

        getSupportFragmentManager().beginTransaction()
                .add(R.id.frame2,fragment1,listenerFragment.class.getSimpleName())
                .commit();

    }

    protected void onStart() {
        super.onStart();

        methodFragment fragment =
                (methodFragment) getSupportFragmentManager().findFragmentByTag(methodFragment.class.getSimpleName());
        fragment.setLabel("Data transfer through method");
    }

    @Override
    public void theseAreTheStrings(String string1, String string2) {
        Toast.makeText(this, string1 + " " + string2,Toast.LENGTH_LONG).show();

    }
}