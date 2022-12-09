/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package main;

import org.junit.Test;
import test.UsuarioDto;
import test.UsuarioServicio;
import static org.junit.Assert.*;

/**
 *
 * @author ema-5
 */
public class UsuarioServicioIT {

    public UsuarioServicioIT() {
    }

    @Test
    public void testCrearUsuario() {
        System.out.println("crearUsuario");
        Long id = null;
        String nombre = "";
        UsuarioServicio instance = new UsuarioServicio();
        //Pasar parametros con los que se desea realizar la prueba
        UsuarioDto expResult = new UsuarioDto(id, nombre);
        UsuarioDto result = instance.crearUsuario(id, nombre);
        //Comprar los datos ingresados con los que se esperan
        assertEquals(expResult, result);
    }

    @Test
    public void testObtenerUsuario() {
        System.out.println("obtenerUsuario");
        Long id = null;
        UsuarioServicio instance = new UsuarioServicio();
        UsuarioDto expResult = null;
        //Pasar parametros con los que se desea realizar la prueba
        UsuarioDto result = instance.obtenerUsuario(id);
        assertEquals(expResult, result);
    }

    @Test
    public void testActualizarUsuario() {
        System.out.println("actualizarUsuario");
        Long id = null;
        String nombre = "";
        UsuarioServicio instance = new UsuarioServicio();
        UsuarioDto expResult = null;
        //Pasar parametros con los que se desea realizar la prueba
        UsuarioDto result = instance.actualizarUsuario(id, nombre);
        assertEquals(expResult, result);
    }

}
