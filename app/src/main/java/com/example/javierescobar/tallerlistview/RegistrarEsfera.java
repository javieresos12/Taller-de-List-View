package com.example.javierescobar.tallerlistview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegistrarEsfera extends Activity {
   private TextView resultadoesfera;
   private EditText radio;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_esfera);
        radio= findViewById(R.id.txtRadio);
        resultadoesfera= findViewById(R.id.txtVolumenEsfera);

    }

    public void guardar (View v){
        double radioes, resultadoes;
        radioes= Double.parseDouble(radio.getText().toString());

        String operacion = getResources().getString(R.string.volumen_esfera);
        String radioaux= getResources().getString(R.string.radio)+": ";
        String datos = radioaux+radioes;

        resultadoes= Metodos.esfera(radioes);
        resultadoesfera.setText(""+resultadoes);

        Operaciones ope= new Operaciones(operacion, datos, resultadoes);
        ope.guardar();
        Toast.makeText(this, getResources().getString(R.string.guardado), Toast.LENGTH_SHORT);

    }

    public void limpiar(View v){
        borrar();
    }

    private void borrar(){
        radio.setText("");
        resultadoesfera.setText("");
        radio.requestFocus();

    }

}
