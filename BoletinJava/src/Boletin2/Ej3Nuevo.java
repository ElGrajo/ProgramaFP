package Boletin2;

/**
 *
 * @author Julian Gawron
 */
public class Ej3Nuevo {
    /*Pasar una cifra introducida por teclado de decimal a binario, octal y 
    hexadecimal. No se pueden utilizar funciones predefinidas de JAVA.
    */
    
      public static void main( String args[] ){
          //Declaracion de variables
          int numero = 59;
          String binario;
          String octal = "";
          String hexa;
          int aux = 0;
            
          //Calculo binario
          
          aux = numero;
         
          String miString = "";
          while ( aux >= 1){
              miString = (Integer.toString(aux % 2)) + miString;
              aux = aux / 2;
          }// final del while
          binario = miString;
          //Salida
          System.out.printf("El numero %d en binario es %s\n", numero, binario);
          
          
          //Calculo octal
          //Variables auxiliares
          int resto = 0;
          int resultNum = 0;
          octal = "";          
          
          //Dentro de este if, para que 
          if(numero>7){
              resultNum = numero;
              while (resultNum > 7){
                  resto = resultNum % 8;
                  octal = Integer.toString(resto) + octal;
                  resultNum = resultNum / 8;
              }//fin del while
              octal = Integer.toString(resultNum % 8) + octal;
          } else {
             octal = Integer.toString(numero);
          }

          System.out.printf("El numero %d en octal es %s\n", numero, octal);
          
          //Calculo hexadecimal
          resto = 0;
          resultNum = 0;
          hexa = "";                
          String hexad[] = {"0","1","2","3","4","5","6","7","8","9",
                                "A", "B","C","D","E","G"};
          
          //Dentro de este if, para que 
          if(numero>15){
              resultNum = numero;
              while (resultNum > 15){
                  resto = resultNum % 16;
                  hexa = hexad[resto] + hexa;
                  resultNum = resultNum / 16;
              }//fin del while
              hexa = hexad[resultNum % 16] + hexa;
          } else {
             hexa = hexad[numero];
          }

          System.out.printf("El numero %d en hexadecimal es %s\n", numero, hexa);  
          
      }// fin del main
}// fin de calculaBinarioOctalHexa3
