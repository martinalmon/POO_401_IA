package org.example.Unidad2.bifurcaciones;

public class SistemaCalificaciones {
    public static void main(String[] args) {
        int notaExamen = 95;
        char calificacion;

        if (notaExamen < 0 || notaExamen > 100) {
            System.out.println("La nota es invalida.");
        } else {
            if (notaExamen >= 60) {
                System.out.println("¡Felicidades, has aprobado!");

                if (notaExamen >= 90) {
                    System.out.println("¡Excelente desempeño!");
                }
            } else {
                System.out.println("Lo sentimos, no has aprobado.");
            }

            switch (notaExamen / 10) {
                case 10:
                case 9:
                    calificacion = 'A';
                    break;
                case 8:
                    calificacion = 'B';
                    break;
                case 7:
                    calificacion = 'C';
                    break;
                case 6:
                    calificacion = 'D';
                    break;
                default:
                    calificacion = 'F';
                    break;
            }

            System.out.println("Tu calificacion es: " + calificacion);
        }
    }
}
