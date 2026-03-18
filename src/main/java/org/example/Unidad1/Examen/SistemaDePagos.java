package org.example.Unidad1.Examen;

// Clase principal
public class Main {
    public static void main(String[] args) {

        Cuenta cuenta = new Cuenta(1000);

        Pago pago1 = new TarjetaCredito(200, "1234-5678");
        Pago pago2 = new PayPal(150, "correo@mail.com");
        Pago pago3 = new Cripto(300, "wallet123");

        // Polimorfismo
        pago1.procesarPago();
        cuenta.pagar(200);

        pago2.procesarPago();
        cuenta.pagar(150);

        pago3.procesarPago();
        cuenta.pagar(300);
    }
}