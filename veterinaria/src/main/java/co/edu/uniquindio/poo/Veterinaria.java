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

    public static void main (String[] args){

        List<Mascota> listaMascotas = new ArrayList<Mascota>();
        listaMascotas.add(new Mascota("pedrito", "perro", "salchicha", 16, "macho", "blanco", 30, "01"));
        listaMascotas.add(new Mascota("juan", "caballo", "arabe", 13, "macho", "cafe", 100, "02"));
        listaMascotas.add(new Mascota("bruno", "perro", "criollo", 19, "macho", "negro", 26, "03"));
        listaMascotas.add(new Mascota("eduardo", "tortuga", "raza de tortuga random", 8, "macho", "verde", 19, "04"));
        listaMascotas.add(new Mascota("aurora", "conejo", "no se", 5, "hembra", "blanco", 13, "05"));
        listaMascotas.add(new Mascota("eustaquio", "hamster", "no se", 2, "macho", "gris", 19, "06"));

        System.out.println("tenemos " + listaMascotas.size() + " mascotas registradas. ");
        System.out.println("Lista de mascotas mayores de 10 años:");

        for (int i=0; i < listaMascotas.size(); i++){
            if (listaMascotas.get(i).getEdad() >= 10){
                System.out.println("son:" + listaMascotas.get(i).getNombre());
            }      
         }  

    }                
        
          
}
