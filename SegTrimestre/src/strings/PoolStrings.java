/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strings;

/**
 *
 * @author DAM1
 */
public class PoolStrings {
    public static void main(String[] args){
        String s1 = "Bienvenido a Java";
        String s2 = new String("Bienvenido a Java");
        String s3 = "Bienvenido a Java";
        
        System.out.println("s1==s2 es " + (s1==s2));
        System.out.println("s1==s3 es " + (s1==s3));
        System.out.println("s1 equals s2 es " + (s1.equals(s2)));
        System.out.println("s1 equals s3 es " + (s1.equals(s3)));
    }
}
