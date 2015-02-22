/*
7.12 Eliminación de duplicados
Use un arreglo unidimensional para resolver el siguiente problema: 
escriba una aplicación que reciba como entrada cinco números, 
cada uno de los cuales debe estar entre 10 y 100. A medida que se lea cada número, 
muéstrelo solamente si no es un duplicado de un número que ya se haya leído. 
Prepárese para el “peor caso”, en el que los cinco números son diferentes. 
Use el arreglo más pequeño que sea posible para resolver este problema. 
Muestre el conjunto completo de valores únicos introducidos, después de que el 
usuario introduzca cada nuevo valor.
*/
package cap07Ejercicios;

/**
 *
 * @author Julian
 */
import java.util.Scanner;
public class Ej0712 {
    
    // Damos forma al array principal
    int principal[] = new int [5];
    Scanner entrada = new Scanner(System.in);
    
    public void Mensaje1(){
    System.out.println("Se le pedirá ingresar 5 números"
            + " entre 10 y 100 y\n"
            + "se mostrarán los que no se repitan.");
    }// fin de mensaje1
    public void Siguiente(){
        System.out.print("Ingrese un número:");
        int numero = entrada.nextInt();
        
        // Chequear el contenido
        while( numero<10 || numero>100){
             System.out.print("Ingrese otro número:");
             numero = entrada.nextInt();
        }
        
        
        for(int i = 0; i < principal.length; i++){
            if(principal[0]== 0){
                principal[0] = numero;
                break;
            }
            
            if(principal[i]== numero){
                break;
            } else {
            if (principal[i]==0){
                 principal[i]= numero;
                 break;
            }
            }//final del else
            
        }//recorre el bucle
    }// fin de siguiente
    
    public void imprimeResultados(){
        System.out.print("Los numeros ingresados son: ");
         for(int i = 0; i < principal.length; i++){
             if(principal[i] != 0){
                 System.out.printf(" %d ",principal[i]);
             }
             
         }
         System.out.print("\n");
    }// fin imprime resultados
    
}// fin de clase
