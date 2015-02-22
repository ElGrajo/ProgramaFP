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
public class ArraysBidimensionalIrregular {

    public static void main(String[] args) {
        String [][] matrizCosas;
        matrizCosas = new String[3][];
        matrizCosas[0] = new String[3];
        matrizCosas[1] = new String[1];
        matrizCosas[2] = new String[2];
        
        matrizCosas[0][0] = "Tigre";
        matrizCosas[0][1] = "Argentina";
        matrizCosas[0][2] = "Pasion";

        matrizCosas[1][0] = "Barsa";
       
        matrizCosas[2][0] = "Inter";
        matrizCosas[2][1] = "Italia";

    
      //recorrerlo con LENGTH
          for(int i = 0; i < matrizCosas.length; i++){
           //recorremos las columnas con j
           for (int j = 0; j < matrizCosas[i].length; j++) {
               System.out.print(matrizCosas[i][j]);
               System.out.print(matrizCosas[i].length);
           } // fin del for j
           System.out.println(" ");
       }//fin del for i
        
    }// fin del main
}//Fin de la clase
