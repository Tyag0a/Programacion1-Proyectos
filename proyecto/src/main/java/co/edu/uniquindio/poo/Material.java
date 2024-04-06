package co.edu.uniquindio.poo;

public enum Material {
    ARENA(100000),GRAMANTURAL(200000),GRAMAARTIFICIAL(350000),
     ASFALTO(400000);

    private final int valor;

    Material(int valor) {
        this.valor = valor;
    }

    public int retornarValor() {
        return valor;
    }
}
