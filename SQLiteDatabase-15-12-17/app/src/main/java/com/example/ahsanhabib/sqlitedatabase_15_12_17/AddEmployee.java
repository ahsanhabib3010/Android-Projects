package com.example.ahsanhabib.sqlitedatabase_15_12_17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class AddEmployee extends AppCompatActivity {

    DatabaseHelper databaseHelper;
    EditText etName, etMobile, etEmail;
    Button btnAddEmployee;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_employee);

        databaseHelper = new DatabaseHelper(this);

        etName = (EditText)findViewById(R.id.etName);
        etMobile = (EditText)findViewById(R.id.etMobile);
        etEmail = (EditText)findViewById(R.id.etEmail);

        btnAddEmployee = (Button)findViewById(R.id.btnInsertEmployee);


        // Inserting Employee to SQLite Database
        btnAddEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                boolean result = databaseHelper.insertEmployee(etName.getText().toString(),Integer.parseInt(etMobile.getText().toString()), etEmail.getText().toString());

                if (result){
                    Toast.makeText(AddEmployee.this, "Employee Inserted Successfully", Toast.LENGTH_LONG ).show();
                }
                else {
                    Toast.makeText(AddEmployee.this, "Employee 'NOT' Inserted", Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
