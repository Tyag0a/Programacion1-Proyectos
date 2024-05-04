package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class CuentaBancariaTest {

    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void depositarDinero (){
        LOG.info("Iniciado test");
        Titular titular = new Titular("Maria", "carmen");
        CuentaAhorros cuentahorros = new CuentaAhorros(titular, "9018e628", 0, false, 0);
        Transaccion transaccion = new Transaccion(2489, 1.000, LocalDate.of(2024, 4, 5), "wkdwejgn3", true, TipoTransaccion.DEPOSITAR);

        cuentahorros.depositar(transaccion);

        assertEquals(cuentahorros.getSaldo(), transaccion.getValor());


        

        LOG.info("Finalizando test");


    }

    @Test
    public void retirarDinero(){
        LOG.info("Iniciado test");




        LOG.info("Finalizando test");


    }

    @Test
    public void retirarDineroNegativo(){
        LOG.info("Iniciado test");




        LOG.info("Finalizando test");
    }
    
}
