package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.*;
//* con la importacion "import java.util.*;" se importan todas las clases del paquete java.util"

public class Proyecto {
    private final String nombre;
    private final double costoTotal;
    private final Collection<ParqueInfantil> listaParquesInfantiles;


    public Proyecto(String nombre, double costoTotal) {
        this.nombre = nombre;
        this.costoTotal = costoTotal;
        listaParquesInfantiles = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public Collection<ParqueInfantil> getListaParquesInfantiles() {
        return Collections.unmodifiableCollection(listaParquesInfantiles);
    }

    //* 1er METODO: para ordenar la lista de parques de forma ascendente tomando el costo del parque,
    //* por esto hay un nuevo atributo en parqueInfantiles llamado " costo" 

    public void ordenarParquesInfantilesAscendente() {
        //* creo una nueva linkedlist para almacenar los parques ordenados en lista ordenada, una copia de la lista originallll
        //* en collections.sort especificamos que queremos comparar dos objetos de tipo parque infantil (en new comparator)

        List<ParqueInfantil> listaOrdenada = new LinkedList<>(listaParquesInfantiles);
        Collections.sort(listaOrdenada, new Comparator<ParqueInfantil>() {

            //*  ya definido el tipo de objetos que se va a comparar, se envian dos parques para compararse y ser ordenados
            //*  a este metodo compare le decimos que seran comparados datos de tipo double, osea el costo y de acuerdo a esto se ordenara
            public int compare(ParqueInfantil p1, ParqueInfantil p2) {
                return Double.compare(p1.getCosto(), p2.getCosto());
            }
        });

      
        listaParquesInfantiles.clear(); //* vaciamos la lista 
        listaParquesInfantiles.addAll(listaOrdenada); //* añadimos los elementos de lista ordenada a la lista que vaciamos, quedando dos copias.
    }
    
 //* 2do METODO: buscar un parque por su nombre (recorriendo la lista con for y condicionando con if, ademas del getNombre)

    public ParqueInfantil buscarParquePorNombre(String nombre) {
         for (ParqueInfantil parqueInfantil : listaParquesInfantiles) { //* Recorremos la lista con un for each clasico
             if (parqueInfantil.getNombre().equals(nombre)) {  //* Con un if comparamos el nombre de cada parque con un equals y lo obtenemos con el get
                 return parqueInfantil; //* si se encuentra el nombre retorna TODO el parque
                }
            }
         return null; //* si no se encuntra el nombre retorna un nulo
    }

 //* 3er METODO: calcular el valor total del proyecto, suponiendo que se sabe el costo total de cada parque 
 //* y sumando sus costos, para el costo del parque se tiene que sumar el sobrecosto del municipio y de los materiales teniendo en cuenta el area de las zonas,
 //* pero no me dio tiempo para hacer un metodo para ello

    public double calcularValorTotalProyecto () {
        double valorTotal = 0.0;
        for (ParqueInfantil parque : listaParquesInfantiles){
            valorTotal = valorTotal + parque.getCosto();
        }
        return valorTotal;   

    
     }
//* metodo para obtener una lista de parques d un municipio
//*  tocaria hacer un metodo exactamente igual que este por cada municipio y
//*  en el argumento de perteneceAMunicipio poner el nombre del municipio, para asi hacer la condicion y agregar el parque a la lista si se cumple

     public List<ParqueInfantil> obtenerParquesPorMunicipio(Municipio municipio) {
        List<ParqueInfantil> parquesPorMunicipio = new LinkedList<>();

        for (ParqueInfantil parque : listaParquesInfantiles) {
            if (parque.perteneceAMunicipio("Armenia")) {
                parquesPorMunicipio.add(parque);
            }
        }

        return parquesPorMunicipio;
    }
   
}
