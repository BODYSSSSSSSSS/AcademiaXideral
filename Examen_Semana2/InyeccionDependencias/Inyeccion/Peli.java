package Inyeccion;

public class Peli extends Pelicula {

    public Peli(String nombre, String descripcion, int precio,String categoria) {
        super(nombre, descripcion,precio,categoria);
    }

    @Override
    void mostrar() {
        System.out.println("Pelicula: "+ nombre+ "\nDescripcion: "+ descripcion + "\nCategoria: "+categoria+ "\nPrecio: "+precio);
    }
}
