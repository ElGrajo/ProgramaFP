/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author DAM1
 */
public class ArraysBidimensional {
    public static void main(String[] args) {
        String [][] matrizCosas;
        matrizCosas = new String[3][];
        matrizCosas[0] = new String[3];
        matrizCosas[1] = new String[3];
        matrizCosas[2] = new String[3];
        
        matrizCosas[0][0] = "Tigre";
        matrizCosas[0][1] = "Argentina";
        matrizCosas[0][2] = "Pasion";

        matrizCosas[1][0] = "Barsa";
        matrizCosas[1][1] = "España";
        matrizCosas[1][2] = "Negocio";
        
        matrizCosas[2][0] = "Inter";
        matrizCosas[2][1] = "Italia";
        matrizCosas[2][2] = "Pasta";
        
      //recorremos las filas con i
       for(int i = 0; i < 3; i++){
           System.out.println("Estamos en la fila " + i);
           //recorremos las columnas con j
           for (int j = 0; j < 3; j++) {
               System.out.println("Estamos en la columna " + j);
               System.out.println("El dato de la posicion " + i
               + " " + j + " es: ");
               System.out.println(matrizCosas[i][j]);
           } // fin del for j
       }//fin del for i
        
      //recorrerlo con LENGTH
          for(int i = 0; i < matrizCosas.length; i++){
           //recorremos las columnas con j
           for (int j = 0; j < matrizCosas[i].length; j++) {
               System.out.print(matrizCosas[i][j]);
           } // fin del for j
           System.out.println(" ");
       }//fin del for i
        
    }// fin del main
}//Fin de la clase
