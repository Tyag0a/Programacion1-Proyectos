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
    public void depositar() {
     
    }

    @Override
    public void retirar() {
   
    }

    
    
}
