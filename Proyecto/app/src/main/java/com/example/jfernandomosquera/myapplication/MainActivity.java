package com.example.jfernandomosquera.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);






    }

   public void onclic_regis(View view){

       Intent regis= new Intent(this,Reg_par.class);
       startActivity(regis);

   }


    public void coment(View view){

        Intent comenta= new Intent(this,Comentario.class);
        startActivity(comenta);

    }

}
