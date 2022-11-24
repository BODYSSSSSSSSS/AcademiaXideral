/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author ema-5
 */
public abstract class Coche  {

    private int limVel;
    private String matricula;
    private int velocidad;
    
    public Coche() {
     
    }
    public Coche(String matricula, int velocidad, int limVel) {
        this.matricula = matricula;
        this.velocidad = velocidad;
        this.limVel = limVel;
    }

    @Override
    public String toString() {
        return "Coche{" + "limVel=" + limVel + ", matricula=" + matricula + ", velocidad=" + velocidad + '}';
    }
    
    public void getLimiteVel() {
        if(velocidad > limVel){
            System.out.println("Esta excediendo el limite de velocidad");
        }
        else
            System.out.println("Respeta el limite de velocidad");
    }
}
