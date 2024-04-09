package co.edu.uniquindio.poo;

public class Rectangulo extends FiguraGeometrica{

    static double ancho;
    static double alto;

    public static void main(String[] args) {

        assert ancho > 0;
        assert alto > 0;
        System.out.println("Las medidas no pueden ser negativas");

    }   
    
    public static double getAncho() {
        return ancho;
    }
    public static double getAlto() {
        return alto;
    }

    public static void setAncho(double ancho) {
        Rectangulo.ancho = ancho;
    }

    public static void setAlto(double alto) {
        Rectangulo.alto = alto;
    }
    
}
