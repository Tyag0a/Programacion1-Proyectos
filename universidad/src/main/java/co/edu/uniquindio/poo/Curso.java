package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;
import co.edu.uniquindio.poo.Estudiante;

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

     nombreyapellido.add("jjj");
     numeroIdentidad.add("");

     }
    
    
}
