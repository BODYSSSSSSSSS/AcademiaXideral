package Inyeccion;

public class Inyector {

    public static Ticket inyectarPelicula(String nombre, String descripcion, int precio,String categoria) {
        Ticket tick = new Ticket();
        Pelicula dram = new Peli(nombre, descripcion, precio,categoria);
        tick.peli = dram;
        return tick;
    }

}
