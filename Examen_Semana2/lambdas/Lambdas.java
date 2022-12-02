/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lamdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 *
 * @author ema-5
 */
public class Lambdas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        List<Auto> listaAutos = addAutos();

        System.out.println("Autos con 5 llantas\n------------------------");
        mostrarAutos(listaAutos, u -> u.getLlantas() == 5);

        Predicate<String> predString = s -> s.contains("x");
        Predicate<Double> predDouble = d -> d.equals(234.0);

        System.out.println(predString.test("Tlaxcala"));
        System.out.println(predDouble.test(345.0));
         
    }

    public static List<Auto> addAutos() {
        List<Auto> listaAutos = new ArrayList<>();
        listaAutos.add(new Auto("Audi", 4, 100));
        listaAutos.add(new Auto("Mercedes", 5, 75));
        listaAutos.add(new Auto("MG", 4, 62));
        listaAutos.add(new Auto("Hyundai", 5, 36));
        listaAutos.add(new Auto("Nissan", 6, 15));
        return listaAutos;
    }

    public static void mostrarAutos(List<Auto> listAutos, PredicateLambdas x) {
        for (Auto listAuto : listAutos) {
            if (x.probar(listAuto)) {
                System.out.println(listAuto);
            }
        }
    }

    public static void mostrarAutosLamb(List<Auto> listAutos, Predicate c) {
        for (Auto listAuto : listAutos) {

            System.out.println(c);
        }
    }

}
