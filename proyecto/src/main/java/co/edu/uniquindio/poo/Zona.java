package co.edu.uniquindio.poo;

public class Zona {
    private String nombre;
    private Material material;
    FiguraGeometrica figuraGeometrica;
    
    public Zona(String nombre, Material material, FiguraGeometrica figuraGeometrica) {
        this.nombre = nombre;
        this.material = material;
        this.figuraGeometrica = figuraGeometrica;
    }

    public String getNombre() {
        return nombre;
    }
    
    public Material getMaterial() {
        return material;
    }

    public FiguraGeometrica getFiguraGeometrica() {
        return figuraGeometrica;
    }

    public void setFiguraGeometrica(FiguraGeometrica figuraGeometrica) {
        this.figuraGeometrica = figuraGeometrica;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

}
