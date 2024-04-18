package co.edu.uniquindio.poo;

public class Cuadrado extends Rectangulo{

    public Cuadrado(String nombre, float ancho, float alto) {
        super(nombre, ancho, alto);

    }

    @Override
    public float calcularArea () {
        return ancho * alto;

    }


    
}
