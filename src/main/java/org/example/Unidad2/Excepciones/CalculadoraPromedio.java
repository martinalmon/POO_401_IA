package org.example.Unidad2.Excepciones;

import java.util.InputMismatchException;
import java.util.Scanner;

public class CalculadoraPromedio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double nota1, nota2, promedio;

        try {
            System.out.print("Ingresa la primera nota: ");
            nota1 = scanner.nextDouble();

            System.out.print("Ingresa la segunda nota: ");
            nota2 = scanner.nextDouble();

            promedio = (nota1 + nota2) / 2.0;

            System.out.println("El promedio de las dos notas es: " + promedio);
        } catch (InputMismatchException e) {
            System.out.println("Error: debes ingresar solo numeros.");
        } finally {
            scanner.close();
        }
    }
}