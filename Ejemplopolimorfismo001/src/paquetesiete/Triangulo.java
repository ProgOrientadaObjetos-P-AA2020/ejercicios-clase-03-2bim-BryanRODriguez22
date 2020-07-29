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
public class Triangulo extends Figura{

    double base;
    double altura;

    public double obtenerBase() {
        return base;
    }

    public void establecerBase(double base) {
        this.base = base;
    }

    public double obtenerAltura() {
        return altura;
    }

    public void establecerAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public void calcular_area() {
        area= obtenerBase() * obtenerAltura();
    }
    
  
}
