package maribel.itics.tesoem.edu.mx;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class frmMuestraReg extends AppCompatActivity {

    TextView lbldatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frm_muestra_reg);

        lbldatos = (TextView) findViewById(R.id.lbldatos);
    }

    public void cargadatos(View v){
        try {
            BufferedReader archivo = new BufferedReader(new InputStreamReader(openFileInput("AgendaItics.txt")));
            String dato = archivo.readLine();
            lbldatos.setText(dato);
            String temp;
            while(dato != null){
                temp = lbldatos.getText().toString();
                dato = archivo.readLine();
                lbldatos.setText(temp + dato + "\n");
            }
        } catch (Exception e){
            Log.e("Error","Error al leer archivo");
        }

    }
}
