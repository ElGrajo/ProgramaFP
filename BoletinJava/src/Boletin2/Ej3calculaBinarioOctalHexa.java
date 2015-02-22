package Boletin2;

/**
 *
 * @author Julian
 */
public class Ej3calculaBinarioOctalHexa {
    /*Pasar una cifra introducida por teclado de decimal a binario, octal y 
    hexadecimal. No se pueden utilizar funciones predefinidas de JAVA.
    */
    
      public static void main( String args[] ){
          //Declaracion de variables
          int numero = 18;
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
          octal = binario; // se le da un valor por si no entra en el bucle
          miString = ""; //donde se concatenara el resultado
          String auxiliar = binario; 
          while ( auxiliar.length() > 0){
              
              // completa la cifra si tiene menos de tres
              if (auxiliar.length()< 3 ){
              auxiliar = String.format("%03d", Integer.parseInt(auxiliar));
              }
              
              // Saca los ultimos tres caracteres y busca su valor octal
              String tresFinales = auxiliar.substring(auxiliar.length()-3,auxiliar.length());
              switch(tresFinales){
                  case "000":
                      miString = "0" + miString;
                  break;
                  case "001":
                      miString = "1" + miString;
                  break;
                  case "010":
                      miString = "2" + miString;
                  break;
                  case "011":
                      miString = "3" + miString;
                  break;
                  case "100":
                      miString = "4" + miString;
                  break;
                  case "101":
                      miString = "5" + miString;
                  break;
                  case "110":
                      miString = "6" + miString;
                  break;
                  case "111":
                      miString = "7" + miString;
                  break;    
              }
              auxiliar = auxiliar.substring(0, auxiliar.length()-3);
              
          
          }// final del while
          
          System.out.printf("El numero %d en octal es %s\n", numero, miString);
          
          //Calculo hexadecimal
         
          miString = ""; //limpia el string donde se concatenara el resultado
          auxiliar = binario; // toma el dato binario, para trabajar con el
          
          //Inicia el bucle que irá recortando el numero binario de cuatro en cuatro
          while ( auxiliar.length() > 0){
              
              // completa la cifra si tiene menos de cuatro
              if (auxiliar.length()< 4 ){
              auxiliar = String.format("%04d", Integer.parseInt(auxiliar));
              }
              
              // Saca los ultimos cuatro caracteres y busca su valor hexa
              String cuatroFinales = auxiliar.substring(auxiliar.length()-4,auxiliar.length());
              char[] aCuatroFinales = cuatroFinales.toCharArray();
              String hexad[] = {"0","1","2","3","4","5","6","7","8","9",
                                "A", "B","C","D","E","G"};
              
              // de binario a decimal. Toma siempre los ultimos cuatro ultimos
              int cuatroFinalesDecimales = 0;
              int potencia = 0; 
            
              //for que recorre los cuatro caracteres de atras a adelante
              for (int i = cuatroFinales.length()-1; 0 <= i; i--) {
                  
                  potencia = potencia + 1;
                  // si el caracter es 1
                  if(aCuatroFinales[i] == '1'){
                      int n = 1;
                      for (int j = 0; j < potencia -1; j++) {
                          n = n * 2;                                         
                      }
                      if (n ==0){
                          n = 1;
                      }// final de if
                      cuatroFinalesDecimales = cuatroFinalesDecimales + n;
                  }
              }// final del for              
              
              // Concatena los hexadecimales.
              miString = hexad[cuatroFinalesDecimales]+ miString;              
              
              // Le saca los cuatro últimos caracteres si sigue
              auxiliar = auxiliar.substring(0, auxiliar.length()-4);
              
          
          }// final del while
          hexa = miString;
          System.out.printf("El numero %d en hexadecimal es %s\n", numero, hexa);  
          
      }// fin del main
}// fin de calculaBinarioOctalHexa3
