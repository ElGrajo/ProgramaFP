package metodos;  
import java.util.ArrayList;
import java.util.Scanner;

public class RadaresReto {
    public static void main(String[] args) {
        // TODO code application logic here
        
        int metros;
        int velPerm;
        int segundos;
        Scanner entrada = new Scanner(System.in);
        ArrayList<String> respuestas = new ArrayList();
        

        
        //el do se repite mientras los valores no sean 0.
        do {
            String miEntrada = entrada.nextLine(); 
            String entradas[] = miEntrada.split(" ");
            
            metros = Integer.parseInt(entradas[0]);
            velPerm = Integer.parseInt(entradas[1]);
            segundos = Integer.parseInt(entradas[2]);
            
            if(!((metros == 0)&&(velPerm==0)&&(segundos==0))){
                respuestas.add((prueba(metros, velPerm, segundos)));
            }
        }while (!((metros == 0)&&(velPerm==0)&&(segundos==0)));
        
        for(String cadaRta : respuestas){
            System.out.println(cadaRta);
        }
        //fin
    }    
    
    
    public static String prueba(int metro, int velPer, int segundo){

    //Si algún valor es menor que 0
    if( metro < 0 || velPer < 0 || segundo < 0){
        return "ERROR";
    }//
    
    //
    double Kilometros = (double)metro / 1000;
    double horas = (double)segundo / 3600;
    double velocidadActual = Kilometros / horas;
    
    if(velocidadActual <= velPer){
        return "OK";
    }else{
        if (velocidadActual > (velPer * 1.2)) {
            return "PUNTOS"; 
        }else{
            return "MULTA";
        }//fin if velocidad actual > velocidad permitida + 20%
    }//fin if 
   
    }//fin metodo prueba
}//Fin de clase Radares
