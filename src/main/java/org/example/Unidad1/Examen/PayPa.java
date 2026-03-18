package org.example.Unidad1.Examen;

// Pago con PayPal
class PayPal extends Pago {
    private String email;

    public PayPal(double monto, String email) {
        super(monto);
        this.email = email;
    }

    @Override
    public void procesarPago() {
        System.out.println("Pago con PayPal de $" + monto + " procesado");
    }
}
