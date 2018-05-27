package com.example.ahsanhabib.alertdialogbox_29_11_17;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onLoginBtnClick(View view){

        AlertDialog.Builder alertbuilder = new AlertDialog.Builder(this);

        alertbuilder.setTitle("Warning!");
        alertbuilder.setMessage("Are you sure to Login?");


        alertbuilder.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(MainActivity.this, "You clicked 'Yes' Button", Toast.LENGTH_LONG).show();
            }
        });

        alertbuilder.setNegativeButton("No", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int i) {
                Toast.makeText(MainActivity.this,"You clicked 'No' Button", Toast.LENGTH_LONG).show();
            }
        });

        AlertDialog alertDialog = alertbuilder.create();
        alertDialog.show();

    }



}
