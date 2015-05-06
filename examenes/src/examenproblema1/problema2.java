package examenproblema1;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class problema2 {

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
        int visitantesUnicos = 1;
        String[] Paginas = new String[vueltas];
        int[] cuentaPaginas = new int[vueltas];
       
        String todosLosDatos [][] = new String [vueltas][];
        String soloIPS [] = new String [vueltas];
        
        String IPADDRESS_PATTERN = 
		"^([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])\\." +
		"([01]?\\d\\d?|2[0-4]\\d|25[0-5])$";
        
        //Todos los datos cargados en un array de arrays
        for (int i = 0; i < vueltas; i++) {
            String lineaActual = leer.nextLine();
            //verifica validez 
            String losDatos[] = lineaActual.split(" ");
            if(losDatos[0].matches(IPADDRESS_PATTERN)){
                todosLosDatos[i] = losDatos;
                soloIPS[i] = losDatos[0];
            }   
        }
        //Ordenar 
        Arrays.sort(soloIPS);
        for (int i = 0; i < soloIPS.length-1; i++) {
            if(soloIPS[i]!= null && (soloIPS[i].equals(soloIPS[i+1])))
                visitantesUnicos++;
        }
        
        
        for (int i = 0; i < todosLosDatos.length; i++) {
            //Esto cuenta las soli
            if(todosLosDatos[i][4].equals("200"))
                solicitudesCorrectas++;
            else
                solicitudesNoResueltas++;
        }
        
        
        
        //ver navgadores
        for (int i = 0; i < todosLosDatos.length; i++) {
            System.out.println(todosLosDatos[i][6]);
        }
        
        /*
        
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
           
           
            for (int i = 0; i < Paginas.length; i++) {

                if(Paginas[i].isEmpty()){
                    Paginas[i] = losDatos[2];
                    break;
                }
               if(Paginas[i].equals(losDatos[2]))
                    cuentaPaginas[i]++;
            }
            
            
            
            
        
        vueltas--;
        }//fin del while
         */
        

        System.out.println(totalVisitas);
        System.out.println(bytesTotales);
        System.out.println("Visitantes unicos: "+visitantesUnicos);
        System.out.println(solicitudesCorrectas);
        System.out.println(solicitudesNoResueltas);
     
    }
    
}