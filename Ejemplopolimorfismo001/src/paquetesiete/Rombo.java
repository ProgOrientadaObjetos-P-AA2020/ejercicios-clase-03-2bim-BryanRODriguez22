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
public class Rombo extends Figura{
    double d_menor;
    double d_mayor;

    public double obtenerD_menor() {
        return d_menor;
    }

    public void establecerD_menor(double d_menor) {
        this.d_menor = d_menor;
    }

    public double obtenerD_mayor() {
        return d_mayor;
    }

    public void establecerD_mayor(double d_mayor) {
        this.d_mayor = d_mayor;
    }
    
    @Override
    public void calcular_area() {
       area = (obtenerD_mayor()*obtenerD_menor())/2;
    }
    
}
