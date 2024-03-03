package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Cursoreal {
    private final String nombre;
    private final Collection<Estudiante> listaEstudiantes;

    public Cursoreal(String nombre){
        this.nombre = nombre;
        this.listaEstudiantes = new LinkedList<Estudiante>();

    }

    public String getNombre(){
        return nombre;
    }
    
    public Collection<Estudiante> getlistaEstudiantes(){

    /*
      public void setNombre(String nombre){
        this.nombre = nombre;

      }


     /* */
     /* */
     
     

}    
