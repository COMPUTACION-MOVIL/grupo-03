package co.edu.udea.computacionmovil.parkingeasy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.OnMapReadyCallback;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

public class MainActivity extends AppCompatActivity implements OnMapReadyCallback{

    private MapFragment mMapFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMapFragment = MapFragment.newInstance();
        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.map_container, mMapFragment)
                .commit();

        // Registrar escucha onMapReadyCallback
        mMapFragment.getMapAsync(this);
    }

    @Override
    public void onMapReady(GoogleMap googleMap) {

        //Camara ubicada en Medellin

        LatLng medellin = new LatLng(6.267094,-75.568770);
        CameraPosition cameraPosition = CameraPosition.builder()
                .target(medellin)
                .zoom(15)
                .build();

        googleMap.moveCamera(CameraUpdateFactory.newCameraPosition(cameraPosition));

        //Base de datos de parqueaderos

        Float parqueaderos[][] = new Float[8][2];
        //Parqueadero AUTO STAR
        parqueaderos[0][0] = 6.266111F;
        parqueaderos[0][1] = -75.563736F;
        //Parqueadero edificio turin
        parqueaderos[1][0] = 6.260288F;
        parqueaderos[1][1] = -75.571000F;
        //Parqueadero los medicos leon XXIII
        parqueaderos[2][0] = 6.266988F;
        parqueaderos[2][1] = -75.564358F;
        //Parqueadero el cafetero
        parqueaderos[3][0] = 6.273451F;
        parqueaderos[3][1] = -75.561311F;
        //Parqueadero publico Caribe
        parqueaderos[4][0] = 6.271382F;
        parqueaderos[4][1] = -75.573778F;
        //Parqueadero Colanta
        parqueaderos[5][0] = 6.272603F;
        parqueaderos[5][1] = -75.572250F;
        //Parqueadero Lubricantes Medellin
        parqueaderos[6][0] = 6.272543F;
        parqueaderos[6][1] = -75.572986F;
        //Parqueadero Placita Zea
        parqueaderos[7][0] = 6.253827F;
        parqueaderos[7][1] = -75.571624F;

        for(int i=0;i<8;i++){
            int j=0;
            LatLng parqueadero = new LatLng(parqueaderos[i][j],parqueaderos[i][j+1]);

            googleMap.addMarker(new MarkerOptions()
                    .position(parqueadero)
                    .icon(BitmapDescriptorFactory.fromResource(R.drawable.icon))
                    .title("PARQUEADERO"));

        }


    }
}
