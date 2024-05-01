package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public abstract class CuentaBancaria {

    protected final Titular titular;
    protected final int numeroCuenta;
    public double saldo;
    public boolean estado;
    public Collection<Transaccion> listaTransacciones;

    public CuentaBancaria(Titular titular, int numeroCuenta, double saldo, boolean estado) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = saldo;
        this.estado = estado;
        this.listaTransacciones = new LinkedList<>();
    }
    public Titular getTitular() {
        return titular;
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public double getSaldo() {
        return saldo;
    }
    public boolean isEstado() {
        return estado;
    }
    public Collection<Transaccion> getListaTransacciones() {
        return listaTransacciones;
    }
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    public void setListaTransacciones(Collection<Transaccion> listaTransacciones) {
        this.listaTransacciones = listaTransacciones;
    }

    //* Metodos abstractos de retirar y depositar para sobreescribir en clases hijas

     public abstract void depositar();
     public abstract void retirar();
    
}
