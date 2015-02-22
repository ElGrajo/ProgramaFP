package programejos;
import java.util.Scanner;

public class pastilleroRefactor {
    public static void main(String args[]){
        
        Scanner entrada = new Scanner(System.in);
        int casosPedidos;
        int cantidadSemanas;
        casosPedidos = entrada.nextInt();
        String respuestas [] = new String[casosPedidos];
        for (int i = 0; i < casosPedidos; i++) {
            
            cantidadSemanas = entrada.nextInt();
             String PastilleroIngresado[] = new String [cantidadSemanas];
            for (int j = 0; j < cantidadSemanas ; j++) {
               PastilleroIngresado[j] = entrada.next();
            }
            respuestas[i] = diaNumero(PastilleroIngresado);
        }
        
        for( String cadaUna : respuestas){
            System.out.println(cadaUna);
        }
    }// fin del main
    
    
    public static String diaNumero(String pastiSobrantes[]){
        
        //Listado de los días de la semana
         char diasSemana [] = {'L','M','X','J','V','S','D'};
         boolean noFaltaNinguna = true;
         short sobrantes = (short)pastiSobrantes.length;
        //Llenar el pastillero con las pastillas sin usar
        int PastillasSinUsar [] = new int [7];
        
        for ( String pastiSobran : pastiSobrantes) {
            for (int j = 0; j < 7; j++) {
                char pasti;
                pasti = pastiSobran.charAt(j);
                if(noFaltaNinguna==true && pasti=='-'){
                    noFaltaNinguna=false;
                }
                if(pasti == '*'){
                    // de ser un '*', suma uno a ese día de la semana
                    PastillasSinUsar[j] = PastillasSinUsar[j]+1;
                }
            }//que recorre los dias de la semana                     
        }
        int ultimoDia = 6; //Poniendo los valores máximos
        int minimoPasti = sobrantes;
        
        //por si todas las pastillas están completas.
        if (noFaltaNinguna){
        return "L " + (minimoPasti+1);
        }
        
        for (int i = 0; i < 7 ; i++) {            
            if(PastillasSinUsar[i] < minimoPasti){
                ultimoDia = i;
                minimoPasti = PastillasSinUsar[i];
            }//
        }
        return diasSemana[ultimoDia]+ " " + (minimoPasti+1);
        }//fin de DiaNumero
}//fin de pastillas