package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;
import java.util.*;

public abstract class Figura {

    public Figura(String nombre) {
        this.nombre = nombre;
        listaFiguras = new LinkedList<>();
    }

    String nombre;
    public final Collection<Figura> listaFiguras;


    public Collection<Figura> getListaFiguras() {
        return listaFiguras;
    }

    public abstract float calcularArea ();

    public String getNombre() {
        return nombre;
    }

    public List<Figura> obtenerFigurasOrdenadas (){
        List<Figura> listaFigurasOrdenadasArea = new LinkedList<>();

        return listaFigurasOrdenadasArea;
    }
}
