package org.example.desafio535;

public class Geometria {

    private static final double PI = Math.PI;

    public static double areaQuadrado(double tamanhoDoLado){
        return Math.pow(tamanhoDoLado, 2);
    }

    public static double areaCirculo(double raio){
        return Math.pow(raio, 2) * PI;
    }
}
