package co.edu.uniquindio.poo;

public class ParqueInfantil {
    
    public ParqueInfantil(String nombre, String descripcion, Municipio municipio) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.municipio = municipio;
    }

    private String nombre;
    private String descripcion;
    private Municipio municipio;

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Municipio getMunicipio() {
        return municipio;
    }
}
