package com.example.ahsanhabib.sqlitedatabase_15_12_17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class ViewEmployee extends AppCompatActivity {

    DatabaseHelper databaseHelper;
    Button btnGetdata;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_employee);

        databaseHelper = new DatabaseHelper(this);

        btnGetdata = (Button)findViewById(R.id.btnGetData);

//        btnGetdata.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });

    }





}
