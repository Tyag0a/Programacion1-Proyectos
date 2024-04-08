package co.edu.uniquindio.poo;

public class Triangulo extends FiguraGeometrica {

    static double base;
    static double altura;

    public static void main(String[] args) {

        assert base > 0;
        assert altura > 0;
        System.out.println("Las medidas no pueden ser negativas");

    }   
    
    public static double getBase() {
        return base;
    }
    public static double getAltura() {
        return altura;
    }
    
}
