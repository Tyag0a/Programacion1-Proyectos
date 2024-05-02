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
    public void depositar(double valor) {
        assert valor > 0;
        saldo = saldo + valor;
        estado = true;
     
    }

    @Override
    public void retirar(double valor) {
        assert valor > 0;
        assert valor <= saldo + sobreGiro;
        if (saldo < valor){
            saldo = ((saldo + sobreGiro) - sobreGiro - valor);
        }

        if (saldo <= 0){
            estado = false;
        }
    }
    
}
