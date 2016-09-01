package co.edu.udea.compumovil.gr3.lab1_ui;

import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Spinner;
import android.widget.TextView;
import android.support.v7.app.AppCompatActivity;

import java.text.DateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    //Declare variables
    DateFormat formate = DateFormat.getDateInstance();
    Calendar calendar = Calendar.getInstance();
    Button btn;
    String info;
    private AutoCompleteTextView autocomplete;
    private Spinner spinner;
    private ArrayAdapter<String> adapter;
    static final int PICK_REQUEST =1337;
    Uri contact = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ((TextView)findViewById(R.id.textView)).setMovementMethod(new ScrollingMovementMethod());
        btn=(Button)findViewById(R.id.buttonDate);
        btn.setOnClickListener(this);
        //Get String Array using getResorces()
        String[] contries = getResources().getStringArray(R.array.paises);
        //Create adapter with all data
        adapter = new ArrayAdapter<String>(this,
                R.layout.support_simple_spinner_dropdown_item,contries);
        //Register the control
        autocomplete = (AutoCompleteTextView)findViewById(R.id.acCountry);
        //Set as adapter in TextView
        autocomplete.setAdapter(adapter);
        autocomplete.setThreshold(1);

        spinner = (Spinner) findViewById(R.id.spinnerHobbies);
        String[] hobbies = getResources().getStringArray(R.array.hobbies);
        // Create an ArrayAdapter using the string array and a default spinner layout
        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item,hobbies);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner.setAdapter(adapter);

        restoreMe(savedInstanceState);

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        if (requestCode == PICK_REQUEST){
            if(resultCode == RESULT_OK){
                contact = data.getData();
            }
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState){
        super.onSaveInstanceState(outState);
        if (contact != null){
            outState.putString("contact", contact.toString());
        }
    }

    private void restoreMe(Bundle state){
        contact = null;
        if (state != null){
            String contactUri = state.getString("contact");
            if (contactUri!=null){
                contact = Uri.parse(contactUri);
            }
        }
    }

    public boolean validar()
    {
        EditText[] txtValidate = new EditText[6];
        String aux;
        txtValidate[0]=(EditText)findViewById(R.id.editAddress);
        txtValidate[1]=(EditText)findViewById(R.id.editLastName);
        txtValidate[2]=(EditText)findViewById(R.id.editMail);
        txtValidate[3]=(EditText)findViewById(R.id.editName);
        txtValidate[4]=(EditText)findViewById(R.id.editPhone);
        txtValidate[5]=(EditText)findViewById(R.id.acCountry);


        for(int i=0; i<txtValidate.length;i++)
        {
            aux=txtValidate[i].getText().toString();
            if(i>1){
                if(aux.compareTo("")==0)
                {
                    return false;
                }
            }
        }
        return true;
    }
    public void mostrar(View v)
    {
        if(!validar())
        {
            Log.v("MainActivity","aaa");
            AlertDialog alertDialog = new AlertDialog.Builder(this).create();
            alertDialog.setTitle("Alerta");
            alertDialog.setMessage("Los campos marcados con * son obligatorios");
            alertDialog.show();
        }
        else {
            info = "";
            RadioButton rb;
            Spinner spinner;
            EditText[] txtValidate = new EditText[6];
            txtValidate[4] = (EditText) findViewById(R.id.editAddress);
            txtValidate[1] = (EditText) findViewById(R.id.editLastName);
            txtValidate[3] = (EditText) findViewById(R.id.editMail);
            txtValidate[0] = (EditText) findViewById(R.id.editName);
            txtValidate[2] = (EditText) findViewById(R.id.editPhone);
            txtValidate[5] = (EditText) findViewById(R.id.acCountry);
            spinner = (Spinner) findViewById(R.id.spinnerHobbies);

            for (int i = 0; i < txtValidate.length; i++) {
                switch (i) {
                    case 0:
                        info = getString(R.string.Nombres)+":\n"+ txtValidate[i].getText().toString();
                        break;
                    case 1:
                        info = info + "\n"+getString(R.string.Apellidos)+":\n" + (txtValidate[i].getText().toString());
                        break;
                    case 2:
                        info = info + "\n"+getString(R.string.Telefono)+":\n" + (txtValidate[i].getText().toString());
                        break;
                    case 3:
                        rb = (RadioButton) findViewById(R.id.rbMan);
                        if (rb.isChecked()) {
                            info = info + "\nSexo: Masculino";
                        } else {
                            rb = (RadioButton) findViewById(R.id.rbWoman);
                            if (rb.isChecked()) {
                                info = info + "\nSexo: Femenino";
                            } else {
                                info = info + "\nSexo: Prefiere no responder";
                            }
                        }
                        info = info + "\nE-mail:\n" + (txtValidate[i].getText().toString());
                        break;
                    case 4:
                        info = info + "\n"+getString(R.string.Direccion)+":\n" + (txtValidate[i].getText().toString());
                        break;
                    case 5:
                        info = info + "\n"+getString(R.string.Pais)+":\n" + (txtValidate[i].getText().toString());
                        break;
                }
            }
            info = info + "\n"+getString(R.string.Hobbies)+":\n" + (spinner.getSelectedItem().toString());
            String aux;
            aux = Integer.toString(calendar.get(Calendar.YEAR));
            aux = aux + "/" + Integer.toString(calendar.get(Calendar.MONTH));
            aux = aux + "/" + Integer.toString(calendar.get(Calendar.DAY_OF_MONTH));
            info = info + "\n"+getString(R.string.Fecha_nacimiento)+":\n" + aux;
            if (((CheckBox) findViewById(R.id.checkFavorite)).isChecked()) {
                info = info + "\n"+getString(R.string.Es_Favorito);
            } else {
                info = info + "\n"+getString(R.string.No_Es_Favorito);
            }
            ((TextView) findViewById(R.id.textView)).setText(info);
        }
    }

    @Override
    public void onClick(View v) {
        setDate();
    }
    DatePickerDialog.OnDateSetListener d = new DatePickerDialog.OnDateSetListener(){

        @Override
        public void onDateSet(DatePicker view, int year, int monthOfYear, int dayOfMonth) {
            calendar.set(Calendar.YEAR,year);
            calendar.set(Calendar.MONTH,monthOfYear);
            calendar.set(Calendar.DAY_OF_MONTH,dayOfMonth);
        }
    };
    public void setDate()
    {
        new DatePickerDialog(MainActivity.this,d,calendar.get(Calendar.YEAR),calendar.get(Calendar.MONTH),calendar.get(Calendar.DAY_OF_MONTH)).show();
    }

}

