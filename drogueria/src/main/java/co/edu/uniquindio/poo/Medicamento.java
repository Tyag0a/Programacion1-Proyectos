package co.edu.uniquindio.poo;

public class Medicamento extends Producto {

    double dosis;

    public Medicamento(String codigoProducto, String nombre, String descripcion, double precio, int stock, String proveedor, String compuestoActivo, double dosis) {
        super(codigoProducto, nombre, descripcion, precio, stock, proveedor);  
        this.dosis = dosis;
    }

    public double getDosis() {
        return dosis;
    }
    
}
