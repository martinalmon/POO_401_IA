package org.example.Unidad2.practicas;

class Circulo {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }
}

public class ReturnYConstructores {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);

        System.out.println("Area: " + circulo.calcularArea());
        System.out.println("Circunferencia: " + circulo.calcularCircunferencia());
    }
}