package co.edu.uniquindio.poo;

import java.util.*;

public class Drogueria {

    public String nombre;
    public Collection<Producto> listaProductos;
    public final Collection<Pedido> listaPedidos;
    public final Collection<Cliente> listaClientes;
    public final Collection<Empleado> listaEmpleados;

    public Collection<Empleado> getListaEmpleados() {
        return listaEmpleados;
    }

    public Collection<Cliente> getListaClientes() {
        return listaClientes;
    }

    public Collection<Pedido> getListaPedidos() {
        return listaPedidos;
    }

    public Collection<Producto> getListaProductos() {
        return listaProductos;
    }

    public String getNombre() {
        return nombre;
    }

    public Drogueria (String nombre) {
        this.nombre = nombre;
        listaProductos = new LinkedList<>();
        listaPedidos = new LinkedList<>();
        listaClientes = new LinkedList<>();
        listaEmpleados = new LinkedList<>();
    }

    public void agregarProducto (Producto producto) { //Agregar producto a la lista
        listaProductos.add(producto);

    }

    public void eliminarProducto (Producto producto) { //eliminar producto de la lista
        listaProductos.remove(producto);

    }

    /*
     * Metodo para obtener los productos con un stock mayor a 100 y meterlos en una lista, luego retornarla
     */

    public List<Producto> productosStockMayor100() {
        List<Producto> listaProductosStockMayor100 = new LinkedList<>();

        for (Producto producto : listaProductos) {

            if (producto.getStock() > 100) {
                listaProductosStockMayor100.add(producto);
            }
        }
        return listaProductosStockMayor100;

    }
    
}
