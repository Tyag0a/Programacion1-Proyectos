package co.edu.uniquindio.poo;

import java.util.*;
import java.util.function.Predicate;

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

    //* Metodo para saber si ya existe un producto en la lista con el mismo codigo

    private boolean productoExiste (String codigoProducto, Collection<Producto> listaProductos) {
        Predicate<Producto> idIgual = producto -> producto.getCodigoProducto().equals(codigoProducto);

        return listaProductos.stream().filter(idIgual).findAny().isPresent();

    }

    public void agregarProducto (Producto producto) { //Agregar producto a la lista llamando al metodo productoExiste
        assert !this.productoExiste(producto.getCodigoProducto(),this.listaProductos) :"El producto ya existe";
        this.listaProductos.add(producto);

    }

    public void eliminarProducto (Producto producto) { //eliminar producto de la lista
        listaProductos.remove(producto);

    }

    /*
     * Metodo para obtener los productos con un stock mayor a 100 y meterlos en una lista, luego retornarla
     */

    public List<Producto> productosStockMayor10() {
        List<Producto> listaProductosStockMayor10 = new LinkedList<>();

        for (Producto producto : listaProductos) {

            if (producto.getStock() > 10) {
                listaProductosStockMayor10.add(producto);
            }
        }
        return listaProductosStockMayor10;

    }
    //*Metodo para validar que un stock pedido no supere el disponible, y que el stock pedido no este vacio

    public boolean validarStockDePedido (Pedido pedido) {
        
        Producto productoPedido = pedido.getProductoPedido(); //* se obtienen los datos del pedido y se almacenan en variables
         int cantidadPedido = pedido.getCantidad();
         int stockDisponible = productoPedido.getStock();

         //* asserts para verificar que el stock pedido no sea menor al disponible, y para
         //* que el stock pedido no sea 0

        assert cantidadPedido <= stockDisponible : "La cantidad pedida supera la cantidad de stock disponible";
        assert cantidadPedido > 0 :"La cantidad pedida del producto no puede ser 0";

            if (cantidadPedido > stockDisponible) {
                return false;
            }
            return true; //* retorna true si si hay stock disponible

    }
    
}
