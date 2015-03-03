/*
 * Implementación de fibonacci
 */
package recursivo;

import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class EjFibonacci {
    public static int fibIterativo(int n){
        if(n == 0)
            return 0;
        if(n==1)
            return 1;
        int a = 0;
        int b = 1;
        int c = 0;
        for (int i = 1; i < n+1; i++) {
            c = a + b;
            b = a;
            a = c;
        }
        return c;
    }
    public static int fibRecursivo(int n){
        if(n==0){
            return 0;
        }else if(n==1){
            return 1;
        }
        else{//caso recursivo
            return  fibRecursivo(n -1)+fibRecursivo(n - 2);
        }
    }
    
    public static void main(String args[]){
        System.out.println("Introduzca el numero:");
        Scanner entrada = new Scanner(System.in);
        System.out.println(fibIterativo(entrada.nextInt()));
    }
}
