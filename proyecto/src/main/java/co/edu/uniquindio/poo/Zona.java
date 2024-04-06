package co.edu.uniquindio.poo;

public class Zona {
    private String nombre;
    private Material material;
    
    public Zona(String nombre, Material material) {
        this.nombre = nombre;
        this.material = material;
    }

    public String getNombre() {
        return nombre;
    }
    
    public Material getMaterial() {
        return material;
    }

}
