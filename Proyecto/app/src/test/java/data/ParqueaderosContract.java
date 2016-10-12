package data;

import android.provider.BaseColumns;

/**
 * Created by jfwc1 on 12/10/2016.
 */
public class ParqueaderosContract {

    public static abstract class ParqueaderosEntry implements BaseColumns{
        public static final String TABLE_NAME="Parqueaderos";

        public static final String ID="id";
        public static final String CODIGO="codigo";
        public static final String NOMBRE="nombre";
        public static final String LOCALIZACIONX="localizacionX";
        public static final String LOCALIZACIONY="localizacionY";
        public static final String TARIFAHORAMOTO="tarifa_hora_moto";
        public static final String TARIFAHORACARRO="tarifaHoraCarro";
        public static final String TARIFADIAMOTO="tarifaDiaMoto";
        public static final String TARIFADIACARRO="tarifaDiaCarro";
        public static final String HORARIO="horario";

    }



}
