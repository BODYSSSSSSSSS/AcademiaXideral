package Inyeccion;

public class Accion extends Pelicula {

    public Accion(String nombre, String descripcion,int precio,String categoria) {
        super(nombre, descripcion, precio, categoria);
    }

    @Override
    void mostrar() {
        System.out.println("Pelicula: "+ nombre+ "\nDescripcion"+ descripcion);
    }
}
