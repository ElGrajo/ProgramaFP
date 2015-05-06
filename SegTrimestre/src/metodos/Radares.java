
package metodos;  
import java.util.Scanner;

/**
 *
 * @author Julian Gawron
 */

/*
Radares de tramo
La Dirección Particular de Tráfico (DPT) está empeñada en hacer que los 
conductores respeten los límites de velocidad. Sin entrar en si es por razones 
de seguridad, por ahorrar combustible, o con un mero afán recaudatorio, ahora 
sabemos que además de los radares fijos tradicionales, están poniendo en 
funcionamiento los radares de tramo.
Desde un punto de vista formal, estos radares se basan en el teorema de Lagrange
(también llamado de valor medio o de Bonnet-Lagrange), y viene a decir algo 
así como que, en algún punto de un intervalo cerrado, una función contínua 
y derivable en ese intervalo tendrá derivada instantánea igual a la derivada
media en el intervalo.
Aunque asuste a primera vista, la repercusión es sencilla: si hacemos un viaje 
desde Madrid a Zaragoza y nuestra velocidad media es de 111Km/h, forzosamente 
en algún punto del camino, nuestra velocidad ha sido de 111Km/h.
Los radares de tramo consisten en colocar dos cámaras en dos puntos alejados de
una carretera para poder comprobar cuánto tiempo ha tardado el coche en 
recorrer ese tramo. Si la velocidad media supera la velocidad máxima permitida,
gracias al teorema anterior podremos saber (aunque no le hayamos visto) que en 
algún punto del trayecto ha superado esa velocidad. Por ejemplo, si colocamos 
las cámaras separadas 10Km en un tramo cuya velocidad está limitada a 110Km/h,
y un coche tarda 5 minutos en ser visto por la segunda cámara, sabremos que su 
velocidad media ha sido de 120Km/h, y por tanto en algún sitio ha superado el 
límite de velocidad aunque al pasar por debajo de las dos cámaras el coche 
fuera a 80Km/h.

Entrada
La entrada estará formada por un número indeterminado de casos de prueba. 
Cada caso de prueba consistirá en tres numeros: el primero será la distancia 
(en metros) que separan las dos cámaras, el segundo
indicará la velocidad máxima permitida en todo ese tramo (en Km/h) y el 
tercer y último número indicará el número de segundos que ha tardado un coche 
en recorrer el tramo. Todos esos números serán enteros.
La entrada terminará cuando todos los números sean cero.

Salida
Para cada caso de prueba, el programa generará una línea, indicando si el 
coche debe ser multado o no.
En concreto, indicar´a “OK” si el coche no superó la velocidad máxima, 
indicará “MULTA” si se superó esa velocidad en menos de un 20% de la velocidad 
máxima permitida, y “PUNTOS” si la velocidad fue superada en un 20% o más de 
esa velocidad; en ese caso además de la multa se le quitarán puntos del carnet.
El sistema de radar puede fallar y registrar entradas incorrectas (por ejemplo, 
indicando que el tiempo que ha tardado el coche es negativo). En esos casos, 
el sistema mostrará la cadena “ERROR”.

Entrada de ejemplo      Salida de ejemplo
9165 110 300            OK
9165 110 299            MULTA
12000 100 433           OK
12000 100 431           MULTA
12000 100 359           PUNTOS
-1000 -50 -100          ERROR
0 0 0

Fuente
http://curiosoperoinutil.com/2007/04/18/consultorio-cpi-multas-y-teoremas/
*/

public class Radares {
    public static void main(String[] args) {
        // TODO code application logic here
        
        int metros = 0;
        int velPerm = 0;
        int segundos = 0;
        Scanner entrada = new Scanner(System.in);
        
        
        //el do se repite mientras los valores no sean 0.
        do {
            System.out.print("Metros recorridos:");
            metros = entrada.nextInt();
            System.out.print("Velocidad maxima permitida:");
            velPerm = entrada.nextInt();
            System.out.print("Segundos empleados:");
            segundos = entrada.nextInt();
            
            if(!((metros == 0)&&(velPerm==0)&&(segundos==0))){
                System.out.println(prueba(metros, velPerm, segundos));
            }
        }while (!((metros == 0)&&(velPerm==0)&&(segundos==0)));
        
        System.out.println("Funciona");
        //fin
    }
    
    
    
    public static String prueba(int metro, int velPer, int segundo){

    //Si algún valor es menor que 0
    if( metro < 0 || velPer < 0 || segundo < 0){
        return "ERROR";
    }//
    
    //
    double misMetros = metro;
    double misSegundos = segundo;
    
    double Kilometros = misMetros / 1000;
    double horas = misSegundos / 3600;
    double velocidadActual = Kilometros / horas;
    
    if(velocidadActual <= velPer){
        return "OK";
    }else{
        if (velocidadActual > (velPer * 1.2)) {
            return "Puntos"; 
        }else{
            return "Multa";
        }//fin if velocidad actual > velocidad permitida + 20%
    }//fin if 
   
    }//fin metodo prueba
}//Fin de clase Radares


