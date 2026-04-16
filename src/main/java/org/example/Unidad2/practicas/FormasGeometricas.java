package org.example.Unidad2.practicas;

class Forma {
    public double calcularArea() {
        return 0;
    }
}

class Circulo extends Forma {
    private double radio;

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}

class Rectangulo extends Forma {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}

public class FormasGeometricas {
    public static void main(String[] args) {
        Forma[] formas = new Forma[2];

        formas[0] = new Circulo(5);
        formas[1] = new Rectangulo(4, 6);

        for (Forma forma : formas) {
            System.out.println("Area: " + forma.calcularArea());
        }
    }
}