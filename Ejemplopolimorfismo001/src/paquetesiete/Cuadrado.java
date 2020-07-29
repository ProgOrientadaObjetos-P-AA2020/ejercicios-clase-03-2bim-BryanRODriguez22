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
public class Cuadrado extends Figura {
       
    double lado;

    public double obtenerLado() {
        return lado;
    }

    public void establecerLado(double lado) {
        this.lado = lado;
    }

    @Override
    public void calcular_area() {
         area= obtenerLado()*obtenerLado();
    }
    
}
