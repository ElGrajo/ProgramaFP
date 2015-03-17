package AceptaRetoClase;
import java.util.Scanner;

/**
 * Cuanta veces hay
 */
public class cuentaCuantas {
    public static void main(String args[]){    
    Scanner sc = new Scanner(System.in);
    String numero1 = sc.next();
    String numero2 = sc.next();
    
    while(!((numero1.equals("0"))&&((numero2.equals("0"))))){
        int pasa = 0;
        String aux = "";
        if(numero1.length() < numero2.length()){
            aux = numero1;
            numero1 = numero2;
            numero2 = aux;
        }
        int masCorto = numero2.length();
       
        int contador = 0;
        int i; //Ponemos fuera i para reutilizarlo luego, en caso de distinto
        // tamaño
        
        for (i = 0; i < masCorto; i++) {
           //compara las dos posiciones del String, 
           // el -48 es por el numero ASCII   
           int num1 = (numero1.charAt(numero1.length()-1-i))-48;
           int num2 = (numero2.charAt(numero2.length()-1-i))-48;
           int suma = num1 + num2 + pasa;
           
           //Si la suma pasa de 9
           if(suma>9){
               contador++;
               pasa = (int)suma/10;
           }else{
               pasa = 0;
           }
        }
        //Comprobacion del resto de los caracteres
        if((pasa==1)&&(numero1.length()>numero2.length())&&((numero1.charAt(i)-48)==9)){
         while((i<numero1.length())&&((numero1.charAt(i)-48)==9)){
             contador++;
             i++;
         }            
        }

        System.out.println(contador);   
    numero1 = sc.next();
    numero2 = sc.next();
    }
        
    }

}
