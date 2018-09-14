package com.example.javierescobar.tallerlistview;

        import android.app.Activity;
        import android.content.res.Resources;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.EditText;
        import android.widget.TextView;
        import android.widget.Toast;

public class RegistrarCuadrado extends Activity {
    private EditText lado;
    private TextView rescuadrado;
    private Resources recursos;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registrar_cuadrado);
        lado=findViewById(R.id.txtlado);
        rescuadrado= findViewById(R.id.txtresultadoCuadrado);

        recursos = this.getResources();
    }

    public void guardar (View v){
        double auxlado, auxcuadrado;

        if (validar()) {
            auxlado = Double.parseDouble(lado.getText().toString());

            String operacion = getResources().getString(R.string.area_cuadrado);
            String lado2 = getResources().getString(R.string.lado) + ": ";
            String datos = lado2 + auxlado;

            auxcuadrado = Metodos.cuadrado(auxlado);
            rescuadrado.setText("" + auxcuadrado);
            Operaciones ope = new Operaciones(operacion, datos, auxcuadrado);
            ope.guardar();
            Toast.makeText(this, getResources().getString(R.string.guardado), Toast.LENGTH_SHORT);
        }

    }

    public boolean validar (){
        String lado2;
        lado2 =lado.getText().toString();

        if (lado2.isEmpty()){
            lado.setError(recursos.getString(R.string.error3));
            lado.requestFocus();
            return false;
        }
        return  true;
    }


    public void limpiar(View v){
        borrar();
    }

    private void borrar(){
        lado.setText("");
        rescuadrado.setText("");
        lado.requestFocus();

    }
}
