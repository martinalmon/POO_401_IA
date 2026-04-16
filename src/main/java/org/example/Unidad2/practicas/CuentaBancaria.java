package org.example.Unidad2.practicas;

public class CuentaBancaria {
    private double saldo;

    public CuentaBancaria(double saldoInicial) {
        this.saldo = saldoInicial;
    }

    public void depositar(double cantidad) {
        saldo += cantidad;
        System.out.println("Deposito realizado: $" + cantidad);
    }

    public void retirar(double cantidad) {
        if (cantidad <= saldo) {
            saldo -= cantidad;
            System.out.println("Retiro realizado: $" + cantidad);
        } else {
            System.out.println("No hay saldo suficiente para retirar $" + cantidad);
        }
    }

    public double getSaldo() {
        return saldo;
    }

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria(1000);

        System.out.println("Saldo inicial: $" + cuenta.getSaldo());

        cuenta.depositar(500);
        System.out.println("Saldo actual: $" + cuenta.getSaldo());

        cuenta.retirar(300);
        System.out.println("Saldo actual: $" + cuenta.getSaldo());

        cuenta.retirar(1500);
        System.out.println("Saldo final: $" + cuenta.getSaldo());
    }
}
