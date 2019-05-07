package maribel.itics.tesoem.edu.mx;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void invoca_captura(View v){
        Intent pantalla = new Intent(this,frmcapregistro.class);
        startActivity(pantalla);
    }

    public void invoca_mostrar(View v){
        Intent pantalla = new Intent(this, frmMuestraReg.class);
        startActivity(pantalla);
    }
}

