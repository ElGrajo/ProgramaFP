package ordenacionarrays;

import java.util.Scanner;
import sun.java2d.loops.CompositeType;

/**

** Entrada
El programa recibira una lista de semanas a evaluar. Cada semana constara de un
valor para cada da. El numero de semanas es indeterminado. El programa 
terminara de ejecutarse cuando para el primer da de la semana se indique una 
venta de -1.

** Salida
* Para cada caso de prueba, el programa escribira una lnea conteniendo dos d
* as de la semana (MARTES,
MIERCOLES, JUEVES, VIERNES, SABADO o DOMINGO). El primero indicara el da de mas ventas y el segundo
el de menos. Despues se indicara un SI si el domingo se realizaron mas ventas que la media semanal, y
NO en caso contrario. Las tres palabras se separaran entre ellas por un espacio.
Si hay empate en alguno de los valores de ventas mnimo y maximo, se especicara EMPATE.

* Entrada de ejemplo
185.50
250.36
163.45
535.20
950.22
450.38
-1

* Salida de ejemplo
SABADO JUEVES SI
 */
public class EjBar {
  public static void main(String args[]){
      Scanner sc = new Scanner(System.in);
      double ganancia = 0;
      double ganancias[] = new double[6];
      
      ganancias[0] = 185.50;
      ganancias[1] = 250.36;
      ganancias[2] = 163.45;
      ganancias[3] = 535.20;
      ganancias[4] = 950.22;
      ganancias[5] = 450.38;
      
      System.out.println(estadistica(ganancias));
      
      ganancias[0] = 163.45;
      ganancias[1] = 250.36;
      ganancias[2] = 163.45;
      ganancias[3] = 535.20;
      ganancias[4] = 950.22;
      ganancias[5] = 150.38;
      
      System.out.println(estadistica(ganancias));
  }
  
  public static String estadistica(double cuentasAcumul[]){
      String[] dias = {"MARTES",
          "MIERCOLES", "JUEVES", "VIERNES", "SABADO", "DOMINGO", "EMPATE"};
      
      double valorMaximo = 0;
      int posicionMaximo = 0;
      double valorMinimo = 0;
      int posicionMinimo = 0;
      
      double total = 0;
      double promedio = 0;
      
      boolean empateMax = false;
      boolean empateMin = false;
      
      String respuesta = "";
      
      //Busca el dato máximo
      for (int i = 0; i < 6; i++) {
          if (valorMaximo < cuentasAcumul[i]){
              valorMaximo = cuentasAcumul[i];
              posicionMaximo = i;
              empateMax=false;
          }else if(valorMaximo == cuentasAcumul[i]){
              empateMax=true;
          }
          
          //Suma que será util para el promedio
          total += cuentasAcumul[i];
      }
      
      valorMinimo = valorMaximo; //Así se asegura no dejar ningún valor fuera
      for (int i = 0; i < 6; i++) {
          if (valorMinimo > cuentasAcumul[i]){
              valorMinimo = cuentasAcumul[i];
              posicionMinimo = i;
              empateMin=false;
          }else if(valorMinimo == cuentasAcumul[i]){
              empateMin=true;
          }
      }
      
      //Concatenando respuestas
      if(empateMax == true){
          respuesta += dias[6];
      }else {
          respuesta += dias[posicionMaximo];
      }
      
      if(empateMin == true){
          respuesta = respuesta + " " +dias[6];
      }else {
          respuesta = respuesta + " " + dias[posicionMinimo];
      }
      
      promedio = total / 6;
      if(promedio > cuentasAcumul[5]){
          respuesta += " NO";
      }else{
          respuesta += " SI";
      }
      
      
      
  return respuesta;
  }
}
