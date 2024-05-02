package co.edu.uniquindio.poo;

public class CuentaAhorros extends CuentaBancaria {

    public final double tasaInteres;

    public CuentaAhorros(Titular titular, int numeroCuenta, double saldo, boolean estado, double tasaInteres) {
        super(titular, numeroCuenta, saldo, estado);
        this.tasaInteres = tasaInteres;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    @Override
    public void depositar(double valor) {
        assert valor > 0;
        saldo = saldo + valor;
        estado = true;
     
    }

    @Override
    public void retirar(double valor) {
        assert valor > 0;
        assert valor <= saldo :"El valor a retirar no debe superar el saldo disponible";
        saldo = saldo - valor;

        if (saldo <= 0){
            estado = false;
        }
   
    }

    
    
}
