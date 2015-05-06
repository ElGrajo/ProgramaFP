/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenproblema2;

import java.io.File;
import java.io.FileNotFoundException;
import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class ExamenProblema2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        File archivo = new File("src/examenproblema2/fichero.txt");
        Scanner leer = new Scanner(archivo);
        while(leer.hasNext()){
            String miLinea = leer.nextLine();
            int respuesta = minutosParking(miLinea);
            if(respuesta>0)
                System.out.println(respuesta);
            else
                System.out.println("");
        }
    }
    public static int minutosParking(String datos){
        String misDatos[] = datos.split(" ");
        char tipo = misDatos[0].charAt(0);
        String[] Entrada = misDatos[1].split(":");
        int horaEntrada = Integer.parseInt(Entrada[0]);
        int minutosEntrada = Integer.parseInt(Entrada[1]);
        String[] Salida = misDatos[2].split(":");
        int horaSalida = Integer.parseInt(Salida[0]);
        int minutosSalida = Integer.parseInt(Salida[1]);
        
        int laEntrada = horaEntrada * 60 + minutosEntrada;
        int laSalida = horaSalida * 60 + minutosSalida;
        int minutosFinal = laSalida - laEntrada - 60; //Se le resta la oferta
        if(tipo == 'T')
            minutosFinal *= 2;
        else if(tipo =='C')
            minutosFinal *= 3;    
    return minutosFinal;
    }
}