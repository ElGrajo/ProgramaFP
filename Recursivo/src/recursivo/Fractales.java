/*
 * resolviendo el problema 168
*/
package recursivo;

import java.util.Scanner;

/**
 *
 * @author DAM1
 */
public class Fractales {
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      while(sc.hasNext()){
          long dato = sc.nextLong();
          System.out.println(fractales(dato));
      }
  }  
  
  public static long fractales(long n){
      if(n == 1)
          return 4;
      else{
          return n * 4 + fractales((long)(n/2))*4;
     } 
  }
}