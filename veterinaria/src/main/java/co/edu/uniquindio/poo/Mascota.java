package co.edu.uniquindio.poo;

public record Mascota(String nombre, String especie,String raza, int edad, String genero, String color,float peso ){
     
    public Mascota {
        assert nombre != null;
        assert especie != null;
        assert raza != null;
        assert genero != null;
        assert color != null;
        assert edad >= 0;
        assert peso >= 0;
    
     }  
     

}
