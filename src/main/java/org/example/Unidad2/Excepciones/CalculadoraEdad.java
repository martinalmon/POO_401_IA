package org.example.Unidad2.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraEdad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int anioActual = 2025;
        int anioNacimiento;
        int edad;

        try {
            System.out.print("Ingresa tu año de nacimiento: ");
            anioNacimiento = scanner.nextInt();

            edad = anioActual - anioNacimiento;

            System.out.println("Tu edad es: " + edad + " años.");
        } catch (InputMismatchException e) {
            System.out.println("Error: debes ingresar un numero.");
        } finally {
            scanner.close();
        }
    }
}