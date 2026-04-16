package org.example.Unidad2.practicas;

import java.util.ArrayList;

class Estudiante {
    String nombre;
    int id;

    public Estudiante(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }
}

class Clase {
    String nombreDeClase;
    ArrayList<Estudiante> estudiantes;

    public Clase(String nombreDeClase) {
        this.nombreDeClase = nombreDeClase;
        this.estudiantes = new ArrayList<>();
    }

    public void agregarEstudiante(Estudiante estudiante) {
        estudiantes.add(estudiante);
    }

    public void mostrarEstudiantes() {
        System.out.println("Estudiantes inscritos en " + nombreDeClase + ":");
        for (Estudiante estudiante : estudiantes) {
            System.out.println("- " + estudiante.nombre);
        }
    }
}

public class Estudiantes {
    public static void main(String[] args) {
        Clase clase = new Clase("Programacion Orientada a Objetos");

        Estudiante e1 = new Estudiante("Ana", 1);
        Estudiante e2 = new Estudiante("Luis", 2);
        Estudiante e3 = new Estudiante("Carlos", 3);

        clase.agregarEstudiante(e1);
        clase.agregarEstudiante(e2);
        clase.agregarEstudiante(e3);

        clase.mostrarEstudiantes();
    }
}
