package arrays;

/**
 *
 * @author Julián Gawron
 * 1.	Se tiene la siguiente información:
 * - Nombres de 4 empleados.
 * - Ingresos en concepto de sueldo, cobrado por cada empleado, en los 
 * últimos 3 meses.
 * 
 * Confeccionar el programa para:
 * a) Realizar la carga de la información mencionada. 
 * b) Generar un array que contenga el ingreso acumulado en sueldos en los 
 * últimos 3 meses para cada empleado.
 * c) Mostrar por pantalla el total pagado en sueldos a todos los empleados 
 * en los últimos 3 meses 
 * d)Obtener el nombre del empleado que tuvo el mayor ingreso acumulado
 * Empleados    sueldos             Sueldostot
 * Marcos       540     540     760
 * Ana          200     220     250
 * Luis         760     760     760
 * Maria        605     799     810
* 

 */
public class Ej10Sueldos {
     public static void main(String[] args) {
         //Creando los arrays
         String nombres []= {"Marcos", "Ana", "Luis", "Maria"};
         int sueldos[][]={
             {540,540,760},
             {200,220,250},
             {760,760,760},
             {605,799,810}
         };
         int totSueldos[];
         totSueldos = new int[4];
         
         //Suma los sueldos
         for (int i = 0; i < totSueldos.length; i++) {
             for (int j = 0; j < sueldos[i].length; j++) {
                 totSueldos[i] = totSueldos[i] + sueldos[i][j];
             }//fin del for
         }//fin del for mayor
         
         //Imprime resultados
         for (int i = 0; i < nombres.length; i++) {
             System.out.printf("El salario total de %s es %d\n", nombres[i],
                     totSueldos[i]);
         }
         
     }// fin del main
}// Clase Ej10Sueldos
