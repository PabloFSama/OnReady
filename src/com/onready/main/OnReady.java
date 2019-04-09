package com.onready.main;

import com.onready.vehiculos.*;
import java.text.DecimalFormat;
import java.util.*;

public class OnReady {

    public static void main(String[] args) {

        ArrayList<Vehiculos> vhclos = new ArrayList<>();
        vhclos.add(new Autos("Peugeot", "206", 4, 200000));
        vhclos.add(new Motos("Honda", "Titan", "125c", 60000));
        vhclos.add(new Autos("Peugeot", "208", 5, 250000));
        vhclos.add(new Motos("Yamaha", "YBR", "160c", 80500.50));
        DecimalFormat df = new DecimalFormat("$###,###.00");

        Comparator<Vehiculos> comparator;
        comparator = Comparator.comparing(Vehiculos::getPrecio);

        Vehiculos minObject = vhclos.stream().min(comparator).get();
        Vehiculos maxObject = vhclos.stream().max(comparator).get();

        for (Vehiculos lista : vhclos) {
            System.out.println(lista);
        }
        System.out.println("=============================");
        System.out.println("Producto más caro: " + maxObject.getMarca() + " " + maxObject.getModelo());
        System.out.println("Producto más barato: " + minObject.getMarca() + " " + minObject.getModelo());
        for (Vehiculos d : vhclos) {
            if (d.getMarca() != null && d.getMarca().contains("Y")) {
                System.out.println("Vehículo que contiene en el modelo la letra ‘Y’: " + d.getMarca() + " " + d.getModelo() + " " + df.format(d.getPrecio()));
            }

        }
        System.out.println("\n");
        System.out.println("=============================");
        System.out.println("Vehículos ordenados por precio de mayor a menor:");

        Collections.sort(vhclos, new Comparator<Vehiculos>() {
            public int compare(Vehiculos s1, Vehiculos s2) {
                return Double.valueOf(s2.getPrecio()).compareTo(s1.getPrecio());
            }

        });
        for (int i = 0; i < vhclos.size(); i++) {
            System.out.println(vhclos.get(i).getMarca() + " " + vhclos.get(i).getModelo());
        }
    }
}
