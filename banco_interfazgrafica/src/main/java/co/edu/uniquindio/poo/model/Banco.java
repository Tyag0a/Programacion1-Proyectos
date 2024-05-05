package co.edu.uniquindio.poo.model;

import java.util.Collection;
import java.util.LinkedList;

public class Banco {

        private final String nombre;
    private Collection<Titular> listaTitulares;
    public Collection<CuentaBancaria> listaCuentas;
    

    public Banco(String nombre) {
        this.nombre = nombre;
        this.listaTitulares = new LinkedList<>();
        this.listaCuentas = new LinkedList<>();
    }
    public String getNombre() {
        return nombre;
    }
    public Collection<Titular> getListaTitulares() {
        return listaTitulares;
    }
    
    public void setListaTitulares(Collection<Titular> listaTitulares) {
        this.listaTitulares = listaTitulares;
    }
    public Collection<CuentaBancaria> getListaCuentas() {
        return listaCuentas;
    }
    public void setListaCuentas(Collection<CuentaBancaria> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }

    //Metodo para verificar si una cuenta existe

    public boolean verificarCuentaExiste (CuentaBancaria cuenta) {

        return listaCuentas.contains(cuenta);
    }
    //Metodo para verificar actividad de una cuenta

    public boolean estaActiva(CuentaBancaria cuenta) {
        return cuenta.getSaldo() > 0;
    }

    //Metodo para transferir saldo de una cuenta a otra

    public void transferirSaldoCuentas (CuentaBancaria cuentaOrigen, CuentaBancaria cuentaDestino,
     Transaccion transaccion) {

        if (!verificarCuentaExiste(cuentaDestino)) {
            System.out.println("La cuenta a la que se desea transferir no existe");
            return; //se utiliza este return para salir del metodo si la cuenta no existe
                    // y no realizar la trasnferencia 
        }

        double valorTransaccion = transaccion.getValor();

        if (transaccion.getTipoTransaccion() == TipoTransaccion.TRANSFERIR &&
         cuentaOrigen.getSaldo() < valorTransaccion){
            System.out.println("No tienes el saldo suficiente para realizar la transferencia");
            return;

        }

        if (transaccion.getTipoTransaccion() == TipoTransaccion.TRANSFERIR) {
            cuentaOrigen.setSaldo(cuentaOrigen.getSaldo() - valorTransaccion);
            cuentaDestino.setSaldo(cuentaDestino.getSaldo() + valorTransaccion);
            System.out.println("Transferencia exitosa de " + valorTransaccion + " $ a la cuenta destino.");

        }
   }

   //Metodo para consultar si una cuenta esta activa

   public double consultarSaldo (CuentaBancaria cuenta){
    
    if (estaActiva(cuenta)){
        return cuenta.getSaldo();
   
    } else {
        System.out.println("La cuenta no se encuentra activa");
        return 0;

    }
 }

    @Override
    public String toString() {
        return "Banco [nombre=" + nombre + "]";
    }

    public void guardarCuenta (CuentaBancaria cuenta) {
        if (!verificarCuentaExiste(cuenta)) {
            listaCuentas.add(cuenta);
            System.out.println("Cuenta bancaria registrada exitosamente en el sistema");
        } else {
            System.out.println("La cuenta bancaria ya existe en el sistema");
        }

    }
}
