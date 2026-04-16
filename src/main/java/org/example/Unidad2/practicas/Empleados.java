package org.example.Unidad2.practicas;

public class Empleados {
    private int id;
    private double salario;

    public Empleados(int id, double salario) {
        this.id = id;
        this.salario = salario;
    }

    public void aumentarSalario(double porcentaje) {
        salario = salario + (salario * porcentaje / 100);
    }

    public double getSalario() {
        return salario;
    }

    public int getId() {
        return id;
    }

    public static void main(String[] args) {
        Empleados empleado1 = new Empleados(101, 8500.0);

        System.out.println("ID del empleado: " + empleado1.getId());
        System.out.println("Salario actual: " + empleado1.getSalario());

        empleado1.aumentarSalario(10);

        System.out.println("Salario con aumento: " + empleado1.getSalario());
    }
}