package com.example.ahsanhabib.sqlitedatabase_15_12_17;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    DatabaseHelper databaseHelper ;
    Button addEmp, searchEmp, updateEmp, deleteEmp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //databaseHelper = new DatabaseHelper(this);

        // Going to Intent of Employee
        addEmp = (Button)findViewById(R.id.btnAddEmployee);

        addEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent addEmployeeIntent = new Intent(MainActivity.this, AddEmployee.class);
                startActivity(addEmployeeIntent);
            }
        });

        //Going to Intent of Update Employee
        updateEmp = (Button)findViewById(R.id.btnUpdateEmployee);

        updateEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent updateEmployeeIntent = new Intent(MainActivity.this, UpdateEmployee.class);
                startActivity(updateEmployeeIntent);
            }
        });

    }
}
