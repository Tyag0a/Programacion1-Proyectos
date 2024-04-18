package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class TestCirculo {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void areaCirculoPositivo() {
        LOG.info("Iniciando test area positivo");
        Circulo circulo = new Circulo(314.45);



        LOG.info("Finalizando test de area positiva");

    }

    
}
