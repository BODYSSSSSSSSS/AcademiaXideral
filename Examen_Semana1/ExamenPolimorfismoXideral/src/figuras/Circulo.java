/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

import java.nio.channels.Pipe;

/**
 *
 * @author ema-5
 */
public class Circulo implements IFigura{
    double radio;
    public Circulo(double radio){
        this.radio = radio;
    }
    @Override
    public double getArea() {
        return Math.PI*Math.pow(radio, 2);
    }

    @Override
    public double perimetro() {
        return 2*Math.PI*radio;
    }
    
}
