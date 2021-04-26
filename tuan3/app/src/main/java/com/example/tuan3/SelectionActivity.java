package com.example.tuan3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SelectionActivity extends AppCompatActivity {

    Button btnbac,btndo,btnxanh,btnden;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.caub);
        btnbac = findViewById(R.id.btnbac);
        btnbac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectionActivity.this,greendtbac.class);
                startActivity(intent);
            }
        });
        btnden = findViewById(R.id.btnden);
        btnden.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectionActivity.this,greendtden.class);
                startActivity(intent);
            }
        });
        btnxanh = findViewById(R.id.btnxanh);
        btnxanh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectionActivity.this,greendtxanh.class);
                startActivity(intent);
            }
        });
        btndo = findViewById(R.id.btndo);
        btndo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SelectionActivity.this,greendtdo.class);
                startActivity(intent);
            }
        });
    }
}
