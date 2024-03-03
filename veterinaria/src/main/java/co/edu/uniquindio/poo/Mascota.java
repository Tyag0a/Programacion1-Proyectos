package co.edu.uniquindio.poo;

public class Mascota {
    String nombre;
    String especie;
    String raza;
    int edad;
    String genero;
    String color;
    float peso;
    String num;

    public Mascota (String nombre, String especie, String raza, int edad,String genero,String color,float peso, String num){

    assert nombre != null && !nombre.isBlank() : "El nombre de la mascota debe ser diferente de null";
    assert especie != null && !especie.isBlank() : "La especie de la mascota debe ser diferente de null";
    assert raza != null && !raza.isBlank() : "la raza debe ser diferente de null";
    assert genero != null && !genero.isBlank() : "El genero de la mascota debe ser diferente de null";
    assert color != null && !color.isBlank() : "El color de la mascota debe ser diferente de null";
    assert edad >= 0 : "la edad no puede ser negativa";
    assert peso >= 0 : "el peso no puede ser negativo";
   
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getNombre() {
        return nombre;
    }

    public String getEspecie() {
        return especie;
    }

    public String getRaza() {
        return raza;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }

    public String getColor() {
        return color;
    }

    public float getPeso() {
        return peso;
    }

    public String getNum() {
        return num;
    }
}
