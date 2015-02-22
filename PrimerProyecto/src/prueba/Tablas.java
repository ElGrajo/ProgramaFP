/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba;

/**
 *
 * @author Julian
 */
import java.util.Scanner;
import java.util.Random;

public class Tablas {
    
    public static void main (String args[]){
        int rtaIngresada = 0;
        int rta = 0;
        int correctas = 0;
        int mal = 0;
        
        while (rtaIngresada != -1) {
            
            Random nros = new Random();
            int primero = nros.nextInt(9);
            int segundo = nros.nextInt(9);
            Scanner entrada = new Scanner(System.in);
            
            System.out.printf("¿Cuanto es %d x %d?", primero, segundo);
            rtaIngresada = entrada.nextInt();
            if (rtaIngresada == -1){
                break;
            }// burrada para que no cuente una mas
                
            rta = primero * segundo;
            
            if(rta == rtaIngresada){
                System.out.println(frasesAliento(true) + "\n");
                correctas++;
            } else {
                System.out.printf(frasesAliento(false) + "\n" +
                        "%d x %d es %d\n",
                                    primero, segundo, rta );
                mal++;
            } // fin del if
        }// fin del while
        System.out.printf("Has respondido %d correctas y %d mal\n", correctas, mal );
        
    }// fin del main
    
    // Metodo que responde un string de aliento si estuvo bien o mal
        private static String frasesAliento(boolean valor){
        String respuesta = new String();
            Random nros = new Random();
            int caso = nros.nextInt(4);
        
            if (valor == true){
                switch (caso){
                    case 0:
                      respuesta = "Muy bien, sigue así";
                     break;
                    case 1:
                      respuesta = "Excelente";
                    break;
                    case 2:
                        respuesta = "Muy bien dicho";
                    break;
                    case 3:
                        respuesta = "Muy buena respuesta";
                    break;
                        
                }// fin del switch
            }
            else // si la respuesta es incorrecta
            {
                   switch (caso){
                    case 0:
                      respuesta = "Uh... no estuvo bien";
                     break;
                    case 1:
                      respuesta = "Mmmm... no";
                     break;
                    case 2:
                        respuesta = "Era otro resultado";
                     break;
                    case 3:
                        respuesta = "Sigue intentando...";
                     break;
                        
                }// fin del switch
            }   // fin del else 
        return respuesta;
        }
}
