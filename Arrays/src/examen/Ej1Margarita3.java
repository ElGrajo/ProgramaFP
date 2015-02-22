package examen;

import java.util.ArrayList;

/**
 *
 * @author Julian
 */
public class Ej1Margarita3 {
    public static void main(String args[]){
        int petalosMargaritas = 10;
        int totalAlumnos = 6;
        int numeroAlumno [] = new int [totalAlumnos];
        ArrayList<String> LugarAlumno = new ArrayList<String>();
        int aprueba = petalosMargaritas % 2; //0 es no y 1 es Aprueba
        //si todas las margaritas son iguales, todos los resultados seran
        // los mismos.
        
        /* llenamos el array de numeros -1, que significa que no
        fueron y no tienen salida.*/
        for (int i = 1; i <= totalAlumnos; i++) {
            LugarAlumno.add("Alumno " + i);
        }
        
        for (int i = 0; i < totalAlumnos; i++) {

             int petaloSacado = 1;
            int cuentaAlumnos = 1;
            while (petaloSacado <= petalosMargaritas) {
                petaloSacado++;
                cuentaAlumnos++;
                if(petaloSacado==petalosMargaritas){
                   System.out.printf("%s \n",LugarAlumno.get(i+1)); 
                   LugarAlumno.remove(i+1);
                }
                if (cuentaAlumnos==LugarAlumno.size()){
                    cuentaAlumnos=1;
                }
                }


        }
        

    }
    
}