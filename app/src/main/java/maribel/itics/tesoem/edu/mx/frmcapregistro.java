package maribel.itics.tesoem.edu.mx;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.OutputStreamWriter;

public class frmcapregistro extends AppCompatActivity {

    EditText txtnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_frmcapregistro);

        txtnombre = (EditText) findViewById(R.id.txtnombre);
    }

    public void bgrabar(View v){
        try{
            OutputStreamWriter archivo = new OutputStreamWriter(openFileOutput("AgendaItics.txt", Context.MODE_APPEND));
            archivo.write(txtnombre.getText().toString()+"\n");
            archivo.close();
            Toast.makeText(this,"Se grabo la informacion",Toast.LENGTH_LONG).show();

        } catch(Exception e){
            Log.e("Error","Error al grabar");
            Toast.makeText(this,"no Se grabo la informacion",Toast.LENGTH_LONG).show();
        }
    }
}
