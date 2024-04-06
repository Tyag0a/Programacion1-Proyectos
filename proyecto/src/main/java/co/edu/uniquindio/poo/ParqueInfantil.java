package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.Collection;

public class ParqueInfantil {

    private String nombre;
    private String descripcion;
    private Municipio municipio;
    private final Collection<Zona> listaZonas;
    
    public ParqueInfantil(String nombre, String descripcion, Municipio municipio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.municipio = municipio;
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
}
