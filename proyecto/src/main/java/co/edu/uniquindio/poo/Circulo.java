package co.edu.uniquindio.poo;

public class Circulo extends FiguraGeometrica {

    static double radio;
    public static void main(String[] args) {

        assert radio > 0;
        System.out.println("La medida no puede ser negativa");

    }   

    public static double getRadio() {
        return radio;
    }

    public static void setRadio(double radio) {
        Circulo.radio = radio;
    }

    public Circulo(double radio) {
        this.radio = radio;
    }
    
}
