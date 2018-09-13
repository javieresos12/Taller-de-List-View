package com.example.javierescobar.tallerlistview;

public class Operaciones {
    private  String operacion;
    private  String datos;
    private  Double Resultado;

    public Operaciones(String operacion, String datos, Double resultado) {
        this.operacion = operacion;
        this.datos = datos;
        Resultado = resultado;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getDatos() {
        return datos;
    }

    public void setDatos(String datos) {
        this.datos = datos;
    }

    public Double getResultado() {
        return Resultado;
    }

    public void setResultado(Double resultado) {
        Resultado = resultado;
    }

    public void guardar (){
        Datos.guardar(this );
    }
}
