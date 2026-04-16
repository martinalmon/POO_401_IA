package org.example.Unidad2.practicas;

public class Calculadora {

    public int sumar(int a, int b) {
        return a + b;
    }

    public int sumar(int a, int b, int c) {
        return a + b + c;
    }

    public double sumar(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
        Calculadora calc = new Calculadora();

        System.out.println("Suma de 2 enteros: " + calc.sumar(4, 6));
        System.out.println("Suma de 3 enteros: " + calc.sumar(2, 3, 5));
        System.out.println("Suma de 2 decimales: " + calc.sumar(4.5, 2.3));
    }
}