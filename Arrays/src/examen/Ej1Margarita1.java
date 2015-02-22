package examen;

/**
 * Ejercicio de evaluacion
 * Los alumnos se ponen en fila y reciben la nota por deshojar la margarita.
 * Mostrar el orden en que reciben dicha nota.
 * @author Julian Gawron
 */
public class Ej1Margarita1 {
    public static void main(String args[]){
        int petalosMargaritas = 5;
        int totalAlumnos = 10;
        int notasAlumnos [] = new int [totalAlumnos];
        int aprueba = petalosMargaritas % 2; //0 es no y 1 es Aprueba
        //si todas las margaritas son iguales, todos los resultados seran
        // los mismos.
        
        /* llenamos el array de numeros 2, que significa que no
        fueron calificados*/
        
        for (int i = 0; i < notasAlumnos.length; i++) {
            notasAlumnos[i]= 2;
        }
        
        
        for (int i = 0; i < totalAlumnos; i++) {
              int contadorInterno = 0;  
                //For que hace toda la margarita
                for (int j = 0; j < petalosMargaritas; j++) {
                    
                    //Ultimo pétalo, que pone el valor
                    if(j == (petalosMargaritas - 1) ){
                        notasAlumnos[contadorInterno] = aprueba;
                        System.out.printf("%dº El alumno %d\n",i+1, contadorInterno+1);
                    }
                    
                    do{
                       contadorInterno++;
                    }while(!(notasAlumnos[contadorInterno]==2));
                    
                    if(contadorInterno <= (totalAlumnos-1)){
                        contadorInterno = 0;
                       }                                              
                }//for que recorre toda la margarita
        }// for que recorre todos los alumnos
        
    }// fin del main
}// fin de la clase
