/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
         int numero = 1;
         do{
             numero = sc.nextInt();
             int NroMagico = 0;
             int NroEsoterico = 0;
             boolean magic = true;
             boolean esoteric = true;
             
             //Toma de datos
             int tabla[][] = new int[numero][numero];
             for (int i = 0; i < tabla.length ; i++) {
                 for (int j = 0; j < tabla[i].length ; j++) {
                     tabla[i][j] = sc.nextInt();
                 }
                 NroMagico = NroMagico + tabla[i][0];
             }
             System.out.println(NroMagico);
             // Verificar Si es mágico horizontal y vertical
             for (int i = 0; i < numero; i++) {
                 int pruebaHoriz = 0;
                 int pruebaVerti = 0;
                 
                 for (int j = 0; j < numero; j++) {
                     pruebaHoriz += tabla[i][j];
                     pruebaVerti += tabla[j][i];
                 }
                 if(!(pruebaHoriz == NroMagico)||!(pruebaVerti == NroMagico)){
                     magic = false;
                     break;
                 }
             }
             //verificar si se dan las diagonales
             int pruebadiago1 = 0;
             int pruebadiago2 = 0;
             for (int i = 0; i < numero ; i++) {
                 pruebadiago1 += tabla[i][i];
                 pruebadiago2 += tabla[i][numero - 1 -i];
             }
             if(!(pruebadiago1 == NroMagico)||!(pruebadiago2 == NroMagico)){
               magic = false;
             }
             
             //Verificando esoterico
             if(magic == true){
             NroEsoterico = (4 * NroMagico)/ numero;
             //cuatro esquinas
             int esquinas = tabla[0][0] + tabla[0][numero-1] + 
                     tabla[numero-1][0] + tabla[numero-1][numero-1];
             if (!(esquinas == NroEsoterico)){
                 esoteric = false;
                 break;}
             //todos los numeros. para no tener que ordenarlos todos
             //basta con sumarlos
             int totalNumeros = 0;
             for (int i = 1; i <=(numero*numero); i++) {
                     totalNumeros += i;
                 }
             if(!((NroMagico * numero)== totalNumeros)){
               esoteric = false;
               break;
             }//fin if totalNumeros
             
             //Impar
             if(1==(numero % 2)){
              //centro
              int esotericCentro = (tabla[numero/2][numero/2])* 4;
              if(!( esotericCentro == NroEsoterico)){
                  esoteric = false;
                  break;
              }
                 
                 
                 
             }//fin de verificacion impar
             
             
             //par
             
             }//fin de las verificaciones de ESOTERIC
             System.out.println(esoteric);
         }while(numero>0);
     }    
}
