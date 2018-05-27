package com.example.ahsanhabib.customlistview_25_01_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView customList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] books = {"Android","Java","Dot.NET", "C#", "HTML", "CSS", "JavaScript", "php", "MySQL", "SQL Server", "Machine Learning", "Compiler Construction"};
        ListAdapter adapter = new CustomAdapter(this, books);

        customList = (ListView)findViewById(R.id.list);
        customList.setAdapter(adapter);

        customList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String book = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this,"You Clicked on Custom " + book +" !!! ",Toast.LENGTH_SHORT).show();
            }
        });

    }
}
