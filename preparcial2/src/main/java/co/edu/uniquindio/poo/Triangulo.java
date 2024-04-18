package co.edu.uniquindio.poo;

public class Triangulo extends Figura {
    
    public Triangulo(String nombre, float base, float altura) {
        super(nombre);
        this.base = base;
        this.altura = altura;
    }

    public float base;
    
    public float getBase() {
        return base;
    }

    public float altura;

    public float getAltura() {
        return altura;
    }

    @Override
    public float calcularArea () {
        return (base * altura)/ 2;

    }
    
}
