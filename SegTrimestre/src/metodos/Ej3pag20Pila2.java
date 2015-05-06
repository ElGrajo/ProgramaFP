/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author DAM1
 */
public class Ej3pag20Pila2 {
   public static void main(String[] args) {
       int i = 0;
       while (i <= 4) {
           methodl(i);
           i++;
       }
       System.out.println("i is " + i);
   }// fin del void
   
   public static void methodl(int i) {
       do {
           if (i % 3 != 0)
               System.out.print(i + " ");
           i--;
       }while (i >= 1);
       System.out.println();
   }
}

