/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Validaciones;

import Enum.Categorias;
import Excepciones.CategoriaException;
import Excepciones.StringException;
import Inyeccion.Inyector;
import Inyeccion.Ticket;
import java.util.Scanner;
import javax.xml.catalog.CatalogException;

/**
 *
 * @author ema-5
 */
public class Validar implements Validaciones {

    @Override
    public Ticket validarRegistro(int categoria) {
        String dato="";
        switch (categoria) {
            case 1 -> {
                dato = Categorias.ACCION.name();
            }
            case 2 -> {
                dato = Categorias.COMEDIA.name();
            }
            case 3 -> {
                dato = Categorias.DRAMA.name();
            }
            case 4 -> {
                dato = Categorias.TERROR.name();
            }
        }
        return crearTicket(dato);
    }

    private Ticket crearTicket(String dato) {
        Scanner entrada = new Scanner(System.in);
        String nombre , descripcion;
        int precio;
        System.out.println("Ingresar el nombre de la pelicula");
        nombre= entrada.nextLine();
        System.out.println("Ingresar la descripcion");
        descripcion=entrada.nextLine();
        System.out.println("Ingresar el costo");
        precio= validarInt();

        return Inyector.inyectarPelicula(nombre, descripcion, precio, dato);
    }

    @Override
    public int validarInt() {
        int x = -1;
        Scanner entrada = new Scanner(System.in);
        var dato = entrada.nextLine();
        try {
            x = Integer.parseInt(dato);
            if (x > 4 || x < 0) {
                throw new CategoriaException("Debe ingresar un valor valido");
            }
        } catch (NullPointerException | NumberFormatException e) {
            throw new StringException("No se puede ingresar un string, debe ser un dato de tipo entero");
        }
        return x;
    }
}
