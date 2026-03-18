package org.example.Unidad1.Examen;

// Pago con tarjeta de credito
class TarjetaCredito extends Pago {
    private String numeroTarjeta;

    public TarjetaCredito(double monto, String numeroTarjeta) {
        super(monto);
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void procesarPago() {
        System.out.println("Pago con TDC de $" + monto + " procesado");
    }
}