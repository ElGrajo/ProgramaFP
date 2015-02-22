/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package historia;

/**
 *
 * @author Julian
 */
import java.util.Random;
public class Historia {
        public int siglar (int ano){
            int siglo = 1;
            
            // en el caso de que envien un resultado 0
            if(ano == 0)
                ano += 1;
            
            if(ano % 100 == 0 ){
                // si es multipo de 100, es todavia del siglo anterior
                siglo = (ano / 100);
            } else {
                if (ano < 0 ){
                    // es menor de cero se le resta
                    siglo = (ano / 100) - 1;
                } else {
                    // si es mayor se le suma
                    siglo = (ano / 100) + 1;
                }
            }
            
            return siglo;
        }// fin de siglar
        
        public String romanizarBarato(int dato){
            String sigloRomano = "";
            
            // si es antes de cristo
            if (dato < 0){
                sigloRomano = " a.C.";
                dato = dato * -1;
            }// fin del if
            
            String siglos[] = {
            "", "I","II","III","IV","V","VI","VII","VIII","IX","X",
             "XI","XII","XIII","XIV","XV","XVI","XVII","XVIII","XIX","XX",
             "XXI","XXII","XXIII","XXIV","XXV","XXVI","XXVII","XXVIII","XXIX","XXX",
             "XXXI","XXXII","XXXIII" };
            
            sigloRomano = siglos[dato] + sigloRomano;
            
            return sigloRomano;
        } // fin de romanizarBarato
        
        public String respuestaCorrecta(){
           
            Random numAleat = new Random();
            int caso = numAleat.nextInt(2);
            String respuestas[] = {
                "Muy bien",
                "Bien. Sigue avanzando",
                "Excelente" };// fin del array
            
            return respuestas[caso];

        }// fin de respuestaCorrecta
        
        public String respuestaErrada(){
           
            Random nroAlt = new Random();
            int caso = nroAlt.nextInt(2);
            String respuestas[] = {
                "Uh... no está bien",
                "No, no es correcta",
                "Intentalo otra vez" };// fin del array
            
            return respuestas[caso];

        }// fin de respuestaErrada
}// fin de Historia
