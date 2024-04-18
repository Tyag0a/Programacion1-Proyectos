package co.edu.uniquindio.poo;

public class Rectangulo extends Figura {

    public float ancho;
    
    public float getAncho() {
        return ancho;
    }

    public float alto;

    public Rectangulo(String nombre, float ancho, float alto) {
        super(nombre);
        this.ancho = ancho;
        this.alto = alto;
    }

    public float getAlto() {
        return alto;
    }

    @Override
    public float calcularArea () {
        return ancho * alto;

    }
    
}
