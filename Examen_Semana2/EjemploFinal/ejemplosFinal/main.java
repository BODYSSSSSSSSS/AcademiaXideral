/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplosFinal;

/**
 *
 * @author ema-5
 */
public class main {

    final double CONSTANTE_PI= 3.1416;

    CONSTANTE_PI  = 3.14167892;
    
    final Perro guau= new Perro("Max");
    
    guau = new Perro("Bob");
}

class Gato {

    final void miauu() {
        System.out.println("Este es un método final.");
    }
    
    void miau(){
        System.out.println("Este metodo no es final");
    }
}

class Miau extends Gato {

    void miauu()//Nos marca un error ya que no puedo hacer uso del metodo miauu porque fue definido como final
    {
        // COMPILACIÓN-ERROR! 
        System.out.println("No es posible");
        
    }
    
    @Override
    void miau(){
        System.out.println("Pude maullar");
    }
}
