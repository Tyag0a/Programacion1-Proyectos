package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Banco {


    private final String nombre;
    private Collection<Titular> listaTitulares;
    public CuentaBancaria cuentaBancaria;
    

    public Banco(String nombre, CuentaBancaria cuentaBancaria) {
        this.nombre = nombre;
        this.listaTitulares = new LinkedList<>();
        this.cuentaBancaria = cuentaBancaria;
    }
    public String getNombre() {
        return nombre;
    }
    public Collection<Titular> getListaTitulares() {
        return listaTitulares;
    }
    public CuentaBancaria getCuentaBancaria() {
        return cuentaBancaria;
    }
    public void setListaTitulares(Collection<Titular> listaTitulares) {
        this.listaTitulares = listaTitulares;
    }
    public void setCuentaBancaria(CuentaBancaria cuentaBancaria) {
        this.cuentaBancaria = cuentaBancaria;
    }
    
}
