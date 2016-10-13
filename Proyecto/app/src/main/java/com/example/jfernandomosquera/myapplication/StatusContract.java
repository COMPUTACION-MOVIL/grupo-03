package com.example.jfernandomosquera.myapplication;

import android.provider.BaseColumns;

/**
 * Created by jfwc1 on 12/10/2016.
 */
public class StatusContract {

    public static final String DB_NAME = "Todosparqueaderos.db"; //Nombre de la DB
    public static final int DB_VERSION = 1; //Versión de la DB
    public static final String TABLE_PARQUEADERO = "TablaParqueadero"; //Nombre de la tabla

    public class TablaParqueadero {

        public static final String CODIGO = BaseColumns._ID;
        public static final String NOMBRE = "nombre";
        public static final String LOCALIZACIONX = "localizacionX";
        public static final String LOCALIZACIONY = "localizacionY";
        public static final String TARIFAHORAMOTO = "tarifa_hora_moto";
        public static final String TARIFAHORACARRO = "tarifaHoraCarro";
        public static final String TARIFADIAMOTO = "tarifaDiaMoto";
        public static final String TARIFADIACARRO = "tarifaDiaCarro";
        public static final String HORARIO = "horario";
    }
}
