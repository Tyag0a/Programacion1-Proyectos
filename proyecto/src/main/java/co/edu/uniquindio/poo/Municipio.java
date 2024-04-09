package co.edu.uniquindio.poo;

public enum Municipio {

    ARMENIA(0),CALARCA(100000),MONTENEGRO(200000),QUIMBAYA(300000),
    TEBAIDA(150000),CIRCASIA(180000),FILANDIA(220000),
    GENOVA(700000),SALENTO(500000),PIJAO(400000),CORDOBA(300000),
    BUENAVISTA(350000);

//* atributo "sobrecosto" para poder darle un valor a cada municipio, y este se pueda obtener retornandolo

    private final int sobreCosto;

    public int getSobreCosto() {
        return sobreCosto;
    }

    Municipio(int sobreCosto) {
        this.sobreCosto = sobreCosto;
    }
    
    
}
