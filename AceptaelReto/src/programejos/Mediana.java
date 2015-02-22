package programejos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

/**
 * Entrada
 * 11
 * 1 2 6 17 18 22 35 46 109 153 200
 * 5
 * 5 3 1 2 8
 * 4
 * 4 5 9 2
 * 0
 * 
 * Salida
 * 44
 * 6
 * 9
 * @author Julian
 */
public class Mediana {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 1;
        ArrayList<String> preguntas = new ArrayList();
        while(numero != 0){
            numero = sc.nextShort();
            if (numero == 0)break;
            sc.nextLine();
            String ListaEntera = sc.nextLine();
            preguntas.add(ListaEntera);
        }   
        for(String cadaPreg : preguntas ){
            System.out.println(Mediana(cadaPreg));
        }
        /*
        String listaTot = sc.nextLine();
        String miString = "1 2 6 17 18 22 35 46 109 153 200";
        
        System.out.println(Mediana(miString));
        System.out.println(Mediana("5 3 1 2 8"));
        System.out.println(Mediana("4 5 9 2")); */
    }
    
    public static int Mediana(String Numeros){
        String lista[] = Numeros.split(" ");
        short largoLista = (short)lista.length;
        int listaNum[] = new int [largoLista]; 
        for (short i = 0; i < largoLista; i++) {
            listaNum[i] = Integer.parseInt(lista[i]);
        }
       Arrays.sort(listaNum);
        
        if (largoLista % 2 == 0){
            short ubic = (short)((largoLista-1)/2);
            int a = listaNum[ubic];
            int b = listaNum[ubic+1];
            return a + b;
        }else{
            short ubic = (short)(largoLista/2);
            return 2 * (listaNum[ubic]);
        }
    }
}
