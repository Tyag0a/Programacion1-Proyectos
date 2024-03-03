package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CursoTest {

    public void datosCompletos(){

        LOG.info("Inicio datos completos");
        Curso curso1 = new Curso("Programacion 1");

        assertEquals("Logica de prog", curso1.getNombre());
        LOG.info("Fin de datos completos");

    }   
    
}
