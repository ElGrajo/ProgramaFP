package arrays;

/**
 *
 * @author Julian
 * 5. Leer los datos correspondientes a dos arrays de 12 elementos numéricos, 
 * y mezclarlos en un tercer array de la forma: 3 de la tabla A, 3 de la B, 
 * otros 3 de A, otros 3 de la B, etc
 */
public class Ej5MezclaArrays {
    public static void main(String args[]){
        
        int tercer[];
        int[] primer={154, 54, 58, 24, 25, 58, 28, 87,89,87,48,25 };
        int[] segundo ={-154, -54, -58, -24, -25, -58, -28, -87,-89,-87,-48,-25};
        tercer = new int [24];
        int contador1 = 0; // Este contador recorrerá el array primer
        int contador2 = 0;// este contador recorrerá el array segundo
        boolean controlIf = true;
        
        //mezclador de arrays
        for (int i = 0; i < tercer.length ; i++) {

          //si es verdadero entra en el if
           if(controlIf){
              //Le pone la variable del contador1 al tercer array
              tercer[i] = primer[contador1];
              contador1++; // Suma uno al contador propio
              //Si entra al if es que ya puso tres valores, cambia booleano
              if(contador1 % 3 == 0){ 
                  controlIf = false;
              }
           }else{
               //Lo mismo que arriba, y vuelve a cambiar el booleano
               tercer[i] = segundo[contador2];
               contador2++;
               if(contador2 % 3 == 0){
                   controlIf = true;
               }
           }//fin del else contadores 
                 
            System.out.printf("La variable es %d\n", tercer[i]);
        }//for que recorre todo el array tres
    }// fin del main
}// fin de clase
