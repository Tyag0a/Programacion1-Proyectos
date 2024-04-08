package co.edu.uniquindio.poo;

public class Cuadrado extends FiguraGeometrica {

    static double lado;

    public static void main(String[] args) {

        assert lado > 0;
        System.out.println("La medida no puede ser negativa");

    }   

    public static double getLado() {
        return lado;
    }
    
}
