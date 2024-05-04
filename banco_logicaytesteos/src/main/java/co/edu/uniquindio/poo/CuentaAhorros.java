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

    @Override
    public void depositar(Transaccion transaccion) {
        assert transaccion.getValor() > 0;
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
