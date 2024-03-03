package co.edu.uniquindio.poo;

import java.util.ArrayList;
import java.util.List;



public class Veterinaria {
    /*
     * Creamo una lista de mascotas mediante una arraylist
     */
    static void registrarMascota (Mascota mascota){
        List<Mascota> listaMascotas = new ArrayList<Mascota>();

         assert validarNumExiste(mascota.num) == false
         : "La mascota ya existe en la lista";
         listaMascotas.add(mascota);

    }

    public Mascota getMascota(String num) {
        Mascota mascotaInteres = null;
        List<Mascota> listaMascotas = new ArrayList<Mascota>();

        for (Mascota mascota : listaMascotas) {
            if (mascota.num.equals(num)) {
                mascotaInteres = mascota;
            }
        }
        return mascotaInteres;
    }

    /**
     * @param num
     * @return
     */
    static boolean validarNumExiste(String num) {
        boolean existe = false;
        List<Mascota> listaMascotas = new ArrayList<Mascota>();

        for ( Mascota mascota : listaMascotas) {
            if (mascota.num.equals(num)) {
                existe = true;
            }
        }

        return existe;
    }

    public static List<Mascota> mascotasMayoresDe10 (List<Mascota> mascotas){
        List<Mascota> Mayoresde10 = new ArrayList<>();

        for (Mascota mascota : mascotas){
            if (mascota.getEdad() > 10){
                Mayoresde10.add(mascota);
            }
        }
        return Mayoresde10;
    }      

    public static void main (String[] args){
        List<Mascota> listaMascotas = new ArrayList<Mascota>();
        listaMascotas.add(new Mascota("pedrito", "perro", "salchicha", 16, "macho", "blanco", 30, "01"));
        listaMascotas.add(new Mascota("juan", "caballo", "arabe", 13, "macho", "cafe", 100, "02"));
        listaMascotas.add(new Mascota("bruno", "perro", "criollo", 19, "macho", "negro", 26, "03"));
        listaMascotas.add(new Mascota("eduardo", "tortuga", "raza de tortuga random", 8, "macho", "verde", 19, "04"));
        listaMascotas.add(new Mascota("aurora", "conejo", "no se", 5, "hembra", "blanco", 13, "05"));
        listaMascotas.add(new Mascota("eustaquio", "hamster", "no se", 2, "macho", "gris", 19, "06"));
        /*
         * podemos agregar a la lista finitas mascotas, estas son de ejemplo para probar la funcionalidad de la condicion y el ciclo que
         */
        List<Mascota> mayores = mascotasMayoresDe10(listaMascotas);

        System.out.println("mascotas de veterinaria que son mayores de 10 años:");
        for (Mascota mascota : mayores) {
            System.out.println(mascota.num + "," + mascota.nombre + ","+ mascota.especie + "," + mascota.raza + "," + mascota.edad + "," + mascota.genero + "," + mascota.color + "," + mascota.peso +",");
        }
    }
}
