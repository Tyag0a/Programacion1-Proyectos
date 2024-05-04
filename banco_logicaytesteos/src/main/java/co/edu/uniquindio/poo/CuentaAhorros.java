package co.edu.uniquindio.poo;


public class CuentaAhorros extends CuentaBancaria {

    public final double tasaInteres;

    public CuentaAhorros(Titular titular, String numeroCuenta, double saldo, boolean estado, double tasaInteres) {
        super(titular, numeroCuenta, saldo, estado);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    //Metodos para retirar o depositar dinero a la cuenta de ahorros

    @Override
    public void depositar(Transaccion transaccion) {
        assert transaccion.getValor() > 0 :"No se puede depositar una cantidad negativa o nula de dinero";
        saldo = saldo + transaccion.getValor();
        estado = true;
     
    }

    @Override
    public void retirar(Transaccion transaccion) {
        assert transaccion.getValor() > 0;
        assert transaccion.getValor() <= saldo :"El valor a retirar no debe superar el saldo disponible";
        saldo = saldo - transaccion.getValor();

        if (saldo <= 0){
            estado = false;
        }
   
    }   

    
}
