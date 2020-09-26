package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activity_2 extends AppCompatActivity {

    StringBuilder input;

    Button bt_km,bt_m,bt_dm,bt_cm,bt_mm,bt_km3,bt_m3,bt_dm3,bt_cm3,bt_mm3,bt_ten,bt_two,bt_eight,bt_f;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        input = new StringBuilder();

        bt_km = findViewById(R.id.km);
        bt_m = findViewById(R.id.m);
        bt_dm = findViewById(R.id.dm);
        bt_cm = findViewById(R.id.cm);
        bt_mm = findViewById(R.id.mm);
        bt_km3 = findViewById(R.id.km3);
        bt_m3 = findViewById(R.id.m3);
        bt_dm3 = findViewById(R.id.dm3);
        bt_cm3 = findViewById(R.id.cm3);
        bt_mm3 = findViewById(R.id.mm3);
        bt_ten = findViewById(R.id.ten_scale);
        bt_two = findViewById(R.id.two_scale);
        bt_eight = findViewById(R.id.eight_scale);
        bt_f = findViewById(R.id.f_scale);

        bt_km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        bt_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        bt_dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        bt_cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        bt_mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        bt_km3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        bt_m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        bt_dm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        bt_cm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        bt_mm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        bt_ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        bt_two.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        bt_eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });
        bt_f.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });


    }
}