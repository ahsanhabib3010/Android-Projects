package com.example.ahsanhabib.sharedpreferences_8_12_17;

import android.content.Context;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button btnSave, btnRead;
    EditText etName, etEmail, etContact;
    TextView tvName,tvEmail,tvContact;

    SharedPreferences sharedPreferences;

    public static final String MYFILE = "MyPreferences";
    public static final String NAME = "Name Key";
    public static final String EMAIL = "Email Key";
    public static final String CONTACT = "Contact Key";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSave = (Button)findViewById(R.id.btnSave);
        btnRead = (Button)findViewById(R.id.btnRead);
        etName = (EditText) findViewById(R.id.etName);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etContact = (EditText) findViewById(R.id.etContact);

        tvName = (TextView)findViewById(R.id.tvName);
        tvEmail = (TextView)findViewById(R.id.tvEmail);
        tvContact = (TextView)findViewById(R.id.tvContact);

        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                String name = etName.getText().toString();
                String email = etEmail.getText().toString();
                String contact = etContact.getText().toString();

                sharedPreferences = getSharedPreferences(MYFILE, Context.MODE_PRIVATE);
                SharedPreferences.Editor editor = sharedPreferences.edit();

                editor.putString(NAME, name);
                editor.putString(EMAIL, email);
                editor.putString(CONTACT, contact);

               // editor.apply();
                editor.commit();

                Toast.makeText(MainActivity.this,"Your details are saved !",Toast.LENGTH_LONG).show();
            }
        });


        btnRead.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sharedPreferences = getSharedPreferences(MYFILE,Context.MODE_PRIVATE);

                String name = NAME;
                String email = EMAIL;
                String contact = CONTACT;

                String NAME = sharedPreferences.getString("NAME",name);
                String EMAIL = sharedPreferences.getString("EMAIL",email);
                String CONTACT = sharedPreferences.getString("CONTACT", contact);

                tvName.setText("Name: " +NAME);
                tvEmail.setText("Email: " +EMAIL);
                tvContact.setText("Contact no.: " +CONTACT);

                Toast.makeText(MainActivity.this,"Data displayed succssfully...!!!",Toast.LENGTH_LONG).show();

            }
        });
    }

}
