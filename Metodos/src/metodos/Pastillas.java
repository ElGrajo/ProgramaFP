package metodos;

import java.util.Scanner;

/**
 *
 * @author DAM1
 * Entrada
 * La primera línea de la entrada contendrá el numero de casos de prueba que vienen
 * a continuacion.
 * Cada caso de prueba comienza con un numero que indica la cantidad de semanas 
 * que Mayte lleva guardando pastillas. A continuacion, se muestra, en lineas 
 * independientes, el estado de las pastillas correspondientes a cada semana. 
 * Comenzando por la del lunes, para cada una de las 7 pastillas se mostrara 
 * un * si Mayte no se tomo esa pastilla, o un - si lo hizo. Por ejemplo, si 
 * Mayte se ha tomado las pastillas del martes, miercoles, viernes y sabado la
 * entrada sera \*--*--*".
 * Salida
 * Para cada caso de prueba se debe indicar el dia de la semana en el que Mayte
 * debera empezar una caja no usada de pastillas, y en que semana se esta 
 * (empezando a contar por 1). Recuerda que Mayte comienza en lunes la medida 
 * de reciclar pastillas, y que nunca se toma una pastilla un dia de la semana
 * diferente a aquel con el que esta etiquetada.
 * En la salida, los días de la semana se representaran con una unica letra, 
 * escribiendo L para lunes, M para martes, X para miercoles, J para jueves, 
 * V para viernes, S para sabado y D para domingo.
 * 
Entrada de ejemplo
2
4
*******
*--*--*
*-*-*-*
--*---*
3
-------
*****-*
*******

Salida de ejemplo
M 2
S 2
 */
public class Pastillas {
    public static void main(String args[]){
        /*
        //Entrada no implementada, y puesta fija para pruebas.
        Scanner entrada = new Scanner(System.in);
        
        int cantidadDatos;
        int cantidadSemanas;
        
        
        System.out.print("¿Cuantas semanas?:");
        cantidadSemanas = entrada.nextInt();
        */
        
        String Pastillero[] = new String [4];
        Pastillero[0] = "*******";
        Pastillero[1] = "*--*--*";
        Pastillero[2] = "*-*-*-*";
        Pastillero[3] = "--*---*";
        
        System.out.println(diaNumero(Pastillero));
        
        String OtroPastillero[] = new String [3];
        OtroPastillero[0] = "-------";
        OtroPastillero[1] = "*****-*";
        OtroPastillero[2] = "*******";
        
        System.out.println(diaNumero(OtroPastillero));
        
    }// fin del main
    
    
    public static String diaNumero(String pastiSobrantes[]){
        
        //Listado de los días de la semana
         char diasSemana [] = {'L','M','X','J','V','S','D'};
         
        //Llenar el pastillero con las pastillas sin usar
        int PastillasSinUsar [] = new int [7];
        
        for (int i = 0; i < pastiSobrantes.length ; i++) {
            for (int j = 0; j < 7; j++) {
                //Chequea por cada char del Strin si es un '*'
                char pasti = pastiSobrantes[i].charAt(j);
                
                if(pasti == '*'){
                    // de ser un '*', suma uno a ese día de la semana
                    PastillasSinUsar[j] = PastillasSinUsar[j]+1;
                }
            }//que recorre los dias de la semana                     
        }
        
        
        /* //Lista de pastillas acumuladas
        for (int i = 0; i < PastillasSinUsar.length ; i++) {
            System.out.printf("%s:%d ", diasSemana[i], PastillasSinUsar[i]);
        }
        */
        
        //Extraer la información de PastillasSinUsar
        //Se busca el primer valor mínimo del array que
        //será el primer día que tiene que comprar más pastillas.
        int ultimoDia = 6; //Poniendo los valores máximos
        int minimoPasti = pastiSobrantes.length;
        for (int i = 0; i < PastillasSinUsar.length ; i++) {
            
            if(PastillasSinUsar[i] < minimoPasti){
                ultimoDia = i;
                minimoPasti = PastillasSinUsar[i];
            }//
        }
        
        return diasSemana[ultimoDia]+ " " + (minimoPasti+1);
        }//fin de DiaNumero
        
        
   
}//fin de pastillas
