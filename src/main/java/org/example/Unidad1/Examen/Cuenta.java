package org.example.Unidad1.Examen;

// Clase con encapsulamiento del saldo
class Cuenta {
    private double saldo;

    public Cuenta(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public double getSaldo() {
        return saldo;
    }

    public void pagar(double monto) {
        if (saldo >= monto) {
            saldo -= monto;
            System.out.println("Pago realizado, saldo restante: $" + saldo);
        } else {
            System.out.println("Saldo insuficiente");
        }
    }
}
