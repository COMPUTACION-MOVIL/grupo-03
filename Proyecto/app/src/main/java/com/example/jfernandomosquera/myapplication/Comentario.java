package com.example.jfernandomosquera.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Comentario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_comentario);
    }

    public void inicio2(View view){

        Intent ini2= new Intent(this,MainActivity.class);
        startActivity(ini2);

    }
}
