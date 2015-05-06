/*
 * Declarar un array de numeros en el que vayamos introduciendo por teclado 
 * notas del modulo de programación (tiene dos decimales) para 26 alumnos
 * Después debemos sacar la media de la nota del grupo y mostrarla con un 
 * ancho de 15 caracteres, el caracter será el guión bajo _, dos decimales
 * y signo positivo.
 * Despues debemos sacar la media de la nota del grupo y mostrarla con un 
 * ancho de 15 caracteres
 */
package arrays;

import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class Ej1notasAlumnos {
    public static void main(String[] args) {
        //declaración
        double [] notasAlumnos;
        Scanner entrada = new Scanner(System.in);
        double totalNotas = 0;
        double promedioFinal = 0;
        String confirmacion = "";
        
        //Inicializacion del bucle
        notasAlumnos = new double [5];
        int contadorNotas = 0;
          
        do{
            System.out.printf("Inserte la nota del alumno %d:",contadorNotas+1);
            notasAlumnos[contadorNotas] = entrada.nextDouble();
            contadorNotas++; 
            
            //Para que salte la útlima pregunta en el alumno final.
            if( contadorNotas>= notasAlumnos.length ){
                break;
            }
            
            //Para confirmar el ingreso de notas.
            System.out.println("¿Desea ingresar otro dato?(s/n)");            
            entrada.nextLine();//Esto es para borrar el buffer
            confirmacion = entrada.nextLine();
            if(confirmacion.charAt(0) == 'n' || confirmacion.charAt(0) =='N'){
            break;
            }
            
        }while(contadorNotas < notasAlumnos.length );
        
        //Suma todo el array
        for (int i = 0; i < contadorNotas; i++) {
             totalNotas = totalNotas + notasAlumnos[i];
        }
        
        //Calcula la nota final
        promedioFinal = totalNotas / contadorNotas;
        
        //Imprime el mensaje final
        System.out.printf("El promedio de todas las notas es: %+15.2f", promedioFinal);
        
        
    }// fin main
}// fin clase
