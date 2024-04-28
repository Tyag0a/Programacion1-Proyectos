package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.LocalDate;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;

public class PedidoTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void calcularCostoTotalPedido() {
        LOG.info("Iniciado test de calcular el costo total de un pedido");

        //* prueba unitaria para probar el funcionamiento del metodo calcularCostoTotalpedido
        //* se crea una variable que calcule el costo del pedido, y se compara con el costo que devuelve el metodo

        Cliente cliente = new Cliente("Maria", "melano", "0993847729784", "X", "301083247");
        Producto producto = new Producto("20400", "Shampoo A", "calvo", 12.000, 5, "Proveedor Y");
        Pedido pedido = new Pedido(LocalDate.of(2024, 4, 28), 5, producto, cliente);

        double costoTotalEsperado = 5 * 12.000;

        assertEquals(costoTotalEsperado, pedido.calcularCostoTotalPedido(pedido));

        LOG.info("Finalizando test de calcular el costo total de un pedido");

    }

    
}
