package co.edu.uniquindio.poo;


import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import java.util.logging.Logger;
import org.junit.jupiter.api.Test;


public class DrogueriaTest {
    
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    @Test
    public void pedidoStockVacio() {
        LOG.info("Iniciado test de Stock vacio ");

        //* test unitario para probar el funcionamiento del metodo validarstock, enviando un stock pedido de 0
        //* assertThrow para que se cumpla la excepcion

        Drogueria drogueria = new Drogueria("skofvvn");
        Producto producto1 = new Producto("1298598", "Acetaminofen", "wjuif", 5.000, 10,"Proovedor X");
        Cliente cliente1 = new Cliente("maria", "wjdb", "1917374681", "Armenia av. X", "32983772");
        Pedido pedido = new Pedido(LocalDate.of(2024, 4, 27), 0, producto1,cliente1);

        assertThrows(Throwable.class, () -> drogueria.validarStockDePedido(pedido));



        LOG.info("Finalizando test de stock vacio");
    }

    @Test
    public void pruebaObtenerStockMayorA10 () {
        LOG.info("Iniciado test de obtener Stock mayor a 10 ");

        //* test unitario para probar el funcionamiento del metodo productosStockMayor10 
        //* se crea una lista esperada y se compara con la lista que regresa el metodo

        Drogueria drogueria = new Drogueria("J");

        Producto producto1 = new Producto("02048", "acetaminofen", "inmortal", 3.000, 11, "Proveedor x");
        Producto producto2 = new Producto("20400", "Shampoo A", "calvo", 12.000, 5, "Proveedor Y");
        Producto producto3 = new Producto("34879", "Jabon B", "qjihwd", 6.000, 25, "Proovedor Z");
        Producto producto4 = new Producto("96781", "Advil", "iuhduefbe", 7.000, 9, "Proovedor W");

        drogueria.agregarProducto(producto1);
        drogueria.agregarProducto(producto2);
        drogueria.agregarProducto(producto3);
        drogueria.agregarProducto(producto4);

        Collection<Producto> listaEsperada = List.of(producto1,producto3);

        assertIterableEquals(listaEsperada, drogueria.productosStockMayor10());




        LOG.info("Finalizando test de obtener stock mayor a 10");

    }




    
}
