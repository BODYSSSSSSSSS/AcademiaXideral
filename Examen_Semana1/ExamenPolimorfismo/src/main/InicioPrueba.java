/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import figuras.*;
import vehiculos.*;
import java.util.*;

/**
 *
 * @author ema-5
 */
public class InicioPrueba {

    
    public static void main(String[] args) {
        System.out.println("Aplicando clases Abstractas\n---------------------");
        
        List<Coche> vehiculos = getVehiculos();

        for (Coche coches : vehiculos) {
            System.out.println(coches.toString());
            coches.getLimiteVel();
        }
        
        System.out.println("\nAplicando Interfaces\n--------------------------");
        
        List <IFigura> figuras = getFiguras();
        
        for (IFigura figura : figuras) {
            System.out.println("El area de "+figura.getClass().getSimpleName()+" es %.2f"+figura.getArea()+" el perimetro es: "+figura.perimetro());
        }

    }

    static List<Coche> getVehiculos() {
        return List.of(new Camion("JCW2", 55, 86),
                new Tractor("DJGG", 25, 20, 4),
                new AutoBus("GANS2", 68, 90, 55)
        );
    }

    static List<IFigura> getFiguras(){
        return List.of(new Triangulo(11, 7, 11,7.5),
                new Rectangulo(5.48,12.5),
                new Circulo(3.6)
        );
    }
}
