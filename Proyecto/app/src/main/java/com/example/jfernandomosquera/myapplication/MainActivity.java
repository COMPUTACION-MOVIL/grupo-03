package com.example.jfernandomosquera.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends AppCompatActivity{

    ImageButton btnParqueadero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnParqueadero = (ImageButton)findViewById(R.id.imageButton);

        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        Fragment fragment = new PricipalFragment();
        ft.add(R.id.container, fragment);
        ft.commit();


    }

   public void onclic_regis(View view){

       Intent regis= new Intent(this,Reg_par.class);
       startActivity(regis);

   }


    public void coment(View view){

        Intent comenta= new Intent(this,Comentario.class);
        startActivity(comenta);

    }


    public void onClickImagen(View v) {
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        Fragment fragment = new ParkFragment();
        ft.replace(R.id.container, fragment);
        ft.commit();

    }

    public void inicio(View view){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction ft = fragmentManager.beginTransaction();
        Fragment fragment = new PricipalFragment();
        ft.replace(R.id.container, fragment);
        ft.commit();
    }
}
