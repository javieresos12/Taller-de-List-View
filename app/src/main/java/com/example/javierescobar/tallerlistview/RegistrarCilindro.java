package com.example.javierescobar.tallerlistview;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegistrarCilindro extends Activity {
     private EditText radiocilindro, alturacilindro;
     private TextView resulCilindro;
    private Resources recursos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_cilindro);
        radiocilindro= findViewById(R.id.txtradiocilindro);
        alturacilindro = findViewById(R.id.txtalturacilindro);
        resulCilindro= findViewById(R.id.txtVolumenCilindro);

        recursos = this.getResources();
    }

    public void guardar (View v){
        double radioaux, alturaaux, resaux;

        if (validar()) {
            radioaux = Double.parseDouble(radiocilindro.getText().toString());
            alturaaux = Double.parseDouble(alturacilindro.getText().toString());

            String operacion = getResources().getString(R.string.volumen_cilindro);
            String radio2 = getResources().getString(R.string.radio) + ": ";
            String altura = getResources().getString(R.string.altura) + ": ";
            String datos = radio2 + radioaux + "\n" + altura + alturaaux;

            resaux = Metodos.cilindro(radioaux, alturaaux);

            resulCilindro.setText("" + resaux);
            Operaciones ope = new Operaciones(operacion, datos, resaux);
            ope.guardar();
            Toast.makeText(this, getResources().getString(R.string.guardado), Toast.LENGTH_SHORT);
        }
    }


    public boolean validar (){
       String radioci, alturaci, resultadoci;

       radioci= radiocilindro.getText().toString();
       alturaci= alturacilindro.getText().toString();
       resultadoci= resulCilindro.getText().toString();

       if (radioci.isEmpty()){
           radiocilindro.setError(recursos.getString(R.string.error1));
           radiocilindro.requestFocus();
           return false;
       }
       if (alturaci.isEmpty()){
           alturacilindro.setError(recursos.getString(R.string.error2));
           alturacilindro.requestFocus();
           return false;
       }

       return true;

    }

    public void limpiar(View v){
        borrar();
    }

    private void borrar(){
        radiocilindro.setText("");
        alturacilindro.setText("");
        resulCilindro.setText("");
        radiocilindro.requestFocus();

    }

}
