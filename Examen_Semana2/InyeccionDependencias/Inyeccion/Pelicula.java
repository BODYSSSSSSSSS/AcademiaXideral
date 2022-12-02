package Inyeccion;

public abstract class Pelicula {
	
	String nombre;
        String descripcion;
        String categoria;
        int precio;
	
	public Pelicula(String nombre, String descripcion, int precio,String categoria) {
                this.nombre = nombre;
                this.descripcion = descripcion;
                this.precio = precio;
                this.categoria = categoria;
        }
	
	abstract void mostrar();

}
