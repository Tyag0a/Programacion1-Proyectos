package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.Collection;

public class ParqueInfantil {

    //* atributos, constructores, metodos y lista de las zonas
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

    public boolean perteneceAMunicipio(String nombreMunicipio) {
        boolean existe = false;
        if (this.municipio.getNombreMunicipio() == nombreMunicipio) {
            existe = true;
        }
        return existe;
    }

    //* metodos para: 1. verificar si una zona existe por el nombre, retornar booleano con if y else
    //* 2. agregar una zona y verificar si existe con el metodo 1 igualmente con if y else

    public boolean verificarZonaExiste (String nombreZona) {
        for (Zona zona : listaZonas) {
            if (zona.getNombreZona().equals(nombreZona)) {
                return true;
            }
        }
        return false;
    }

    public void agregarZona(Zona zona) {

        if (verificarZonaExiste(zona.getNombreZona())) {
            System.out.println("Ya se encuentra una zona con el mismo nombre en la lista de zonas");
        }
         else {
            listaZonas.add(zona);
        }

    }

}
