package co.edu.uniquindio.poo;

public class CuentaCorriente extends CuentaBancaria {
    
    public double sobreGiro;

    public CuentaCorriente(Titular titular, String numeroCuenta, double saldo, boolean estado, double sobreGiro) {
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
    public void depositar(Transaccion transaccion) {
        assert transaccion.getValor() > 0;
        saldo = saldo + transaccion.getValor();
        estado = true;
     
    }

    @Override
    public void retirar(Transaccion transaccion) {
        assert transaccion.getValor() > 0;
        assert transaccion.getValor() <= saldo + sobreGiro;
        if (saldo < transaccion.getValor()){
            saldo = ((saldo + sobreGiro) - sobreGiro - transaccion.getValor());
        }

        if (saldo <= 0){
            estado = false;
        }
    }
    
}
