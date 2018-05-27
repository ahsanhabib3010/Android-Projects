package com.example.ahsanhabib.listview_24_01_18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView ahsanList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] books = {"Android", "Java", "HTML", "CSS", "JavaScript", "C#", "DOT.NET", "php", "ASP.NET", "C++", "Machine Learning",
                            "Compiler Construction", "Database Management System"};
        ahsanList = (ListView)findViewById(R.id.list);
        ListAdapter adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, books);
        ahsanList.setAdapter(adapter);

        ahsanList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String book = String.valueOf(parent.getItemAtPosition(position));
                Toast.makeText(MainActivity.this,"You Clicked " + book + " ! ! !", Toast.LENGTH_SHORT).show();
            }
        });


    }
}
