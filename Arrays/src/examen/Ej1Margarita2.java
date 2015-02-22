package examen;

/**
 *
 * @author Gawron, Julian
 */
public class Ej1Margarita2 {

    public static void main(String args[]){
        int petalosMargaritas = 10;
        int totalAlumnos = 11;
        int numeroAlumno [] = new int [totalAlumnos];
        int aprueba = petalosMargaritas % 2; //0 es no y 1 es Aprueba
        //si todas las margaritas son iguales, todos los resultados seran
        // los mismos.
        
        /* llenamos el array de numeros -1, que significa que no
        fueron y no tienen salida.*/
        for (int i = 0; i < numeroAlumno.length; i++) {
            numeroAlumno[i]= -1;
        }     
        //el for exterior se encarga de hacerlo una vez por alumno
        for (int i = 1; i <= totalAlumnos; i++) {
            //Este bucle saca cada uno de los pétalos
            int petaloSacado = 1;
            int cuentaAlumnos = 1;
            while (petaloSacado <= petalosMargaritas) {

                if(numeroAlumno[cuentaAlumnos-1]== -1){
                   System.out.print(cuentaAlumnos + " ");
                   petaloSacado++;
                   cuentaAlumnos++;
                } else {
                    while(!(numeroAlumno[cuentaAlumnos-1]== -1)){
                     cuentaAlumnos++;
                    }
                    petaloSacado++;
                }
                
                if ((petaloSacado == petalosMargaritas)){
                    numeroAlumno[cuentaAlumnos-1] = aprueba;
                    System.out.print("sale " + cuentaAlumnos );
                }
                
                if (cuentaAlumnos==totalAlumnos+1){
                    cuentaAlumnos=1;
                }


            }//final del while
            System.out.println("");
        }//final del for que recorre todos los alumnos
        
    }// fin del main
}// fin de la clase
