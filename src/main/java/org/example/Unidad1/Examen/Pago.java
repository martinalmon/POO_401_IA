package org.example.Unidad1.Examen;

abstract class Pago {
    // Clase abstracta base

        protected double monto;

        public Pago(double monto) {
            this.monto = monto;
        }

        public abstract void procesarPago();
    }
}
