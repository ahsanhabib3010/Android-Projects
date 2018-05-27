package com.example.ahsanhabib.progresscircle_6_12_17;

import android.app.ProgressDialog;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnSave;
    private ProgressDialog progressBar;
    private int progressBarStatus = 0;
    private Handler progressBarHandler = new Handler();
    private long fileSize = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnSave = (Button)findViewById(R.id.btnSave);
        btnSave.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                progressBar = new ProgressDialog(view.getContext());
                progressBar.setCancelable(true);
                progressBar.setTitle("Downloading...");
                progressBar.setMessage("Downloading starts  " +progressBar.getMax());
                progressBar.setProgressStyle(ProgressDialog.STYLE_SPINNER);
                progressBar.setProgress(0);
                progressBar.setMax(100);
                progressBar.show();
                progressBarStatus = 0;
                fileSize = 0;

                new Thread(new Runnable() {
                    @Override
                    public void run() {
                       while(progressBarStatus < 100){
                           progressBarStatus = downloadFile();

                           try{
                               Thread.sleep(1000);
                           }
                           catch (InterruptedException e){
                               e.printStackTrace();
                           }

                           progressBarHandler.post(new Runnable() {
                               @Override
                               public void run() {
                                   progressBar.setProgress(progressBarStatus);
                               }
                           });
                       }

                       if(progressBarStatus >= 100){
                           try{
                               Thread.sleep(2000);
                           }
                           catch (InterruptedException e){
                               e.printStackTrace();
                           }
                           progressBar.dismiss();
                       }
                    }
                }).start();



            }
        });
    }


    public int downloadFile(){
        while (fileSize <= 1000000){
            fileSize++;

            if (fileSize == 100000){
                return 10;
            }
            else if (fileSize == 200000){
                return 20;
            }
            else if(fileSize == 300000){
                return 30;
            }
            else if (fileSize == 400000){
                return 40;
            }
            else if(fileSize == 500000){
                return 50;
            }
            else if (fileSize == 800000){
                return 80;
            }
        }
        return 100;
    }

}
