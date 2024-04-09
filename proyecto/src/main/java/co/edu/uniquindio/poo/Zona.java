package co.edu.uniquindio.poo;

public class Zona {
    public String nombreZona;
    private Material material;
    FiguraGeometrica figuraGeometrica;
    
    public Zona(String nombreZona, Material material, FiguraGeometrica figuraGeometrica) {
        this.nombreZona = nombreZona;
        this.material = material;
        this.figuraGeometrica = figuraGeometrica;
    }

    public String getNombreZona() {
        return nombreZona;
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

    public void setNombre(String nombreZona) {
        this.nombreZona = nombreZona;
    }

    public void setMaterial(Material material) {
        this.material = material;
    }

}
