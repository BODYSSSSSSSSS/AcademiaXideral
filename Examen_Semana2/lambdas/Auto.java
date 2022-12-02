/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lamdas;

/**
 *
 * @author ema-5
 */
public class Auto {
    private String marca;
    private int llantas;
    private double gasolina;
    
    public Auto(String marca, int llantas, double gasolina){
        this.marca = marca;
        this.llantas = llantas;
        this.gasolina = gasolina;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getLlantas() {
        return llantas;
    }

    public void setLlantas(int llantas) {
        this.llantas = llantas;
    }

    public double getGasolina() {
        return gasolina;
    }

    public void setGasolina(double gasolina) {
        this.gasolina = gasolina;
    }

    @Override
    public String toString() {
        return "Auto{" + "marca= " + marca + ", llantas= " + llantas + ", gasolina= " + gasolina + '}';
    }
    
    
    
}
