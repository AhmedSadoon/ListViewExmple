package com.example.listviewexmple;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    ListView listView;
    ArrayAdapter<String> adapter;
    String[] hotel={"one room","two room","three rooms","four rooms","suite","privet room"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=findViewById(R.id.list_view);
        adapter=new ArrayAdapter<String>(R.layout.list_view_custom_layout,R.id.list_item,hotel);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                //Toast.makeText(getBaseContext(),parent.getItemIdAtPosition(position)+"is selected",Toast.LENGTH_SHORT).show();
                Toast.makeText(getBaseContext(),adapter.getItem(position)+"is selected",Toast.LENGTH_SHORT).show();
                view.setSelected(true);
            }
        });
    }
}
