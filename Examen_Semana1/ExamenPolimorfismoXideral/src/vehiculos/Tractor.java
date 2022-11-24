/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vehiculos;

/**
 *
 * @author ema-5
 */
public class Tractor extends Coche {

    int puertas;

    public Tractor(String matricula, int velocidad,int limVel, int puertas) {
        super(matricula, velocidad,limVel);
        this.puertas = puertas;
    }

    @Override
    public String toString() {
        return super.toString().concat(" Contiene " + puertas + " puertas");
    }

}
