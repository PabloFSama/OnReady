package com.onready.vehiculos;

import java.text.DecimalFormat;

public class Autos extends Vehiculos {

    private int puertas;
    DecimalFormat df = new DecimalFormat("$###,###.00");

    public Autos(String marca, String modelo, int puertas, double precio) {
        super(marca, modelo, precio);
        this.puertas = puertas;
    }

    public int getPuertas() {
        return puertas;
    }

    public void setPuertas(int puertas) {
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return super.toString() + "Puertas: " + puertas + " // Precio: " + df.format(super.getPrecio());
    }
}
