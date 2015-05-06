package examen;

/**
 * @author Julian Gawron
 */
public class Ej1MargaritaFinal {
    public static void main(String args[]){
        int petalosMargaritas = 35;
        int totalAlumnos = 26;
        int aprueba = petalosMargaritas % 2;
        int alumnosRestantes[][];
        alumnosRestantes = new int [totalAlumnos][];
        
        String nota = "";
        if(aprueba==1){
            nota = "Aprueba";
        } else {
            nota = "Suspende";
        }
        
        //Generar los array decrecientes
        for (int i = 0; i < totalAlumnos; i++) {
            alumnosRestantes[i] = new int [totalAlumnos-i];
        }
        
        //Llenar la primera dimension del array con los número consecutivos
        for (int i = 0; i < totalAlumnos; i++) {
            alumnosRestantes[0][i]= i+1;
        }
          
        //Una vuelta para sacar a cada alumno
        for (int i = 0; i < totalAlumnos; i++) {
            
            //Este contador vuelve a 0 con cada margarita nueva
            // y dentro del bucle de los pétalos cuenta
            // el lugar del alumno en el array
            int lugarDeAlumnoEnArray = 0;
            

          //Una vuelta por cada margarita, el último petalo saca el alumno
            for (int j = 0; j < petalosMargaritas; j++) {
                 
                if(lugarDeAlumnoEnArray>=alumnosRestantes[i].length){
                    //Si el lugar del alumno es igual o mayor al total,
                    //se pone a cero y sigue contando
                    lugarDeAlumnoEnArray=0;
                }
                
                // System.out.print(lugarDeAlumnoEnArray); //verificacion
                
                //Ultimo petalo
                if(j==petalosMargaritas-1){
                    System.out.println(nota + " el alumno "
                            + alumnosRestantes[i][lugarDeAlumnoEnArray]);                    
                    //Llenar nuevo array
                    for (int k = 0; k < alumnosRestantes[i].length-1; k++) {
                        //Llena el nuevo array salteando la posicion 
                        //lugarDeAlumnoEnArray

                        if (k < lugarDeAlumnoEnArray){
                          alumnosRestantes[i+1][k] = alumnosRestantes[i][k];
                        }else{
                          alumnosRestantes[i+1][k] = alumnosRestantes[i][k+1];
                        }// fin del if
                    }//fin del for K
                }//fin del if Petalos
                
                lugarDeAlumnoEnArray++;  
            }
        }
        
        //Verifica que los arrays y sus dimensiones existen y son correctas
        /*
        for (int i = 0; i < alumnosRestantes.length; i++) {
            for (int j = 0; j < alumnosRestantes[i].length; j++) {
                System.out.print(alumnosRestantes[i][j]);
            }
            System.out.println("");
        }
        */
    }// fin del main
}// fin de la clase
