package org.example.Unidad2.practicas;

interface Encendible {
    void encender();
    void apagar();
}

class TV implements Encendible {
    @Override
    public void encender() {
        System.out.println("La TV se ha encendido.");
    }

    @Override
    public void apagar() {
        System.out.println("La TV se ha apagado.");
    }
}

class Bombilla implements Encendible {
    @Override
    public void encender() {
        System.out.println("La bombilla está encendida.");
    }

    @Override
    public void apagar() {
        System.out.println("La bombilla está apagada.");
    }
}

public class InterfacesDispositivos {
    public static void main(String[] args) {
        Encendible[] dispositivos = new Encendible[2];

        dispositivos[0] = new TV();
        dispositivos[1] = new Bombilla();

        for (Encendible dispositivo : dispositivos) {
            dispositivo.encender();
            dispositivo.apagar();
        }
    }
}