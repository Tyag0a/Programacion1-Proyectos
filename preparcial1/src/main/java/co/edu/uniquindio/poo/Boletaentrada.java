package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.time.LocalTime;

public class Boletaentrada {
    public Boletaentrada(LocalDate fecha, LocalTime hora, String nombre, int valor) {
        this.fecha = fecha;
        this.hora = hora;
        this.nombre = nombre;

        assert fecha != null;
        assert hora != null;
        assert nombre != null;
        assert valor >= 5000;
        
    }
    LocalDate fecha;
    LocalTime hora;
    String nombre;
    String valor;


    
    public LocalDate getFecha() {
        return fecha;
    }
    public LocalTime getHora() {
        return hora;
    }
    public String getNombre() {
        return nombre;
    }
    public String getValor() {
        return valor;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public void setHora(LocalTime hora) {
        this.hora = hora;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setValor(String valor) {
        this.valor = valor;
    }
}
