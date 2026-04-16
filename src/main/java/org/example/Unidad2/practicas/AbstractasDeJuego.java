package org.example.Unidad2.practicas;

abstract class Personaje {
    public abstract void atacar();
}

class Guerrero extends Personaje {
    @Override
    public void atacar() {
        System.out.println("El guerrero ataca con una espada.");
    }
}

class Mago extends Personaje {
    @Override
    public void atacar() {
        System.out.println("El mago ataca con un hechizo.");
    }
}

public class AbstractasDeJuego {
    public static void main(String[] args) {
        Guerrero guerrero = new Guerrero();
        Mago mago = new Mago();

        guerrero.atacar();
        mago.atacar();
    }
}