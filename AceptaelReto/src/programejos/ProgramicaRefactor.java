package programejos;

import java.util.Scanner;

public class ProgramicaRefactor {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int numeroPedidos = entrada.nextInt();
        int losNumeros[] = new int[numeroPedidos];
        for (int i = 0; i < numeroPedidos ; i++) {
            losNumeros[i] = entrada.nextInt();
        }
        for (int i = 0; i < numeroPedidos ; i++) {
            System.out.println(cuentaVueltas(losNumeros[i]));
        }
    }
    
    public static int cuentaVueltas (int num){
        if(esTodoIgual(num)){
          return 8;
        }
        
        int contador = 0;
        while(num != 6174){ 
           num = (deMayorAmenor(num) - deMenorAMayor(num));
           contador++;
        }
        return contador;
    }
    
   public static boolean esTodoIgual(int numero){
       int[] cfr = desarma(numero);
        return (cfr[0] == cfr[1])&&(cfr[2]==cfr[3])
                &&(cfr[3] == cfr[0]);  
   }
   
   public static int deMayorAmenor(int numero){
       int[] cfr = desarma(numero);
       int aux;
       for (int i = 0; i < cfr.length ; i++) {
           for (int j = 0; j < cfr.length - 1; j++) {
             if(cfr[j]>cfr[j+1]){
                 aux = cfr[j+1];
                 cfr[j+1] = cfr[j];
                 cfr[j] = aux;
             }   
           }
       }
       //rearmando el numero
       aux = cfr[3] * 1000;
       aux = aux + cfr[2] * 100;
       aux = aux + cfr[1] * 10;
       aux = aux + cfr[0];
    return aux;
   }
   
   public static int deMenorAMayor(int numero){
      int[] cfr = desarma(numero);
       int aux;
       for (int i = 0; i < cfr.length ; i++) {
           for (int j = 0; j < cfr.length - 1; j++) {
             if(cfr[j]>cfr[j+1]){
                 aux = cfr[j+1];
                 cfr[j+1] = cfr[j];
                 cfr[j] = aux;
             }   
           }
       }
       aux = cfr[0] * 1000;
       aux = aux + cfr[1] * 100;
       aux = aux + cfr[2] * 10;
       aux = aux + cfr[3];
      return aux;
   }
   
   public static int[] desarma(int num){

    int cifras [] = new int[4];
    cifras[0] = num / 1000;
    num = num - (cifras[0] * 1000);
    cifras[1] = num /100;
    num = num - (cifras[1] * 100);
    cifras[2] = num / 10;
    cifras[3] = num - (cifras[2] * 10);
   return cifras; 
   }
}