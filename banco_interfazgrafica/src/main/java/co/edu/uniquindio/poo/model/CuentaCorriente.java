package co.edu.uniquindio.poo.model;

public class CuentaCorriente extends CuentaBancaria{

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
        assert transaccion.getValor() <= saldo + sobreGiro :"El valor a retirar no debe superar el saldo disponible";
        if (saldo < transaccion.getValor()){
            saldo = ((saldo + sobreGiro) - sobreGiro - transaccion.getValor());
        }

        if (saldo <= 0){
            estado = false;
        }
    }
    
}