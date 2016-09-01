package com.example.jfernandomosquera.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Reg_par extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_par);




    }

    public void inicio(View view){

        Intent ini= new Intent(this,MainActivity.class);
        startActivity(ini);

    }
}
