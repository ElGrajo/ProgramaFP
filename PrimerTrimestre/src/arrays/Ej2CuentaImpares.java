package arrays;

import java.util.Scanner;

/**
 *
 * @author Julian Gawron
 * 2. Escribir un programa que pida 10 números enteros por teclado y 
 * que imprima por pantalla: 
 *  Cuántas cifras son pares y cuántas impares. 
 *  Qué valor es el mínimo absoluto y cuál es el máximo absoluto
 *  La media de los valores.
 */
public class Ej2CuentaImpares {
    public static void main(String args[]){
        int numeros [];
        Scanner entrada;
        numeros = new int [10];
        entrada = new Scanner(System.in);
        int totalPares = 0;
        int totalImpares = 0;
        double media = 0;
        int valorMin = 10;
        int valorMax = 0;
        int total = 0;
        
        for (int i = 0; i < 10; i++) {
            System.out.print("introduzca el " + (i+1) + "ª numero: ");
            numeros[i] = entrada.nextInt();
            
            //Contando impares
            if((numeros[i] % 2)== 0){
                totalPares++;
            } else {
                totalImpares++;
            }
            
            // Sumando total
            total = total + numeros[i];
            
            //Verificar Min y  max
            if(numeros[i]>valorMax){
                valorMax = numeros[i];
            }
            if(numeros[i]<valorMin){
                valorMin = numeros[i];
            }
            
        }// fin del for
        
        media = total / numeros.length;
        
        System.out.printf("Hay %d pares, hay %d impares"
                + " el máximo es %d, y el minimo %d,"
                + "la media es: %.2f.", 
                totalPares, totalImpares,
                valorMax, valorMin,
                media);
        
        
    }// fin main
}// fin clase
