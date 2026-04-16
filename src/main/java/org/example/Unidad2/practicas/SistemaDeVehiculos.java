package org.example.Unidad2.practicas;

class Vehiculo {
    protected int velocidad;
    protected int numLlantas;

    public Vehiculo(int velocidad, int numLlantas) {
        this.velocidad = velocidad;
        this.numLlantas = numLlantas;
    }

    public void acelerar() {
        velocidad += 5;
        System.out.println("La velocidad ahora es: " + velocidad);
    }
}

class Bicicleta extends Vehiculo {
    public Bicicleta(int velocidad, int numLlantas) {
        super(velocidad, numLlantas);
    }
}

class Automovil extends Vehiculo {
    public Automovil(int velocidad, int numLlantas) {
        super(velocidad, numLlantas);
    }

    @Override
    public void acelerar() {
        velocidad += 20;
        System.out.println("El automovil acelera mas rapido. Velocidad: " + velocidad);
    }
}

public class SistemaDeVehiculos {
    public static void main(String[] args) {
        Bicicleta bici = new Bicicleta(0, 2);
        Automovil auto = new Automovil(0, 4);

        bici.acelerar();
        auto.acelerar();
    }
}