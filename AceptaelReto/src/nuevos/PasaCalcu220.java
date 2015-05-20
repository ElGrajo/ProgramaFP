/*
¡Pasa la calculadora! es un juego para dos personas en el que se empieza con
una calculadora recién encendida (mostrando el número 0) y cada jugador, de 
manera alterna, suma un número nuevo, de un sólo dígito, al valor acumulado 
hasta el momento. El jugador que, tras sumar su número, llega a un resultado 
mayor o igual a 31 pierde.

Para ponerle un poco más de interés, en cada turno un jugador sólo puede 
utilizar los números situados en la misma fila o columna que el dígito marcado
por su oponente en el turno anterior, aunque no se puede repetir el número. 
Además, el número 0 no puede utilizarse nunca.

Por ejemplo, imagina que, durante una partida, un jugador recibe la calculadora
mostrándole el número 28, y el oponente acaba de introducir el número 9. A 
partir de la disposición de los números de la calculadora, sabemos que en su 
turno únicamente podrá jugar los números 3, 6, 7 y 8:

Calculadora con el 1 como último dígito usado
Todas las opciones hacen que el valor sumado llegue a 31 (28 + 3 = 31), 
y por tanto, habrá, irremediablemente, perdido.

Entrada
El programa leerá de su entrada estándar un primer número indicando cuántos 
casos de prueba vendrán a continuación.

Cada caso de prueba, en una línea, estará compuesto de dos números. El primero
indicará el valor visible en la calculadora al recibir el turno (entre 1 y 31). 
El segundo será el último número jugado por el adversario (entre 1 y 9).

Salida
Asumiendo que ambos jugadores utilizan una estrategia óptima (ganadora), 
para cada caso de prueba el programa escribirá "GANA" si el jugador que recibe
el turno ganará, y "PIERDE" en caso contrario.

Entrada de ejemplo
3
28 9
29 2
19 3
Salida de ejemplo
PIERDE
GANA
GANA

*/
package nuevos;

import java.util.Scanner;

public class PasaCalcu220 {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int vueltas = sc.nextInt();
    while(vueltas > 0){
        int elsigui = 0;
        int contador = 0;
        
        sc.nextLine();
        int total = sc.nextInt();
        int ultimo = sc.nextInt();
        do{
        elsigui = siguienteNum(total, ultimo);
        if(elsigui>-1){
        total = total + elsigui;
        ultimo = elsigui;
        contador++;
        }
        }while(elsigui>-1);
        System.out.println(elsigui);
    vueltas--;
    }
    }//Fin del main
    /**
     * Selecciona el mayor número posible o -1
     * @param total
     * @param ultimo
     * @return el siguiente o -1 si no puede elegir ninguno
     */
    public static int siguienteNum(int total, int ultimo){
        int respuesta = -1;
        //Superarray con los posibles valores
        int[][] teclas= {
            {0,0,0,0}, //la tecla 0
            {2,3,4,7}, //la tecla 1
            {1,3,5,8}, //la telca 2
            {1,2,6,9}, //la telca 3
            {1,5,6,7}, //4
            {2,4,6,8},//5
            {3,4,5,9},//6
            {1,4,8,9},//7
            {2,5,7,9},//8
            {3,6,7,8}//9
        };
        for (int i = 3; (i >= 0)&&(respuesta==-1); i--) {
            if(teclas[ultimo][i]+total<31)
                respuesta = teclas[ultimo][i];
        }
        
        return respuesta;
    }
}
