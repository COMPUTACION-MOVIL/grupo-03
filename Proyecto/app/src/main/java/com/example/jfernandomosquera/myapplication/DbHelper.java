package com.example.jfernandomosquera.myapplication;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

/**
 * Created by jfwc1 on 12/10/2016.
 */
public class DbHelper extends SQLiteOpenHelper {


    public DbHelper(Context context) {
        super(context, StatusContract.DB_NAME, null, StatusContract.DB_VERSION);
        //
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String sql = String
                .format("create table %s (%s text primary key, %s text, %s text, %s text, %s text, %s text, %s text, %s text, %s text);",
                        StatusContract.TABLE_PARQUEADERO,
                        TablaParqueadero.CODIGO,
                        TablaParqueadero.NOMBRE,
                        TablaParqueadero.LOCALIZACIONX,
                        TablaParqueadero.LOCALIZACIONY,
                        TablaParqueadero.TARIFAHORAMOTO,
                        TablaParqueadero.TARIFAHORACARRO,
                        TablaParqueadero.TARIFADIAMOTO,
                        TablaParqueadero.TARIFADIACARRO,
                        TablaParqueadero.HORARIO);

        //Sentencia para crear tabla
        Log.d("TAG", "onCreate with SQL: " + sql);
        db.execSQL(sql); //Ejecución de la sentencia

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        /* Por simplicidad se borran los datos y se crea la tabla de nuevo. Usualmente se haría un ALTER TABLE para cambiar la estructura de la base de datos sin borrar los existentes */
        /*db.execSQL("drop table if exists " + StatusContract.TABLE_USER); //Borrar tabla
        db.execSQL("drop table if exists " + StatusContract.TABLE_PLACE); //Borrar tabla
        onCreate(db);//Crear tabla de nuevo*/
        Log.d("TAG", "onUpgrade");
    }
}

/*    @Override
    public void onCreate(SQLiteDatabase db) {

        db.execSQL("CREATE TABLE" + ParqueaderosContract.ParqueaderosEntry.TABLE_NAME + " ("
                + ParqueaderosContract.ParqueaderosEntry._ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + ParqueaderosContract.ParqueaderosEntry.ID + "TEXT, "
                + ParqueaderosContract.ParqueaderosEntry.CODIGO + "TEXT, "
                + ParqueaderosContract.ParqueaderosEntry.NOMBRE + "TEXT, "
                + ParqueaderosContract.ParqueaderosEntry.LOCALIZACIONX + "TEXT, "
                + ParqueaderosContract.ParqueaderosEntry.LOCALIZACIONY + "TEXT, "
                + ParqueaderosContract.ParqueaderosEntry.TARIFAHORAMOTO + "TEXT, "
                + ParqueaderosContract.ParqueaderosEntry.TARIFAHORACARRO + "TEXT, "
                + ParqueaderosContract.ParqueaderosEntry.TARIFADIAMOTO + "TEXT, "
                + ParqueaderosContract.ParqueaderosEntry.TARIFADIACARRO + "TEXT, "
                + ParqueaderosContract.ParqueaderosEntry.HORARIO + "TEXT, "
                + "UNIQUE (" + ParqueaderosContract.ParqueaderosEntry.ID + "))");
    }
*/