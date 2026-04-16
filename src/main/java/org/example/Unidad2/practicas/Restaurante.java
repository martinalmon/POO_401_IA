package org.example.Unidad2.practicas;

public class Restaurante {
    String nombre;
    String tipoDeComida;
    int calificacion;

    public Restaurante(String nombre, String tipoDeComida, int calificacion) {
        this.nombre = nombre;
        this.tipoDeComida = tipoDeComida;
        this.calificacion = calificacion;
    }

    public void abrir() {
        System.out.println("El restaurante " + nombre + " está abierto.");
    }

    public static void main(String[] args) {
        Restaurante r1 = new Restaurante("La Casa Italiana", "Italiana", 5);
        Restaurante r2 = new Restaurante("Tacos El Guero", "Mexicana", 4);

        r1.abrir();
        r2.abrir();
    }
}