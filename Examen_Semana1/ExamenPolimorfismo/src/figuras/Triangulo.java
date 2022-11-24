/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package figuras;

/**
 *
 * @author ema-5
 */
public class Triangulo implements IFigura {
    double base, altura, lado1, lado2;

    public Triangulo(double base, double altura,double lado1, double lado2) {
        this.base = base;
        this.altura = altura;
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    @Override
    public double getArea() {
        return (base*altura)/2;
    }

    @Override
    public double perimetro() {
        if(lado1 == lado2 && base == lado1){
           return 3*lado1; 
        }else if(lado1 == lado2 && lado1 != base){
            return  2*lado1+ base;
        }else
            return lado1+ lado2+ base;
    }

}
