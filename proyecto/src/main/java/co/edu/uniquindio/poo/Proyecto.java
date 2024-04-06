package co.edu.uniquindio.poo;

public class Proyecto {
    private final String nombre;
    private final double costoTotal;


    public Proyecto(String nombre, double costoTotal) {
        this.nombre = nombre;
        this.costoTotal = costoTotal;
    }

    public String getNombre() {
        return nombre;
    }

    public double getCostoTotal() {
        return costoTotal;
    }
}
