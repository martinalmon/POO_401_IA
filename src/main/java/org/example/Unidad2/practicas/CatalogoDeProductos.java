package org.example.Unidad2.practicas;

class Producto {
    protected String nombre;
    protected double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public void mostrarDetalles() {
        System.out.println("Producto: " + nombre + ", Precio: $" + precio);
    }
}

class Electronica extends Producto {
    private int garantia;

    public Electronica(String nombre, double precio, int garantia) {
        super(nombre, precio);
        this.garantia = garantia;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Electronica: " + nombre + ", Precio: $" + precio + ", Garantia: " + garantia + " meses");
    }
}

class Alimento extends Producto {
    private String fechaDeCaducidad;

    public Alimento(String nombre, double precio, String fechaDeCaducidad) {
        super(nombre, precio);
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    @Override
    public void mostrarDetalles() {
        System.out.println("Alimento: " + nombre + ", Precio: $" + precio + ", Fecha de caducidad: " + fechaDeCaducidad);
    }
}

public class CatalogoDeProductos {
    public static void main(String[] args) {
        Producto[] productos = new Producto[3];

        productos[0] = new Electronica("Laptop", 15000, 24);
        productos[1] = new Alimento("Leche", 28.5, "15/05/2026");
        productos[2] = new Electronica("Celular", 8000, 12);

        for (Producto producto : productos) {
            producto.mostrarDetalles();
        }
    }
}