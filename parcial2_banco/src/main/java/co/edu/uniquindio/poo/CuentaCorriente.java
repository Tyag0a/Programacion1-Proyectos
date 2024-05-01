package co.edu.uniquindio.poo;

public class CuentaCorriente extends CuentaBancaria {
    
    public double sobreGiro;

    public CuentaCorriente(Titular titular, int numeroCuenta, double saldo, boolean estado, double sobreGiro) {
        super(titular,numeroCuenta,saldo,estado);
        this.sobreGiro = sobreGiro;
    }

    public double getSobreGiro() {
        return sobreGiro;
    }

    public void setSobreGiro(double sobreGiro) {
        this.sobreGiro = sobreGiro;
    }




    
    @Override
    public void depositar() {
     
    }

    @Override
    public void retirar() {

    }
    
}
