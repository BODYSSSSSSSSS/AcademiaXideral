package Inyeccion;

import Validaciones.Validar;
import java.util.*;
import java.util.function.Consumer;

public class Principal {

    String dato;
    int precio;

    public static void main(String[] args) {
        List<Ticket> compra = add();
        mostrarDatos(compra);
    }

    static List<Ticket> add() {
        List<Ticket> tickets = new ArrayList<>();
        int x = -1;
        int precio;
        String nombre, descripcion;
        var val = new Validar();
        do {
            System.out.println("""
                           Ingrese el tipo de pelicula que desea a\u00f1adir
                           1.-Accion
                           2.-Comedia
                           3.-Drama
                           4.-Terror
                           
                           0 Terminar""");
            try {
                x = val.validarInt();
                if (x != 0) 
                    tickets.add(val.validarRegistro(x));
                
            } catch (Exception e) {
                e.printStackTrace(System.out);
            }

            System.out.println(" -------------------");
        } while (x != 0);

        System.out.println("x = " + x);
        return tickets;
    }

    static void mostrarDatos(List<Ticket> tickets) {
        System.out.println("\n\n\nImpresion");
        tickets.forEach(new Consumer<Ticket>() {
            @Override
            public void accept(Ticket e) {
                e.mostrarTicket();
                System.out.println("\n");
            }
        });
    }
}
