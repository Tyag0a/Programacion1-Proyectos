package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.util.ArrayList;
import java.util.List;
import java.util.logging.Logger;

import org.junit.jupiter.api.Test;

public class VeterinariaTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void agregarMascota() {

        /*Prueba para agregar una mascota a la lista 
         * 
         */
        LOG.info("Iniciado test de agregar mascota a lista");

        List<Mascota> listaMascotas = new ArrayList<Mascota>();

        listaMascotas.add(new Mascota("Ernesto", "gato", "naranja", 5, "macho", "naranja", 20, "01"));

        LOG.info("Finalizando test de agregar mascota a lista");
    }

    @Test
    public void agregarMascotaRepetida() {

        /*Prueba para agregar una mascota repetida a la lista 
         * 
         */
        LOG.info("Iniciado test de agregar mascota repetida a lista");

        List<Mascota> listaMascotas = new ArrayList<Mascota>();

        var mascota1 = new Mascota("Ernesto", "gato", "naranja", 5, "macho", "naranja", 20, "01");
        var mascota2 = new Mascota("Juan", "caballo", "arabe", 20, "macho", "cafe", 100, "01");
        listaMascotas.add(mascota1);

        Veterinaria.registrarMascota(mascota1);

        assertThrows(Throwable.class, () -> Veterinaria.registrarMascota(mascota2));

       LOG.info("Finalizando test de agregar mascota repetida a lista");
    }  

    
}
