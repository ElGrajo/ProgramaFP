package strings;


import java.io.File;
import java.io.FileNotFoundException;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class Char {
    public static void main(String[] args) throws FileNotFoundException{
    String archivo = "src/strings/lorem";
    Scanner sc = new Scanner(new File(archivo));
    sc.useLocale(Locale.ENGLISH); //Esto es para que tome los datos double ,

    int acumulador[] = new int[26];
    int acumuladorString[] ;
    while(sc.hasNext()){
        //Toma la palabra y la pone en minúsculas
     String palabra = sc.next();
     palabra = palabra.toLowerCase();
     
     //For calculando 
        for (int i = 0; i < palabra.length() ; i++) {
           int LetraCaracter = (int)palabra.charAt(i);
           LetraCaracter = LetraCaracter - 97;
           if(LetraCaracter > -1){
            acumulador[LetraCaracter]++;
           }
          // System.out.printf("%s = %s\n",palabra.charAt(i), LetraCaracter);    
        }
        
    }
    for (int i = 0; i < acumulador.length ; i++) {
            int  b = i+97;
             char myChar = (char) b; // cast from int to char
            System.out.println(myChar+ " = " + acumulador[i]);
        } 
    }
    
    
}