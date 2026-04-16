package org.example.Unidad2.practicas;

interface PuedeVolar {
    void volar();
}

class Avion implements PuedeVolar {
    @Override
    public void volar() {
        System.out.println("El avion enciende sus motores y despega.");
    }
}

class Pajaro implements PuedeVolar {
    @Override
    public void volar() {
        System.out.println("El pajaro bate sus alas y vuela.");
    }
}

public class InterfacesVolar {
    public static void main(String[] args) {
        PuedeVolar[] elementos = new PuedeVolar[2];

        elementos[0] = new Avion();
        elementos[1] = new Pajaro();

        for (PuedeVolar elemento : elementos) {
            elemento.volar();
        }
    }
}