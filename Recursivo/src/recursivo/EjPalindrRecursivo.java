package recursivo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * Programa que detecta los palindromos
 * por cada línea
 */
public class EjPalindrRecursivo {
    public static void main(String[] args) throws FileNotFoundException{
     String archivo = "C:\\proyects\\Strings\\src\\strings\\palindromos.txt";
     Scanner sc = new Scanner(new File(archivo));
     StringBuilder linea = new StringBuilder();
     
     while(sc.hasNext()){
        //Toma la palabra y la pone en minúsculas
     String palabra = sc.nextLine();
     palabra = palabra.toLowerCase();
     
     //For que acumule las letras
        for (int i = 0; i < palabra.length() ; i++) {
           int LetraCaracter = (int)palabra.charAt(i);
          if(LetraCaracter > 96){
           if((LetraCaracter > 96) && (LetraCaracter < 123 )){
               linea.append(palabra.charAt(i));
           }else if (LetraCaracter == 225) {
               linea.append('a');
           }else if (LetraCaracter == 237){
               linea.append('i');
           }else if (LetraCaracter == 243){
               linea.append('o');
           }else if (LetraCaracter == 250){
               linea.append('u');
           }else if (LetraCaracter == 241){
               linea.append('ñ');
           }else if (LetraCaracter == 233){
               linea.append('e');
           }else if(LetraCaracter == 252){
               linea.append('u');
           }  
           }
        }
         //falta ajustar los pares impares
         String derecho = linea.substring(0);
         linea.reverse();
         String reves = linea.substring(0);
                  
        //System.out.println(derecho);
        // System.out.println(reves);
         
         if(derecho.equals(reves)){
             System.out.println(palabra + " es palindromo");
         }else{
             System.out.println(palabra +" NO es palindromo");}
         
         linea.setLength(0);
    }
     
     
     
    }
    
    public static boolean esPalindromo(String texto){
        if(texto.length()== 0){
            return true;
        }else if(texto.length() == 1){
            return true;
        } else {
            if(texto.charAt(0)== texto.charAt(texto.length() - 1)){
                return esPalindromo(texto.substring(1, texto.length()-1));
            }else{
                return false;
            }
        }
    
    
    }
}
