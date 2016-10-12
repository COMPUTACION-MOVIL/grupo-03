package data;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by jfwc1 on 12/10/2016.
 */
public class ParqueaderosDbHelper extends SQLiteOpenHelper {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "Parqueaderos.db";

    public ParqueaderosDbHelper(Context context){
        super(context,DATABASE_NAME,null,DATABASE_VERSION);
    }
    //public ParqueaderosDbHelper(Context context, String name, SQLiteDatabase.CursorFactory factory, int version) {
      //  super(context, name, factory, version);
    //}

    @Override
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

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {

    }
}
