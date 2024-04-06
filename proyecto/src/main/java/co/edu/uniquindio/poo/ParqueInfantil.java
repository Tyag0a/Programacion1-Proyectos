package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.Collection;

public class ParqueInfantil {

    private String nombre;
    private String descripcion;
    private Municipio municipio;
    public double costo;
    private final Collection<Zona> listaZonas;
    
    public ParqueInfantil(String nombre, String descripcion, Municipio municipio, double costo) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.municipio = municipio;
        this.costo = costo;
        listaZonas = new LinkedList<>();
    }



    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Municipio getMunicipio() {
        return municipio;
    }


    public Collection<Zona> getListaZonas() {
        return listaZonas;
    }


    public double getCosto() {
        return costo;
    }
}
