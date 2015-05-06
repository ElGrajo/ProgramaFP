/* 2. Dado un vector x de n elementos reales, donde n es impar, diseñar una función
que calcule y devuelva la mediana de ese vector. La mediana es el valor tal que 
la mitad de los números son mayores que el valor y la otra mitad son menores. 
Escribir un programa que compruebe la función.
*/

package ordenacionarrays;

/**
 *
 * @author DAM1
 */
public class Ej2OrdenacionArraysMediana {
    
    public static void main(String[] args) {
         int [] listaImpar = {28,4,56,754,4,65,7,32,78,8, 87,8};
         ordenador(listaImpar);
         
         //buscar la mediana
         if( 1 ==listaImpar.length % 2)
         System.out.println(listaImpar[(listaImpar.length/2)]);
         else {
            int primero = listaImpar[(listaImpar.length/2)];
            int segundo = listaImpar[(listaImpar.length/2)+1];
             System.out.println((primero+segundo)/2);
         }
         
         for (int i = 0; i < listaImpar.length; i++) {
             System.out.println(listaImpar[i]);
         }
         
     }
    
    //Ordenador anterior, pero ineficiente.
      static public void ordenador(int numeros[]){
         //buscar el numero menor
        for (int i = 0; i < numeros.length - 1; i++)
        {
            int menor = i;
            for (int j = i + 1; j < numeros.length; j++)
                //Comprueba si el valor de 
                if (numeros[j] < numeros[menor]){
                    menor = j;
                }
            //Rota los valores.
            int smallerNumber = numeros[menor]; 
            numeros[menor] = numeros[i];
            numeros[i] = smallerNumber;
        }
     }
    
}
