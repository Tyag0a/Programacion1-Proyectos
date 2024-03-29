package co.edu.uniquindio.poo;

//*public class Curso  {
    //public Curso(String nombreCurso) {

    
    /*Arraylist: estructura de datos para organizar informacion, uno de los metodos para hacer colecciones
     * Creamos una lista principal llamada lista de estudiantes y se le añade sublistas con sus atributod
     */
    
    // List<ArrayList> listaEstudiantes = new ArrayList<ArrayList> ();

    // ArrayList<String> nombreyapellido= new ArrayList<>();
     //**ArrayList<String> numeroIdentidad= new ArrayList<>();
    // ArrayList<String> correo= new ArrayList<>();
     //ArrayList<String> telefono= new ArrayList<>();
    // ArrayList<String> edad= new ArrayList<>();

    // listaEstudiantes.add(nombreyapellido);
    // listaEstudiantes.add(numeroIdentidad);
     //listaEstudiantes.add(edad);
     //listaEstudiantes.add(correo);
    // listaEstudiantes.add(telefono);
    //*
     //nombreyapellido.add("elver go");
     //numeroIdentidad.add("1902982248387");
     //edad.add("19");
    // correo.add("1902982248387");
    // telefono.add("309227377");

    import java.util.Collection;
    import java.util.Collections;
    import java.util.Comparator;
    import java.util.LinkedList;
    import java.util.Optional;
    import java.util.function.Predicate;
    
    public class Curso {
        private final String nombre;
        private final Collection<Estudiante> estudiantes;
    
        /**
         * Método constructor de la clase Curso
         * 
         * @param nombre Nombre del curso
         */
        public Curso(String nombre) {
            assert nombre != null : "El nombre no puede ser nulo";
            this.nombre = nombre;
            estudiantes = new LinkedList<>();
        }
    
        /**
         * Método para obtener el nombre del curso
         * 
         * @return Nombre del curso
         */
        public String getNombre() {
            return nombre;
        }
    
        /**
         * Método para agregar a un estudiante al curso
         * 
         * @param estudiante Estudiante que se desea agregar
         */
        public void agregarEstudiante(Estudiante estudiante) {
            assert validarNumeroIdentificacionExiste(estudiante.numeroIdentificacion()) == false
                    : "El número de identificación ya existe.";
            estudiantes.add(estudiante);
        }
    
        /**
         * Método para buscar un estudiante dado el número de indicación
         * 
         * @param numeroIdenficacion Número de identificación del estudiante a buscar
         * @return Estudiante con el número de indicación indicado o null
         */
        public Optional<Estudiante> getEstudiante(String numeroIdenficacion) {
            Predicate<Estudiante> condicion = estudiante -> estudiante.numeroIdentificacion().equals(numeroIdenficacion);
    
            return estudiantes.stream().filter(condicion).findAny();
        }
    
        /**
         * Método para obtener la colección NO modificable de los estudiantes del curso
         * 
         * @return la colección NO modificable de los estudiantes del curso
         */
        public Collection<Estudiante> getEstudiantes() {
            return Collections.unmodifiableCollection(estudiantes);
        }
    
        /**
         * Método para obtener la colección NO modificable de los estudiantes del curso en orden alfabético
         * 
         * @return la colección NO modificable de los estudiantes del curso en orden alfabético
         */
        public Collection<Estudiante> getListadoAlfabetico() {
            var comparador = Comparator.comparing(Estudiante::nombres);
            var estudiantesOrdenados = estudiantes.stream().sorted(comparador).toList();
            return Collections.unmodifiableCollection(estudiantesOrdenados);
        }
    
        /**
         * Método para obtener la colección NO modificable de los estudiantes del curso en orden descendente de la edad
         * 
         * @return la colección NO modificable de los estudiantes del curso en descendente por edad.
         */
        public Collection<Estudiante> getListadoEdadDescente() {
            var comparador = Comparator.comparing(Estudiante::edad).reversed();
            var estudiantesOrdenados = estudiantes.stream().sorted(comparador).toList();
            return Collections.unmodifiableCollection(estudiantesOrdenados);
        }
    
        /**
         * Método para obtener la colección NO modificable de los estudiantes del curso que son menores de edad
         * 
         * @return la colección NO modificable de los estudiantes del curso que son menores de edad.
         */
        public Collection<Estudiante> getListadoMenoresEdad() {
            return estudiantes.stream()
                    .filter(estudiante -> estudiante.edad() < 18)
                    .toList();
        }
    
        /**
         * Método privado para determinar si ya existe un estudiante registro en el
         * mismo número de identificación
         * 
         * @param numeroIdentificacion Número de identificación a buscar
         * @return Valor boolean que indica si el número de identificación ya está o no
         *         registrado.
         */
        private boolean validarNumeroIdentificacionExiste(String numeroIdentificacion) {
    
            Predicate<Estudiante> condicion = estudiante -> estudiante.numeroIdentificacion().equals(numeroIdentificacion);
            return estudiantes.stream().filter(condicion).findAny().isPresent();
        }
    }
