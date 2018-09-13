package com.example.javierescobar.tallerlistview;

import java.io.PipedInputStream;

import static java.lang.Math.PI;

public class Metodos {

    public static double cuadrado (double lado){
        return lado*lado;
    }

    public static double rectangulo(double base, double altura){
        return base*altura;
    }

    public static double esfera (double radio){
        return (4/3)*PI*Math.pow(radio,3);
    }

    public static double cilindro(double radio, double altura){
        return PI*Math.pow(radio, 2)*altura;
    }
}
