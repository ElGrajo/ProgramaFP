package AceptaRetoClase;

/*
 Con el auge de las urbanizaciones con piscina privada y pistas de paddle, 
la afluencia de bañistas a las piscinas públicas ha disminuido considerablemente 
en los últimos años.
Por esta razón, estas instalaciones se están esforzando para volver a atraer a 
esos usuarios que hoy por hoy parecen preferir una pequeña piscina compartida 
por un montón de vecinos en vez de grandes piscinas en las que poder disfrutar 
todo el día.

Para ello están utilizando los llamados abonos de temporada. Cualquier usuario 
que adquiera uno de estos abonos, tiene derecho a entrar y salir de las 
instalaciones siempre que quiera. Eso incluye, incluso, poder ir a la piscina 
por la mañana un rato, volver a casa, y regresar por la tarde a darse el último 
chapuzón, lo que permite a los usuarios mantener el mismo patrón de uso que ahora
hacen en las piscinas de sus urbanizaciones.

Eso sí, para evitar morir de éxito y que la piscina termine plagada de bañistas 
quejándose por la falta de espacio, han decidido añadir una clausula que dice 
"el uso del abono está limitado a 15 días dentro de cualquier periodo de 20 
días consecutivos". Es decir que al ir a entrar a la piscina comprueban antes 
tu registro de los últimos 20 días y si ya has ido 15, no te dejan pasar.

Como propietario de una casa sin piscina privada, te estás planteando comprar 
el abono de una de las piscinas que tienes cerca de casa. Ahora te toca 
determinar, para cada una de las ofertas, cuántos días podrías ir a esa 
piscina si te compras el abono justo antes de que comience la temporada.

Entrada
Cada caso de prueba contiene la información de una oferta constituida por tres 
enteros: el número de días que tiene la temporada (T), la longitud del periodo 
(P) y el número máximo de días de uso durante ese periodo (D). 
Se garantiza que 1 ≤ D ≤ P ≤ T.

Los casos de prueba terminan con una línea con los tres ceros, que no debe
procesarse.

Salida
Para cada caso de prueba se mostrará una única línea con el número de 
días como máximo que se podrá ir a la piscina en toda la temporada.

Entrada de ejemplo
30 20 15
25 20 15
0 0 0
Salida de ejemplo
25
20
 */
import java.util.Scanner;
public class Reto213TicketTempo {

    public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
    int diasTemporada = sc.nextInt();    
    int longPeriodo = sc.nextInt();
    int maxDiasXPeriodo = sc.nextInt();
    while(!((maxDiasXPeriodo == 0)&&(longPeriodo==0)&&(diasTemporada==0))){
    //Se garantiza que 1 ≤ maxDiasXPeriodo ≤ longPeriodo ≤ diasTemporada.      
        int diasEnPeriodo = ((int)(diasTemporada / longPeriodo))* maxDiasXPeriodo;
        int diasDespDeUltPeriod = diasTemporada % longPeriodo;
        
        System.out.println(diasEnPeriodo + diasDespDeUltPeriod);
//vuelve a leer los datos
        diasTemporada = sc.nextInt();    
        longPeriodo = sc.nextInt();
        maxDiasXPeriodo = sc.nextInt();    
    }
    }
}
