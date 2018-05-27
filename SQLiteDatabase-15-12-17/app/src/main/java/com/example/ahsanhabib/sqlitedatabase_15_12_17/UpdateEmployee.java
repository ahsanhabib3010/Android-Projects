package com.example.ahsanhabib.sqlitedatabase_15_12_17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class UpdateEmployee extends AppCompatActivity {


    DatabaseHelper databaseHelper;
    Button updateEmployee;
    EditText etName, etMobile, etEmail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update_employee);

        databaseHelper = new DatabaseHelper(this);

        etName = (EditText)findViewById(R.id.etName);
        etMobile = (EditText)findViewById(R.id.etMobile);
        etEmail = (EditText)findViewById(R.id.etEmail);

        updateEmployee = (Button)findViewById(R.id.btnUpdateEmp);

        updateEmployee.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               boolean isUpdate = databaseHelper.updateEmployee(etName.getText().toString(),etMobile.getText().toString(),etEmail.getText().toString());

                if (isUpdate == true){
                    Toast.makeText(UpdateEmployee.this, "Update Successfully ", Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(UpdateEmployee.this, "Update 'NOT' Successful", Toast.LENGTH_LONG).show();
                }
            }
        });



    }






}
