/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Julian
 */
public class Condicionales {
    public static void main(String[] args) {
        int puntuacion = 4 ;
    if (puntuacion != 5){
    System.out.println("No es cinco");} 
    else { 
      System.out.println("Es cinco");
      }
   
    // uso de switch
    switch(puntuacion){
        case 5:
            System.out.println("es un cinco");
            break;
        case 4:
            System.out.println("es un cuatro");
            break;
        default:
                System.out.println("No es ni cuatro ni cinco");
    }//final de switch
    
    
     }
}
