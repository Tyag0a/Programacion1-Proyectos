package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;

public class Curso  {
    public Curso(String nombreCurso) {

    
    /*Arraylist: estructura de datos para organizar informacion, uno de los metodos para hacer colecciones
     * Creamos una lista principal llamada lista de estudiantes y se le añade sublistas con sus atributod
     */
    
     List<ArrayList> listaEstudiantes = new ArrayList<ArrayList> ();

     ArrayList<String> nombreyapellido= new ArrayList<>();
     ArrayList<String> numeroIdentidad= new ArrayList<>();
     ArrayList<String> correo= new ArrayList<>();
     ArrayList<String> telefono= new ArrayList<>();
     ArrayList<String> edad= new ArrayList<>();

     listaEstudiantes.add(nombreyapellido);
     listaEstudiantes.add(numeroIdentidad);
     listaEstudiantes.add(edad);
     listaEstudiantes.add(correo);
     listaEstudiantes.add(telefono);

     nombreyapellido.add("elver go");
     numeroIdentidad.add("1902982248387");
     edad.add("19");
     correo.add("1902982248387");
     telefono.add("309227377");



     }
    
    
}
