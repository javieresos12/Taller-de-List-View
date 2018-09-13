package com.example.javierescobar.tallerlistview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

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
        
    }




}
