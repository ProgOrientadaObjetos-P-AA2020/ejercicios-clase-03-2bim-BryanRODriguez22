
package paquetecinco;

import java.util.ArrayList;
import java.util.Scanner;
import paquetecuatro.Estudiante;
import paquetecuatro.EstudianteDistancia;
import paquetecuatro.EstudiantePresencial;



public class EjecutaEstudiante {

    public static void main(String[] args) {

        /*
        Generar un proceso que permita ingresar n número 
        de docentes. 
        El usuario decide de manera prevía cuantos objetos
        de tipo EstudiantePresencial y EstudianteDistancia
        quiere ingresar.
        
        */
        Scanner entrada = new Scanner(System.in);
        int opcion=0;
        String nombresEst;
        String apellidosEst;
        String identificacionEst;
        int edadEst;
        double costoCred;
        int numeroCreds;
        double costoAsig;
        int numeroAsigs;
        int tipoEstudiante;
        String continuar;
        int contador=0;
        ArrayList<Estudiante> estudiantes = new ArrayList<>();
        
        // inicio de solución
        System.out.println("Ingrese el numero de estudiantes: ");
        System.out.print("[1]Estudiantes Presencial:");
        int numestpresencial=entrada.nextInt();
        System.out.print("[2]Estudiantes Distancia: ");
        int numestdistancia=entrada.nextInt();
        
        int j=0;
        int k=numestpresencial;
        
        do{
        System.out.print("\nSeleccione un tipo de estudiante: \n"
                + "[1]Estudiantes Presencial\n"
                + "[2]Estudiantes Distancia\n0. SALIR\nOpcion:");
        tipoEstudiante=entrada.nextInt();
        System.out.println();
        switch (tipoEstudiante){
            
            case 1: 
                    if(j<numestpresencial){
                        System.out.println("****Estudiantes Presencial****\n");
                        entrada.nextLine();
                        System.out.print("Nombre:");
                        nombresEst=entrada.nextLine();
                        System.out.print("Apellidos:");
                        apellidosEst=entrada.nextLine();
                        System.out.print("Identificacion:");
                        identificacionEst=entrada.nextLine();
                        System.out.print("Edad:");
                        edadEst=entrada.nextInt();
                        System.out.print("Costo de Credito:");
                        costoCred=entrada.nextDouble();
                        System.out.print("Numero de Creditos:");
                        numeroCreds=entrada.nextInt();
                        
                        EstudiantePresencial estuP = new EstudiantePresencial
                         (nombresEst,apellidosEst,identificacionEst,edadEst);
                       
                        estuP.establecerIdentificacionEstudiante(identificacionEst);
                        estuP.establecerEdadEstudiante(edadEst);
                        estuP.establecerNumeroCreditos(numeroCreds);
                        estuP.establecerCostoCredito(costoCred);
                        
                        estudiantes.add(estuP);
                        j++;
                        contador++;
                    }
                    else{
                        System.out.println("\nERROR:\nLista llena ");
                    }
                    
                break;
                
            case 2:
                
                if(k<(numestpresencial+numestdistancia)){
                    System.out.println("****Estudiantes Distancia****\n");
                    entrada.nextLine();
                    System.out.print("Nombre:");
                    nombresEst=entrada.nextLine();
                    System.out.print("Apellidos:");
                    apellidosEst=entrada.nextLine();
                    System.out.print("(ID)");
                    identificacionEst=entrada.nextLine();
                    System.out.print("Edad:");
                    edadEst=entrada.nextInt();
                    System.out.println("Digite el numero de asignaturas:");
                    numeroAsigs = entrada.nextInt();
                    System.out.println("Digite el valor de la asignatura:");
                    costoAsig = entrada.nextDouble();

                    EstudianteDistancia estuD = new EstudianteDistancia
                    (nombresEst,apellidosEst,identificacionEst,edadEst);
                    estuD.establecerIdentificacionEstudiante(identificacionEst);
                    estuD.establecerEdadEstudiante(edadEst);
                    estuD.establecerNumeroAsginaturas(numeroAsigs);
                    estuD.establecerCostoAsignatura(costoAsig);
                    
                    estudiantes.add(estuD);
                    k++;
                    contador++;
                }
                else{
                        System.out.println("\nERROR:\nLista llena ");
                    }
                
                break;
                
            case 3: contador=(numestpresencial+numestdistancia);
                break;
            
            
        }
            
        }while(contador<(numestpresencial+numestdistancia));
        
        
        // ciclo que permite comprobar el polimorfismo
        // este código no debe ser modificado.
        for (int i = 0; i < estudiantes.size(); i++) {
            // 1.  
            estudiantes.get(i).calcularMatricula();
            
            System.out.printf("Datos Estudiante\n"
                        + "%s\n",                        
                  estudiantes.get(i));
            
        }
        for (int i = 0; i < estudiantes.size(); i++) {
            if(i==0){
                System.out.println("****Estudiantes Presencial****\n");
            }
            
            System.out.printf("Datos Estudiante\n"
                        + "Nombres: %s\n"
                        + "Apellidos: %s\n"
                        + "Identificación: %s\n"
                        + "Edad: %d\n"
                        + "Costo Matricula: %.2f\n\n",
                  estudiantes.get(i).obtenerNombresEstudiante(),
                  estudiantes.get(i).obtenerApellidoEstudiante(),
                  estudiantes.get(i).obtenerIdentificacionEstudiante(),
                  estudiantes.get(i).obtenerEdadEstudiante(),
                  estudiantes.get(i).obtenerMatricula());
            
             if(i==numestpresencial-1){
                System.out.println("========0=========");
                System.out.println("****Estudiantes Distancia****\n");
            }
            
            
        }
        
    }
    }

