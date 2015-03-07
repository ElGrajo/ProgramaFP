package recursivo;

import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class EjSumaDigitos {
    public static void main(String args[]){
        
        Scanner sc = new Scanner(System.in);
        long numero = sc.nextLong();
        while(numero != 0){
        String respuesta = numeritos(numero)+ SumaDigitos(numero);
        System.out.println(respuesta);
        numero = sc.nextLong();
        }
    }
    
    public static long SumaDigitos(long numero){
        if(numero<0)
            return -1;
        if(numero<10){
            return numero;
        }else{
            return(SumaDigitos(numero/10) + numero%10);
        }
    }
    
    //Metodo sobreCargado, que utiliza el que tiene recursividad.
    public static String numeritos(long numero){
        String miNumero = Long.toString(numero);
        return numeritos(miNumero, 0);
    }
    
    public static String numeritos(String numeroString, int inicio){
        
        //caso Base
        if(inicio >= numeroString.length()-1){
            return numeroString.charAt(inicio) + " = ";
        //caso recursivo, que le suma un lugar a inicio
        } else {
            return numeroString.charAt(inicio) + " + " + numeritos(numeroString, inicio + 1);
        }
        
        /*
        String miNumero = Integer.toString(numero);
        String respuesta = miNumero.charAt(0) + " + ";         
        for (int i = 1; i < miNumero.length()-1; i++) {
            respuesta = respuesta + miNumero.charAt(i) + " + ";
        }
        respuesta = respuesta + miNumero.charAt(miNumero.length()-1) + " = ";
        return respuesta;*/
    }
}
