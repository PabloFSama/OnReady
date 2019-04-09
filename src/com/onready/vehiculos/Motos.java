package com.onready.vehiculos;

import java.text.DecimalFormat;

public class Motos extends Vehiculos {

    private String cilindrada;
    DecimalFormat df = new DecimalFormat("$###,###.00");

    public Motos(String marca, String modelo, String cilindrada, double precio) {
        super(marca, modelo, precio);
        this.cilindrada = cilindrada;
    }

    public String getCilindrada() {
        return cilindrada;
    }

    public void setCilindrada(String cilindrada) {
        this.cilindrada = cilindrada;
    }

    @Override
    public String toString() {
        return super.toString() + " Cilindrada: " + cilindrada + " // Precio: " + df.format(super.getPrecio());
    }
}
