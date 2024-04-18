package co.edu.uniquindio.poo;

public abstract class Figura {

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    String nombre;

    public abstract float calcularArea ();

    public String getNombre() {
        return nombre;
    }
    
}
