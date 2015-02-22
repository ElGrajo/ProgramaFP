package Boletin2;
import java.util.Scanner;
/**
 *
 * @author Julian Gawron
 */
public class Ej6MayoresMedia6 {
    /*
    6.	Realizar un algoritmo que lea cinco números enteros y escriba aquellos
    que son mayores que la media. 
    */
    public static void main( String args[] ){
        //Declaracion de variables
        Scanner entrada = new Scanner(System.in);
        int[] numero = new int[5];
        int total = 0;
        int media;
        
        //Pedida de datos
        for (int i = 0; i < 5; i++) {
            System.out.printf("Inserte el %dº numero:", i+1);
            numero[i] = entrada.nextInt();
        }// fin for
        
        //Suma todods los valores al array y saca la media
        for (int i = 0; i < 5; i++) {
            total = total + numero[i]; 
        }// fin for
        media = total / 5;
        System.out.print(media);
        
        //Recorre todo el array comparando los valores con la media
        for (int i = 0; i < 5; i++) {
            if(numero[i] > media){
                System.out.printf("El número %d es mayor que la media", i);
            }// fin del if
        }
        
    }// fin main
}// fin clase
