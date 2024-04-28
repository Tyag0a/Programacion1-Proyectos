package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.Collection;
import java.util.LinkedList;

public class Pedido {

    LocalDate fecha;

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public LocalDate getFecha() {
        return fecha;
    }
    int cantidad;

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public int getCantidad() {
        return cantidad;
    }

    Producto productoPedido;

    public void setProductoPedido(Producto productoPedido) {
        this.productoPedido = productoPedido;
    }

    public Producto getProductoPedido() {
        return productoPedido;
    }

    Cliente clientePedido;


    public void setClientePedido(Cliente clientePedido) {
        this.clientePedido = clientePedido;
    }

    public Cliente getClientePedido() {
        return clientePedido;
    }

    public final Collection<Pedido> listadoPedido; //Listado de productos y cantidades pedida por el cliente

    public Pedido(LocalDate fecha, int cantidad, Producto productoPedido, Cliente clientePedido) {
        this.fecha = fecha;
        this.cantidad = cantidad;
        this.productoPedido = productoPedido;
        this.clientePedido = clientePedido;
        listadoPedido = new LinkedList<>();
    }

    public Collection<Pedido> getListadoPedido() {
        return listadoPedido;
    }

    @Override
    public String toString() {
        return "Pedido [fecha=" + fecha + ", cantidad=" + cantidad + ", productoPedido=" + productoPedido
                + ", clientePedido=" + clientePedido + ", listadoPedido=" + listadoPedido + "]";
    }

  //*Metodo para calcular costo total de un pedido

    public double calcularCostoTotalPedido(Pedido pedido) {
        double costoTotalPedido = 0.0; //Declaramos variable
            Producto productoPedido = pedido.getProductoPedido(); //variables para almacenar info de productos pedidos
            int cantidad = pedido.getCantidad(); 
            double precio = productoPedido.getPrecio(); 
            double costoProducto = cantidad * precio; //calcular el precio a medida que se recorre la lista, se va sumando o iterando el total
            costoTotalPedido += costoProducto; 
    
        return costoTotalPedido;
    }
    
}
