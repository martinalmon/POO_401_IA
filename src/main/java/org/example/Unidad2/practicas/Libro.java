package org.example.Unidad2.practicas;

public class Libro {
    String titulo;
    String autor;
    int paginas;

    public Libro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void mostrarInfo() {
        System.out.println("Titulo: " + titulo);
        System.out.println("Autor: " + autor);
        System.out.println("Paginas: " + paginas);
        System.out.println();
    }

    public static void main(String[] args) {
        Libro libro1 = new Libro("Cien anos de soledad", "Gabriel Garcia Marquez", 417);
        Libro libro2 = new Libro("Don Quijote de la Mancha", "Miguel de Cervantes", 863);

        libro1.mostrarInfo();
        libro2.mostrarInfo();
    }
}