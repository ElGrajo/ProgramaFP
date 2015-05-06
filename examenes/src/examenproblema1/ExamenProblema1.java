/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examenproblema1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Hashtable;
import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class ExamenProblema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        File archivo = new File("src/examenproblema1/fichero.txt");
        Scanner leer = new Scanner(archivo);
        int vueltas = leer.nextInt();
        leer.nextLine();
        int totalVisitas = vueltas;
        int bytesTotales = 0;
        int solicitudesNoResueltas = 0;
        int solicitudesCorrectas = 0;
        String[] visitantes = new String[vueltas];
        int visitantesUnicos = 0;
        String[] Paginas = new String[vueltas];
        int[] cuentaPaginas = new int[vueltas];
        while(vueltas>0){
       
            String lineaActual = leer.nextLine();
            String[] losDatos = lineaActual.split(" ");
            
            
            //Trafico total
            int bytesAct = Integer.parseInt(losDatos[5]);
            bytesTotales += bytesAct;
            
            //Solicitudes no resueltas
           if(losDatos[4].equals("200"))
               solicitudesCorrectas++;
           else
               solicitudesNoResueltas++;

           
           //Ver visitantes unicos
            for (int i = 0; i < visitantes.length; i++) {
                if(visitantes[i].equals(losDatos[0]))
                    break;
                if(visitantes[i] == null ){
                    visitantes[i] = losDatos[0];
                    visitantesUnicos++;
                    break;
                }
            }
           
           /* 
            for (int i = 0; i < Paginas.length; i++) {

                if(Paginas[i].isEmpty()){
                    Paginas[i] = losDatos[2];
                    break;
                }
               if(Paginas[i].equals(losDatos[2]))
                    cuentaPaginas[i]++;
            }
            */
            
            
            
        
        vueltas--;
        }//fin del while
        
        int indicePagMayor = 0;
        for (int i = 0; i < cuentaPaginas.length; i++) {
            if(cuentaPaginas[i]>cuentaPaginas[indicePagMayor])
                indicePagMayor = i;
        }
        System.out.println(totalVisitas);
        System.out.println(bytesTotales);
        System.out.println(visitantesUnicos);
        System.out.println(solicitudesCorrectas);
        System.out.println(solicitudesNoResueltas);
        System.out.println(Paginas[indicePagMayor]);
    }
    
}
