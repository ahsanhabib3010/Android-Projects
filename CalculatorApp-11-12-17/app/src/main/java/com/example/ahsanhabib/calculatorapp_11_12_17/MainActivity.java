package com.example.ahsanhabib.calculatorapp_11_12_17;

import android.content.EntityIterator;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public void onAddButtonClick(View view){

        EditText et1 = (EditText)findViewById(R.id.etnum1);
        EditText et2 = (EditText)findViewById(R.id.etnum2);

        double num1 = Double.parseDouble( et1.getText().toString() );
        double num2 = Double.parseDouble( et2.getText().toString() );

        double result = (num1 + num2);

        TextView tvResult = (TextView)findViewById(R.id.tvResult);
        tvResult.setText("Addition = " +result);
    }


    public void onSubButtonClick(View view){

        EditText et1 = (EditText)findViewById(R.id.etnum1);
        EditText et2 = (EditText)findViewById(R.id.etnum2);

        double num1 = Double.parseDouble( et1.getText().toString() );
        double num2 = Double.parseDouble( et2.getText().toString() );

        double result = (num1 - num2);

        TextView tvResult = (TextView)findViewById(R.id.tvResult);
        tvResult.setText("Subtraction = " +result);
    }

    public void onMulButtonClick(View view){

        EditText et1 = (EditText)findViewById(R.id.etnum1);
        EditText et2 = (EditText)findViewById(R.id.etnum2);

        double num1 = Double.parseDouble( et1.getText().toString() );
        double num2 = Double.parseDouble( et2.getText().toString() );

        double result = (num1 * num2);

        TextView tvResult = (TextView)findViewById(R.id.tvResult);
        tvResult.setText("Multiplication = " +result);
    }

    public void onDivButtonClick(View view){

        EditText et1 = (EditText)findViewById(R.id.etnum1);
        EditText et2 = (EditText)findViewById(R.id.etnum2);

        double num1 = Double.parseDouble( et1.getText().toString() );
        double num2 = Double.parseDouble( et2.getText().toString() );

        double result = (num2 / num1);

        TextView tvResult = (TextView)findViewById(R.id.tvResult);
        tvResult.setText("Division = " +result);
    }




}
