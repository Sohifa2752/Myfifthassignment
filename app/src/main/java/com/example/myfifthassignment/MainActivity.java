package com.example.myfifthassignment;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        recyclerView =(RecyclerView) findViewById(R.id.recyclerview);
        List<Item>items = new ArrayList<Item>();
        items.add(new Item("Jhon Wick", "wick@email.com",R.drawable.a));
        items.add(new Item("Milan","milan@email.com",R.drawable.b));
        items.add(new Item("Christe","chris@email.com",R.drawable.c) );
        items.add(new Item("Andrew","andrew@email.com",R.drawable.d));
        items.add(new Item("Amstrong","strong@email.com",R.drawable.f));
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(new MyAdapter(getApplicationContext(),items));
    }
}