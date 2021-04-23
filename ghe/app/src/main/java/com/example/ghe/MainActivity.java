package com.example.ghe;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    ArrayList<ghe> gheArrayList;
    AdapterGhe adapterGhe;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=findViewById(R.id.rcvname);
        gheArrayList= new ArrayList<>();
        gheArrayList.add(new ghe(R.drawable.ghecam,R.drawable.ghedo,
                "ghe cam","35$","ghe do","20$"));
        gheArrayList.add(new ghe(R.drawable.ghehong,R.drawable.ghevang,
                "ghe cam","35$","ghe do","20$"));
        gheArrayList.add(new ghe(R.drawable.ghedo,R.drawable.ghehong,
                "ghe cam","35$","ghe do","20$"));

        adapterGhe= new AdapterGhe(this,gheArrayList);
        recyclerView.setAdapter(adapterGhe);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
