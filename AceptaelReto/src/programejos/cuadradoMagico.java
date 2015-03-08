/*
 * Entrada de ejemplo
3
4 9 2 3 5 7 8 1 6
2
1 2 3 4
4
16 3 2 13 5 10 11 8 9 6 7 12 4 15 14 1
3
28 21 26 23 25 27 24 29 22
3
2 8 1 6 3 5 7 4 9
5
15 8 1 24 17 16 14 7 5 23 22 20 13 6 4 3 21 19 12 10 9 2 25 18 11
0

Salida de ejemplo
ESOTERICO
NO
ESOTERICO
DIABOLICO
NO
ESOTERICO
 */
package programejos;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class cuadradoMagico {
     public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int dimension = sc.nextInt();
         while(dimension != 0){
            int tabla[][] = new int[dimension][dimension];
            for(int i = 0; i < tabla.length; i++) {
                 for (int j = 0; j < tabla[1].length; j++) {
                     tabla[i][j] = sc.nextInt();
                 }//For interno
            }//Fin de la toma de dato
             
            boolean magic = esMagico(tabla);
            boolean esoteric = esEsoterico(tabla);
            if(magic){
                if(esoteric){
                    System.out.println("ESOTERICO");
                }else {
                    System.out.println("DIABOLICO");
                }
            }else{
                System.out.println("NO");
            }
            dimension = sc.nextInt();
         }
     }
     
     public static boolean esMagico(int[][] datos){
             int dimension = datos.length;
             int nroMagico = 0;
             // Verificar Si es mágico horizontal y vertical
             for (int i = 0; i < dimension; i++) {
                 int pruebaHoriz = 0;
                 int pruebaVerti = 0;
                 
                 for (int j = 0; j < dimension; j++) {
                     pruebaHoriz += datos[i][j];
                     pruebaVerti += datos[j][i];
                 }
                 if(!(pruebaHoriz == pruebaVerti)){
                     return false;
                 }
                 nroMagico = pruebaHoriz;
             }
             //verificar si se dan las diagonales
             int pruebadiago1 = 0;
             int pruebadiago2 = 0;
             for (int i = 0; i < dimension ; i++) {
                 pruebadiago1 += datos[i][i];
                 pruebadiago2 += datos[i][dimension - 1 -i];
             }
             if(!(pruebadiago1 == nroMagico)||!(pruebadiago2 == nroMagico)){
               return false;
             }
         
     return true;
     }
     
     public static boolean esEsoterico(int[][]datos){
             //Verificando esoterico
             int dimension = datos.length;
             int nroMagico = 0;
             for (int datosPrimerlinea : datos[0] ) {
              nroMagico += datosPrimerlinea;
             }
             int NroEsoterico = (4 * nroMagico)/ dimension;
             //cuatro esquinas
             int esquinas = datos[0][0] + datos[0][dimension-1] + 
                     datos[dimension-1][0] + datos[dimension-1][dimension-1];
             if (!(esquinas == NroEsoterico))
               return false;
               
             //todos los numeros. para no tener que ordenarlos todos
             //basta con sumarlos
             long totalNumeros = 0;
             for (int i = 1; i <=(dimension*dimension); i++) {
                     totalNumeros += i;
                 }
             long todosNumeros = nroMagico * dimension;
             if(!(todosNumeros== totalNumeros)){
               return false;
             }//fin if totalNumeros
             
             //Impar
             if(1==(dimension % 2)){
              //centro
              int esotericCentro = (datos[dimension/2][dimension/2])* 4;
              if(!( esotericCentro == NroEsoterico)){
                  return false;
              }
              //centroLado
              int esotericCentroLado = (
                      datos[0][dimension/2]+
                      datos[dimension/2][0]+
                      datos[dimension/2][dimension-1]+
                      datos[dimension-1][dimension/2]);
              if(!( esotericCentroLado == NroEsoterico)){
                  return false;
              }//fin de verificacion impar
             }else{
             //par
                //centro
              int esotericCentro = (datos[dimension/2+1][dimension/2])+
                      datos[dimension/2][dimension/2] +
                      datos[dimension/2][dimension/2+1] + 
                      datos[dimension/2+1][dimension/2+1];
              if(!( esotericCentro == NroEsoterico)){
                  return false;
              }
              //centroLado
              int esotericCentroLado =   datos[0][dimension/2];
                    esotericCentroLado +=   datos[0][dimension/2-1];
                    esotericCentroLado +=   datos[dimension-1][dimension/2];
                    esotericCentroLado +=   datos[dimension-1][dimension/2-1];
                    
                    esotericCentroLado +=   datos[dimension/2][0];
                    esotericCentroLado +=   datos[dimension/2-1][0];
                    esotericCentroLado +=   datos[dimension/2][dimension-1];
                    esotericCentroLado +=   datos[dimension/2-1][dimension-1];
                      
              if(!( esotericCentroLado == NroEsoterico * 2)){
                  return false;
              }//fin de verificacion par
                 
                 
             }
                   
             
             return true;
             }//fin de las verificaciones de ESOTERIC
}
