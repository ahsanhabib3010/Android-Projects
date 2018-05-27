package com.example.ahsanhabib.sqlitedatabase_15_12_17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class DeleteEmployee extends AppCompatActivity {

    DatabaseHelper databaseHelper;
    Button btnDeleteEmp;
    EditText idNumber;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_delete_employee);

        databaseHelper = new DatabaseHelper(this);

        idNumber = (EditText)findViewById(R.id.etId);
        btnDeleteEmp = (Button)findViewById(R.id.btnDeleteEmp);

        btnDeleteEmp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

               boolean result = databaseHelper.deleteEmployee(idNumber.getText().toString());
                if (result == true){
                    Toast.makeText(DeleteEmployee.this, "Employee Delete Successfully" , Toast.LENGTH_LONG).show();
                }
                else{
                    Toast.makeText(DeleteEmployee.this, "Employee 'NOT' Deleted " , Toast.LENGTH_LONG).show();
                }
            }
        });

    }
}
