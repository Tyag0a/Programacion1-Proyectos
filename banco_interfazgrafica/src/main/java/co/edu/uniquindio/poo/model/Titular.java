package co.edu.uniquindio.poo.model;

public class Titular {

    public Titular(String nombre, String apellidos) {
        this.nombre = nombre;
        this.apellidos = apellidos;
  
    }
    public final String nombre;
    public final String apellidos;

    public String getNombre() {
        return nombre;
    }
    public String getApellidos() {
        return apellidos;
    }

    
}

