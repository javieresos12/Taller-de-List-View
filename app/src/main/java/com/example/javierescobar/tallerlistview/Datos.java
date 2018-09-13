package com.example.javierescobar.tallerlistview;

import java.util.ArrayList;

public class Datos {

    private static ArrayList<Operaciones> operacion = new ArrayList<>();

    public static void guardar (Operaciones op){
        operacion.add(op);
    }

    public static ArrayList<Operaciones> obtener (){
        return operacion;
    }
}
