package com.example.ahsanhabib.firebaseauthentication_10_01_18;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class SignUp extends AppCompatActivity {

    Button btnReg;
    EditText email , password;
    FirebaseAuth firebaseAuth;
    private ProgressBar progressBar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        email = (EditText)findViewById(R.id.txtEmail);
        password = (EditText)findViewById(R.id.txtPassword);
        btnReg = (Button)findViewById(R.id.btnRegister);
        firebaseAuth = FirebaseAuth.getInstance();

        progressBar = (ProgressBar)findViewById(R.id.progressBar3);
        progressBar.setVisibility(View.GONE);
    }
    public void onRegisterBtnClick(View v){
        progressBar.setVisibility(View.VISIBLE);

        btnReg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                progressBar.setVisibility(View.VISIBLE);
                (firebaseAuth.createUserWithEmailAndPassword(email.getText().toString(), password.getText().toString())).addOnCompleteListener(new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                 //       pd.dismiss();

                        if (task.isSuccessful()){
                            progressBar.setVisibility(View.GONE);
                            Toast.makeText(SignUp.this,"User Register Successfull..!!!" , Toast.LENGTH_LONG).show();
                            Intent mainIntent = new Intent(SignUp.this, MainActivity.class);
                            startActivity(mainIntent);
                        }
                        else {
                            progressBar.setVisibility(View.GONE);
                            Log.e("Error", task.getException().toString());
                            Toast.makeText(SignUp.this, task.getException().getMessage(),Toast.LENGTH_LONG).show();
                        }
                    }
                });
            }
        });
    }


}
