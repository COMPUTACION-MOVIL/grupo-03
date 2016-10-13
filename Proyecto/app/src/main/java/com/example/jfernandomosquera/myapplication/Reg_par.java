package com.example.jfernandomosquera.myapplication;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Reg_par extends AppCompatActivity {

    private EditText codigo,nombre,localizacionX,localizacionY,horario,motoHora;
    private EditText carroHora,diaMoto,diaCarro;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reg_par);

        codigo=(EditText)findViewById(R.id.editCodigo);
        nombre=(EditText)findViewById(R.id.editNombrepar);
        localizacionX=(EditText)findViewById(R.id.editLocalizacionX);
        localizacionY=(EditText)findViewById(R.id.editLocalizacionY);
        horario=(EditText)findViewById(R.id.editHorario);
        motoHora=(EditText)findViewById(R.id.editHoraM);
        carroHora=(EditText)findViewById(R.id.editHoraC);
        diaMoto=(EditText)findViewById(R.id.editValorDiaM);
        diaCarro=(EditText)findViewById(R.id.editValorDiaC);



    }

    public void registrar(View view){

        DbHelper dbHelper = new DbHelper(this); //Instancia de DbHelper
        SQLiteDatabase db = dbHelper.getWritableDatabase(); //Obtener instancia de la BD


        ContentValues values = new ContentValues();
        values.put(TablaParqueadero.CODIGO,codigo.getText().toString()); //Se pasan pares nombre-valor
        values.put(TablaParqueadero.NOMBRE,nombre.getText().toString());
        values.put(TablaParqueadero.LOCALIZACIONX,localizacionX.getText().toString());
        values.put(TablaParqueadero.LOCALIZACIONY,localizacionY.getText().toString());
        values.put(TablaParqueadero.TARIFAHORAMOTO,motoHora.getText().toString());
        values.put(TablaParqueadero.TARIFAHORACARRO,carroHora.getText().toString());
        values.put(TablaParqueadero.TARIFADIAMOTO,diaMoto.getText().toString());
        values.put(TablaParqueadero.TARIFADIACARRO,diaCarro.getText().toString());
        values.put(TablaParqueadero.HORARIO,horario.getText().toString());



        db.insertWithOnConflict(StatusContract.TABLE_PARQUEADERO, null, values,
                SQLiteDatabase.CONFLICT_IGNORE); //Se guarda la fila en la base de datos*/
        Toast.makeText(getApplicationContext(),"INSERTADO",Toast.LENGTH_SHORT).show();
        db.close();





        codigo.setText("");
        nombre.setText("");
        localizacionX.setText("");
        localizacionY.setText("");
        motoHora.setText("");
        carroHora.setText("");
        diaMoto.setText("");
        diaCarro.setText("");
        horario.setText("");
    }


    public void inicio(View view){

        Intent ini= new Intent(this,MainActivity.class);
        startActivity(ini);

    }
}
