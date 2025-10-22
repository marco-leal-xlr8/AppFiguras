package com.mycompany.appfiguras;

public class AppFiguras {
    public static void main(String[] args) {
        Figura[] figuras = {
            new Circulo(2.5),
            new Cuadrado(7),
            new Triangulo(3, 5)
        };

        for (Figura f : figuras) {
            System.out.println("Area: " + f.area());
        }
    }
}
