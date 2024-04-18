package co.edu.uniquindio.poo;

import java.time.LocalDate;

public class Pedido {

    LocalDate fecha;

    public LocalDate getFecha() {
        return fecha;
    }
    int cantidad;

    public int getCantidad() {
        return cantidad;
    }

    Producto productoPedido;

    public Producto getProductoPedido() {
        return productoPedido;
    }

    Cliente clientePedido;



    public Cliente getClientePedido() {
        return clientePedido;
    }

    public Pedido(LocalDate fecha, int cantidad, Producto productoPedido, Cliente clientePedido) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.productoPedido = productoPedido;
        this.clientePedido = clientePedido;
    }
    
}
