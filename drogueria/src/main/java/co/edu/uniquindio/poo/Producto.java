package co.edu.uniquindio.poo;

public class Producto {

    public Producto(String codigoProducto, String nombre, String descripcion, double precio, int stock,
            String proovedor) {
        this.codigoProducto = codigoProducto;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
        this.proovedor = proovedor;
    }

    String codigoProducto;
    String nombre;
    String descripcion;
    double precio;
    int stock;
    String proovedor;

    public String getProovedor() {
        return proovedor;
    }

    public int getStock() {
        return stock;
    }

    public double getPrecio() {
        return precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCodigoProducto() {
        return codigoProducto;
    }
    
}
