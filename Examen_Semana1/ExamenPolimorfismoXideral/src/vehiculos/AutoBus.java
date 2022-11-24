/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author ema-5
 */
public class AutoBus extends Coche{
    private int asientos;
    public AutoBus(String matricula, int velocidad,int limVel,int asientos){
        super(matricula,velocidad,limVel);
        this.asientos = asientos;
    }
    
    @Override
    public String toString() {
        return super.toString().concat(" Tiene " + this.asientos + " asientos");
    }
}
