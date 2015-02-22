/*
(Sistema de reservaciones de una aerolínea) 
Una pequeña aerolínea acaba de comprar una computadora para su nuevo sistema de 
reservaciones automatizado. Se le ha pedido a usted que desarrolle el nuevo sistema. 
Usted escribirá una aplicación para asignar asientos en cada vuelo del único 
avión de la aerolínea (capacidad: 10 asientos).

Su aplicación debe mostrar las siguientes alternativas: 
Por favor escriba 1 para Primera Clase y Por favor escriba 2 para Economico. 
Si el usuario escribe 1, su aplicación debe asignarle un asiento en la sección 
de primera clase (asientos 1 a 5). Si el usuario escribe 2, su aplicación debe 
asignarle un asiento en la sección económica (asientos 6 a 10). Su aplicación 
deberá entonces imprimir un pase de abordaje, indicando el número de asiento 
de la persona y si se encuentra en la sección de primera clase o clase 
económica del avión.
Use un arreglo unidimensional del tipo primitivo boolean para representar 
la tabla de asientos del avión. Inicialice todos los elementos del arreglo con 
false para indicar que todos los asientos están vacíos. A medida que se asigne cada
asiento, establezca los elementos correspondientes del arreglo en true para indicar 
que ese asiento ya no está disponible.
Su aplicación nunca deberá asignar un asiento que ya haya sido asignado. 
Cuando esté llena la sección económica, su programa deberá preguntar a la 
persona si acepta ser colocada en la sección de primera clase (y viceversa). 
Si la persona acepta, haga la asignación de asiento apropiada. 
Si no acepta, imprima el mensaje "El proximo vuelo sale en 3 horas".
 */

package cap07Ejercicios;

/**
 *
 * @author Julian
 */
import java.util.Scanner;
public class Ej0719 {
    //El asignador de asientos

    private boolean asientos[] = new boolean[10];
    private int asientosPrimera = 5;

    public boolean buscarReserva(int categoria){
    // Hay que recordar que el array comienza en 0
    //El numero de asiento comienza en 1, asi que siempre hay que sumar 1

    switch(categoria){
        case 1: // Primera Clase
            for(int i = 0; i < asientosPrimera -1; i++ ){
                if(asientos[i]==false){
                    asientos[i]=true;
                    ticketReserva(i+1);
                    return true;
                    
                }  // fin del if 
            }// fin del for
            System.out.println("lo Sentimos están todos Reservados");
            return false;
         
        case 2: // clase económica
            for(int i = asientosPrimera; i < asientos.length; i++){
                   if(asientos[i]==false){
                    asientos[i]=true;
                    ticketReserva(i+1);
                    return true;
                }// fin del if
            }// fin del for
            System.out.println("lo Sentimos están todos Reservados");
            return false;

        default:
            System.out.print("Debe elegir entre 1 o 2");
            return false;
          
    }// fin del switch 
        
    }// fin del buscarReserva
    
    public void ticketReserva(int asiento){
        System.out.printf("Ha reservado su asiento numero %d\n", asiento);
        String categoria = (asiento <= asientosPrimera)?"Primera":"Economica";
        System.out.printf("En la categoria %s\n", categoria);
    }// fin de ticketReserva
    
    
}// fin de la clase
