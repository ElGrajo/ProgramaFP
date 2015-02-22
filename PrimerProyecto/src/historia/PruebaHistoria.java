/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package historia;

/**
 *
 * @author Julian
 */

import java.util.Random;
import java.util.Scanner;

public class PruebaHistoria {

    public static void main(String args[]){

     /////// Hacer las preguntas \\\\\\\\\\
        Random numAleat = new Random();
        Historia MiHistoria = new Historia();
        Scanner entrada = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;
        
        // Obtiene crea la base
        DatosArchivo MisDatosArchivo = new DatosArchivo();
        MisDatosArchivo.llenarDatos();
        int totalDatos = MisDatosArchivo.getTotalDatos();
    
   
     while( (correctas - incorrectas) < 5){
       
       // del total de datos, toma uno. Lugar es el numero en el array
       int lugar = 1 + numAleat.nextInt(totalDatos);
       
      // int ano = -3000 + numAleat.nextInt(5014); //Numero aleatorio
       int ano = MisDatosArchivo.getAno(lugar);
       String dato = MisDatosArchivo.getDato(lugar);
       int siglo = MiHistoria.siglar(ano);
       
       System.out.printf("¿En que siglo %s ?\n", dato);
          
       int opcion = 1+ numAleat.nextInt(4);
       // genera las opciones
        for (int contador = 1; contador <= 4; contador++){
            int nuevoSiglo = siglo + contador - opcion;
            
            // como no hay siglo 0 en Romanizar
            if (nuevoSiglo == 0){
             System.out.printf("%d. siglo 0 \n", contador); 
                continue;
            }// if es 0
            
            System.out.printf("%d. siglo %s \n", contador,
                    MiHistoria.romanizarBarato(nuevoSiglo));
        }// for de los items
      
        // evalua la respuestas
        System.out.print("\nElija la respuesta del 1 al 4: ");
        int respuesta = entrada.nextInt();
        
        //para salir rápido
        if(respuesta == -1){
            System.exit(0);
        }
        
        if (respuesta == opcion){
            System.out.println(MiHistoria.respuestaCorrecta());
            correctas++;
        } 
        else{
            System.out.println(MiHistoria.respuestaErrada());
            System.out.printf("%s en el año %d que es el siglo %s\n", dato, ano, 
                    MiHistoria.romanizarBarato(siglo));
            incorrectas++;
        }// fin del else de las respuestas
        
        System.out.print("Puntaje: ");
        for(int i = 0; i < correctas-incorrectas; i++){
            System.out.print("*");
        }// for de las estrellitas
        System.out.println("");
        
     }// fin del while
     
     // sale del bucle
     
     System.out.println("MUY BIEN!! Has superado la prueba");
     System.out.printf("Con %d respuestas corretas y %d incorrectas\n",
             correctas, incorrectas);
    
      }// fin del main    
   }// fin de la clase