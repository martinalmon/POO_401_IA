package org.example.Unidad1.Examen;

// Pago con criptomonedas
class Cripto extends Pago {
    private String wallet;

    public Cripto(double monto, String wallet) {
        super(monto);
        this.wallet = wallet;
    }

    @Override
    public void procesarPago() {
        System.out.println("Pago con Cripto de $" + monto + " procesado");
    }
}
