/**
 * Clase para probar el funcionamiento del código de el caso de estudio veterinaria.
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */

    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test de datos completos");
        Mascota mascota = new Mascota("Juan","Caballo", "Arabe", 20, "macho", "cafe", 100);

        assertEquals("Juan", mascota.nombre());
        assertEquals("Caballo", mascota.especie());
        assertEquals("Arabe", mascota.raza());
        assertEquals(20, mascota.edad());
        assertEquals("macho", mascota.genero());
        assertEquals("cafe", mascota.color());
        assertEquals(100, mascota.peso());

        LOG.info("Finalizando test de datos completos");
    }

    @Test
    public void datosNulos() {
        LOG.info("Iniciado test de datos nulos");

        assertThrows(Throwable.class, () -> new Mascota(null, null, null, 20, null, null, 100));
        

        LOG.info("Finalizando test de datos nulos");
    }

    @Test
    public void edadNegativa() {
        LOG.info("Iniciado test de Edad negativa");

        assertThrows(Throwable.class, () -> new Mascota("Juan","Caballo","Arabe", -20,"macho", "cafe", 100));

        LOG.info("Finalizando test de edad negativa");
    }

    @Test
    public void pesoNegativo() {
        LOG.info("Iniciado test de peso negativo");

        assertThrows(Throwable.class, () -> new Mascota("Juan","Caballo","Arabe", 20,"macho", "cafe", -100));

        LOG.info("Finalizando test de peso negativo");
    }

    @Test
    public void especieIncorrecta() {
        LOG.info("Iniciado test de especie incorrecta");
        Mascota mascota = new Mascota("Juan","Caballo", "Arabe", 20, "macho", "cafe", 100);

        assertEquals("Juan", mascota.nombre());
        assertEquals("Tortuga", mascota.especie());
        assertEquals("Arabe", mascota.raza());
        assertEquals(20, mascota.edad());
        assertEquals("macho", mascota.genero());
        assertEquals("cafe", mascota.color());
        assertEquals(100, mascota.peso());

        LOG.info("Finalizando test de datos completos");
    }

    
        


}   
