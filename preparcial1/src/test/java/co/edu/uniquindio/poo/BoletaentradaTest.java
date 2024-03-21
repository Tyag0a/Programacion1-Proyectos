package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class BoletaentradaTest {

    private static final Logger LOG = Logger.getLogger(BoletaentradaTest.class.getName());

    @Test
    public void datosCompletos() {
        LOG.info("Iniciado test datos completos");

        Boletaentrada boletaentrada = new Boletaentrada(LocalDate.of(2024, 3, 14), LocalTime.of(8, 45, 0), "Shrek 5", 30000);

        assertEquals(LocalDate.of(2024, 3, 14), boletaentrada.getFecha());
        assertEquals(LocalTime.of(8, 45, 0), boletaentrada.getHora());
        assertEquals("Shrek 5", boletaentrada.getNombre());
        assertEquals(30000, boletaentrada.getValor());
    
        LOG.info("Finalizando test datos completos");
    }

    @Test
    public void datosNulos() {
        LOG.info("Iniciado test de datos nulos");

        assertThrows(Throwable.class, () -> new Boletaentrada(null, null, null, 200000));
       
        LOG.info("Finalizando test de datos nulos");
    }

    @Test
    public void valorMayorA5mil() {
        LOG.info("Iniciado test de no aceptar un valor mayor a 5 mil pesos");
        
        assertThrows(Throwable.class, () -> new Boletaentrada(LocalDate.of(2023, 3, 14),LocalTime.of(8, 45, 0), "Shrek 5", 2000));

        LOG.info("Finalizando test de no aceptar un valor mayor a 5 mil pesos");
    }

    
    
}
