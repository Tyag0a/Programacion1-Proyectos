package co.edu.uniquindio.poo;

public enum Municipio {

    ARMENIA("Armenia",0),CALARCA("Calarca",100000),
    MONTENEGRO("Montenegro",200000),QUIMBAYA("Quimbaya",300000),
    TEBAIDA("Tebaida",150000),CIRCASIA("Circacia",180000),
    FILANDIA("Filandia",220000),GENOVA("Genova",700000),
    SALENTO("Salento",0000);

//* atributo "sobrecosto" para poder darle un valor a cada municipio,
//* Y atributo nombre para poder cumplir uno de los requisitos del problema

    private final String nombreMunicipio;
    private final double sobreCosto;

    public double getSobreCosto() {
        return sobreCosto;
    }

    public String getNombreMunicipio() {
        return nombreMunicipio;
    }

    Municipio(String nombreMunicipio, double sobreCosto) {
        this.nombreMunicipio = nombreMunicipio;
        this.sobreCosto = sobreCosto;
    }
    
    
}
