package org.example.Unidad2.practicas;

class Animal {
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

public class PolimorfismoAnimal {
    public static void main(String[] args) {
        Animal[] animales = new Animal[2];

        animales[0] = new Perro();
        animales[1] = new Gato();

        for (Animal animal : animales) {
            animal.hacerSonido();
        }
    }
}