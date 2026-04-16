package org.example.Unidad2.practicas;

class Animal {
    String sonido;

    public void hacerSonido() {
        System.out.println("El animal hace un sonido.");
    }
}

class Perro extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Guau");
    }
}

class Gato extends Animal {
    @Override
    public void hacerSonido() {
        System.out.println("Miau");
    }
}

public class Zoologico {
    public static void main(String[] args) {
        Perro perro = new Perro();
        Gato gato = new Gato();

        perro.hacerSonido();
        gato.hacerSonido();
    }
}
