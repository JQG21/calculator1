package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class activity_2 extends AppCompatActivity {
    Button bt_km,bt_m,bt_dm,bt_cm,bt_mm,bt_km3,bt_m3,bt_dm3,bt_cm3,bt_mm3,bt_ten,bt_two,bt_eight,bt_f;
    EditText input1,input2,input3,result1,result2,result3;


    String string;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

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

        input1 = findViewById(R.id.input1);
        input2 = findViewById(R.id.input2);
        input3 = findViewById(R.id.input3);
        result1 = findViewById(R.id.result1);
        result2 = findViewById(R.id.result2);
        result3 = findViewById(R.id.result3);

        bt_km.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = input1.getText().toString();
                result1.setText(km(string));
            }
        });
        bt_m.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = input1.getText().toString();
                result1.setText(m(string));
            }
        });
        bt_dm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = input1.getText().toString();
                result1.setText(dm(string));
            }
        });
        bt_cm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = input1.getText().toString();
                result1.setText(cm(string));
            }
        });
        bt_mm.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = input1.getText().toString();
                result1.setText(mm(string));
            }
        });
        bt_km3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = input2.getText().toString();
                result2.setText(km3(string));
            }
        });
        bt_m3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = input2.getText().toString();
                result2.setText(m3(string));
            }
        });
        bt_dm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = input2.getText().toString();
                result2.setText(dm3(string));
            }
        });
        bt_cm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = input2.getText().toString();
                result2.setText(cm3(string));
            }
        });
        bt_mm3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                string = input2.getText().toString();
                result2.setText(mm3(string));
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
    public String km(String str){
        double r = Double.parseDouble(str);
        string = r*1000+"m "+r*10000+"dm "+r*100000+"cm3 "+r*Math.pow(10,6)+"mm";
        return string;
    }
    public String m(String str){
        double r = Double.parseDouble(str);
        string = r/1000+"km "+r*10+"dm "+r*100+"cm3 "+r*1000+"mm";
        return string;
    }
    public String dm(String str){
        double r = Double.parseDouble(str);
        string = r/10000+"km "+r/10+"m "+r*10+"cm "+r*100+"mm";
        return string;
    }
    public String cm(String str){
        double r = Double.parseDouble(str);
        string = r/100000+"km "+r/100+"m "+r/10+"dm "+r*10+"mm";
        return string;
    }
    public String mm(String str){
        double r = Double.parseDouble(str);
        string = r/Math.pow(10,6)+"km "+r/1000+"m "+r/100+"dm "+r/10+"cm";
        return string;
    }
    public String km3(String str){
        double r = Double.parseDouble(str);
        string = r*Math.pow(10,9)+"m3 "+r*Math.pow(10,12)+"dm "+r*Math.pow(10,15)+"cm3 "+r*Math.pow(10,18)+"mm";
        return string;
    }
    public String m3(String str){
        double r = Double.parseDouble(str);
        string = r/Math.pow(10,9)+"km3 "+r*Math.pow(10,3)+"dm "+r*Math.pow(10,6)+"cm3 "+r*Math.pow(10,9)+"mm";
        return string;
    }
    public String dm3(String str){
        double r = Double.parseDouble(str);
        string = r/Math.pow(10,12)+"km3 "+r/Math.pow(10,3)+"m "+r*Math.pow(10,3)+"cm3 "+r*Math.pow(10,6)+"mm";
        return string;
    }
    public String cm3(String str){
        double r = Double.parseDouble(str);
        string = r/Math.pow(10,15)+"km3 "+r/Math.pow(10,6)+"m "+r/Math.pow(10,3)+"dm3 "+r*Math.pow(10,9)+"mm";
        return string;
    }
    public String mm3(String str){
        double r = Double.parseDouble(str);
        string = r/Math.pow(10,18)+"km3 "+r/Math.pow(10,9)+"m "+r/Math.pow(10,6)+"dm3 "+r/Math.pow(10,3)+"mm";
        return string;
    }
    }