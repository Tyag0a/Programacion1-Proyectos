package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.Collection;

public class Proyecto {
    private final String nombre;
    private final double costoTotal;
    private final Collection<ParqueInfantil> listaParquesInfantiles;


    public Proyecto(String nombre, double costoTotal) {
        this.nombre = nombre;
        this.costoTotal = costoTotal;
        listaParquesInfantiles = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public Collection<ParqueInfantil> getParquesInfantiles() {
        return listaParquesInfantiles;
    }
}
