/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author ema-5
 */
public class Rectangulo implements IFigura{
    double largo, ancho;
    
    public Rectangulo(double largo, double ancho){
        this.largo=largo;
        this.ancho=ancho;
    }
    @Override
    public double getArea() {
        return largo*ancho;
    }

    @Override
    public double perimetro() {
        return (largo+ancho)*2;
    }
    
}
