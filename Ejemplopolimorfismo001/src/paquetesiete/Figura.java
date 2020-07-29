/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;

/**
 *
 * @author reroes
 */
public abstract class Figura {
    protected double area;
    protected String caracteris;

    public double obtenerArea() {
        return area;
    }

    public String obtenerCaracteris() {
        return caracteris;
    }

    public void establecerCaracteris(String caracteris) {
        this.caracteris = caracteris;
    }
    
    public abstract void calcular_area();

  
    
}
