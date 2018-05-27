package com.example.ahsanhabib.calculationapp_11_12_17;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //Button calculatebtn;
    EditText amount, percent;
    TextView tvResult;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onCalculateButtonClick(View view){

        amount = (EditText)findViewById(R.id.amount);
        percent = (EditText)findViewById(R.id.percent);

        if (amount.getText().toString().equals(""))
            Toast.makeText(MainActivity.this,"Enter Amount", Toast.LENGTH_LONG).show();

        else if(percent.getText().toString().equals(""))
            Toast.makeText(MainActivity.this,"Enter Percent", Toast.LENGTH_LONG).show();
        else {

            double amounttxt = Double.parseDouble(amount.getText().toString());
            double percenttxt = Double.parseDouble(percent.getText().toString());

            double result = (amounttxt * percenttxt);

            tvResult = (TextView) findViewById(R.id.tvResult);
            tvResult.setText("Calculated Result = " + result);
        }
    }

}
