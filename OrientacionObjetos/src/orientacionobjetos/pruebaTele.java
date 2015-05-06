/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package orientacionobjetos;

import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class pruebaTele {
    public static void main(String[] args) {
       /* TV miTele = new TV();
        TV miSegTele = new TV();
        
        //Valores por defecto
        System.out.println(miTele.channel);
        System.out.println(miSegTele.channel);
        
        //Lo encendemos y le ponemos nuevos valores
        miTele.turnOn();
        miTele.setChannel(30);
        miTele.setVolumeLevel(3);
        System.out.println(miTele.channel);
        System.out.println(miTele);
        */
        
        //hacer diez teles y ponerlas en el mismo canal y volumen.
        TV [] misTeles = new TV[10]; //espacios pero sin! los objetos.
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 3; i++) {
            
            misTeles[i] = new TV(sc.nextInt(), sc.nextInt(), true);
          
           /*
            misTeles[i].turnOn();
            misTeles[i].setChannel(sc.nextInt());
            misTeles[i].setVolumeLevel(sc.nextInt());
                   */
        }
        for(TV estaTele : misTeles)
            System.out.println(estaTele);
    }
}
