/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquetesiete;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        Scanner entrada= new Scanner(System.in);
        int opcion=0;
        /*
        clase uno abstracta llamada Figura; con atributos:
        características y área; la clase debe tener un método
        abstracto calcular_area.
        - clase llamada Triángulo (hereda de Figura); con
        atributos: base y altura.
        - clase llamada Rombo (hereda de Figura) con atributo: diagonal_menor y 
        diagonal mayor.
        - clase llamada Cuadrado (hereda Figura) con: atributos: lado.
        - clase Ejecutor, que permite generar:
            4 objetos de tipo Cuadrado
            3 objetos de tipo Rombo
            5 objeto de Triángulo 
            Comprobar el concepto del polimorfismo.
        */
        ArrayList<Figura> figuras = new ArrayList<>();
        // inicio de la solución
        System.out.println("Digite los datos segun corresponda: ");
        int c=1,r=1,t=1;
        
        for (int i = 0; i < 12; i++) {
            
            if(i<4){
                
                System.out.printf("*****CUADRADO**** %d/4\n",c);
                System.out.print("Características:");
                String car=entrada.nextLine();
                System.out.print("Lado: ");
                double lad=entrada.nextDouble();
                entrada.nextLine();
                Cuadrado c1 = new Cuadrado();
                
                c1.establecerCaracteris(car);
                c1.establecerLado(lad);
                c++;
                figuras.add(c1);
            }
            else if(i>3&&i<7){
            
                
                System.out.printf("*****Rombo***** %d/4\n",r);
                System.out.print("Características:");
                String car=entrada.nextLine();
                System.out.print("Diagonal menor: ");
                double diagmen=entrada.nextDouble();
                System.out.print("Diagonal Mayor: ");
                double diagmay=entrada.nextDouble();
                entrada.nextLine();
                
                Rombo r1 = new Rombo();
                
                r1.establecerCaracteris(car);
                r1.establecerD_menor(diagmen);
                r1.establecerD_mayor(diagmay);
                r++;
                figuras.add(r1);
            }
            else{
                
                
                System.out.printf("\n****Triangulo****%d/4\n",t);
                System.out.print("Características:");
                String car=entrada.nextLine();
                System.out.print("Base: ");
                double base=entrada.nextDouble();
                System.out.print("Altura: ");
                double altura=entrada.nextDouble();
                entrada.nextLine();
                Triangulo t1 = new Triangulo();
                
                t1.establecerCaracteris(car);
                t1.establecerBase(base);
                t1.establecerAltura(base);
                t++;
                figuras.add(t1);
            }
        }
        
        // proceso para comprobar el polimorfismo
        for (int i = 0; i < figuras.size(); i++) {
            // 1.  
            figuras.get(i).calcular_area();
            
            System.out.printf("Datos de Figura\n"
                        + "%s\n",                        
                  figuras.get(i));
        }
        System.out.println("\n *****FIGURAS LISTADAS****\n");
        
        for (int i = 0; i < figuras.size(); i++) {
            
            if(i==0){
                
                System.out.println("****CUADRADOS****\n");
            }
            if(i==4){
                System.out.println("=======0=====");
                System.out.println("***ROMBOS****\n");
            }
            
            if(i==7){
                System.out.println("======0=====");
                System.out.println("****TRIANGULOS****\n");
            }
            
            System.out.printf("\nCaracteristicas: %s\nArea: %.2f\n",
                    figuras.get(i).obtenerCaracteris(),
                    figuras.get(i).obtenerArea());
        }
    }
}
