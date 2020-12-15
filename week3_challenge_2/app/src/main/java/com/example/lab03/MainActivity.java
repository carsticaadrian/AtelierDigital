package com.example.lab03;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private Spinner mSpinner;
    private List<String> mDataSource;
    private ArrayAdapter<String> mArrayAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_spinner);
        mSpinner=findViewById(R.id.spinner);
        mDataSource=getData();
        mArrayAdapter=getAdapter();

        mSpinner.setAdapter(mArrayAdapter);

        mSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
                String selectedItem = mArrayAdapter.getItem(position);
                Toast.makeText(MainActivity.this, "Selected: "+selectedItem, Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> parent) {

            }
        });
    }

    private List<String> getData(){
        List<String> prajituri=new ArrayList<String>();
        prajituri.add("Cupcake");
        prajituri.add("Donut");
        prajituri.add("Eclair");
        prajituri.add("KitKat");
        prajituri.add("Pie");
        return prajituri;
    }
    private ArrayAdapter<String> getAdapter(){
        return new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,getData());
    }
}