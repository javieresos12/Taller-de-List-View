package com.example.javierescobar.tallerlistview;

import android.app.Activity;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class RegistrarRectangulo extends Activity {
    private EditText base, altura;
    private TextView resrectangulo;
    private Resources recursos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_rectangulo);
        base= findViewById(R.id.txtbase);
        altura= findViewById(R.id.txtaltura);
        resrectangulo= findViewById(R.id.txtresultadoRectangulo);

        recursos = this.getResources();
    }

    public void guardar (View v){
        double auxbase, auxaltura, auxres;

        if (validar()) {
            auxbase = Double.parseDouble(base.getText().toString());
            auxaltura = Double.parseDouble(altura.getText().toString());

            String operacion = getResources().getString(R.string.area_rectangulo);
            String base = getResources().getString(R.string.base) + ": ";
            String altura = getResources().getString(R.string.altura) + ": ";
            String datos = base + auxbase + "\n" + altura + auxaltura;

            auxres = Metodos.rectangulo(auxbase, auxaltura);

            resrectangulo.setText("" + auxres);
            Operaciones ope = new Operaciones(operacion, datos, auxres);
            ope.guardar();
            Toast.makeText(this, getResources().getString(R.string.guardado), Toast.LENGTH_SHORT);
        }
    }

    public boolean validar (){
        String base2, altura2;
        base2= base.getText().toString();
        altura2= altura.getText().toString();

        if (base2.isEmpty()){
            base.setError(recursos.getString(R.string.error4));
            base.requestFocus();
            return  false;
        }

        if (altura2.isEmpty()){
            altura.setError(recursos.getString(R.string.error5));
            altura.requestFocus();
            return false;
        }
        return true;
    }

    public void limpiar(View v){
        borrar();
    }

    private void borrar(){
        base.setText("");
        altura.setText("");
        resrectangulo.setText("");
        base.requestFocus();

    }

}




