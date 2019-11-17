package com.example.parwazeclass;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;

public class Main3Activity extends AppCompatActivity {

    ListView lview;
    ArrayList arrayList;
    ArrayAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        lview = (ListView) findViewById(R.id.lview);
        arrayList = new ArrayList ();
        arrayList.add("one");
        arrayList.add("two");
        arrayList.add("three");
        adapter = new ArrayAdapter(Main3Activity.this, android.R.layout.simple_list_item_1,  arrayList);
        lview.setAdapter(adapter);
        lview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(Main3Activity.this, "You Selected", Toast.LENGTH_SHORT).show();


            }
        });

    }
}
