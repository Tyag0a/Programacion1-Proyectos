package co.edu.uniquindio.poo;

public class FiguraGeometrica {

    //* metodos para calcular area de cada figura geometrica 
    
    public double calcularAreaTriangulo (double base, double altura) {
        double areaTriangulo = 0.0;

        areaTriangulo = (Triangulo.getBase() * Triangulo.getAltura()) / 2;

        return areaTriangulo;

    }    

    public double calcularAreaRectangulo (double ancho, double alto) {
        double areaRectangulo = 0.0;

        areaRectangulo = Rectangulo.getAlto() * Rectangulo.getAlto();

        return areaRectangulo;

    }  
    
    public double calcularAreaCuadrado (double lado) {
        double areaCuadrado = 0.0;

        areaCuadrado = Cuadrado.getLado() * 2;

        return areaCuadrado;

    }  
    
    public double calcularAreaCirculo (double base, double altura) {
        double areaCirculo = 0.0;

        areaCirculo = 3.14 * (Circulo.getRadio() * Circulo.getRadio());

        return areaCirculo;

    } 
    
}

    /*
     * 
     * clase: public abstract class figurageometrica
     * metodo: public abstract double calculararea (  )
     * 
     * public double calculararea () {
     *  return math.PI * math.pow(radio,2)
     */