package recursivo;

import java.util.Scanner;

/**
 *
 * Sea factorial (n) el método que calcula el factorial de un número n. 
 * Si llamamos al método con n=0, inmediatamente devuelve el resultado. 
 * El método conoce cómo resolver el caso más simple (0! = 1), el cual es 
 * conocido como caso base. Si llamamos al método con n>0, el método reduce 
 * el problema a la resolución de un subproblema más simple, (n-1)!. 
 * El subproblema es esencialmente el mismo que el problema original, a 
 * excepción de que es más simple o más "pequeño". Como el subproblema tiene 
 * las mismas propiedades que el problema original, podemos invocar al método 
 * con argumentos diferentes (diferentes en valor, no en número y/o tipo). 
 * A esto se le conoce como llamada recursiva.
 */
public class Recursivo {

    public static void main(String[] args) {
        //System.out.println(factorial1(pedirDatos()));
        metodoX2(123456);
    }
    
    public static int pedirDatos(){
        Scanner entrada = new Scanner(System.in);
                
          System.out.println("Itroduzca un numero mayor que 0:");
       
            return entrada.nextInt();
    }
    public static int factorial(int n){
           System.out.print(n + " * ");
            if(n == 0){//caso base
                return 1;
            }else{
              return n * factorial(n - 1); // caso recursivo
            }
    }
    
    //si no hay un caso de salida, y cada paso no nos acerca, la pila desborda
    public static int factorial1(int n){

              return n * factorial1(n - 1); // caso recursivo
            
    }
    
  public static int metodoX(int n){
      if(n ==1)
          return 1;
      else
          return n + metodoX(n - 1);
  }
  
  //En este caso el método se saca por descarte, porque no hay un else.
  public static void metodoX2(int n){
      if (n>0){
          System.out.println(n%10);
          metodoX2(n/10);
      }
  }
}
