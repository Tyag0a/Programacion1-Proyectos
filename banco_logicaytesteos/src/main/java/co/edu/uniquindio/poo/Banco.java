package co.edu.uniquindio.poo;

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

   // public boolean verificarCuentaExiste(String numeroCuenta){
   //    Predicate<CuentaBancaria> cuentaIgual = cuentaAhorros -> cuentaAhorros.getNumeroCuenta().equals(numeroCuenta);
   //     return cuentaAhorros.stream().filter(cuentaIgual) .findAny() .isPresent();
   // }




   // public double consultarSaldo (double saldo) {

   //     return saldo;

   // }
    
}
