/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package cap7Arrays;

/**
 *
 * @author Julian
 */
import java.util.Random;

public class PaqueteDeCartas {
    private Carta paquete[]; // arreglo de objetos Carta
    private int cartaActual; // subindice de la siguietente carta a reparteir
    private final int NUMERO_DE_CARTAS = 52;// numero constante de cartas
    private Random numerosAleatorios; // generador de numeros aleatorios
    
    //el constructor llena el paquete de cartas
    public PaqueteDeCartas (){
     String caras[] = {
         "As", "Dos", "Tres","Cuatro","Cinco","Seis","Siete","Ocho",
         "Nueve","Diez","Jota","Dama", "Rey"};
     String palos[] = { "Corazones", "Diamantes", "Treboles", "Espadas"};
     
     paquete = new Carta[NUMERO_DE_CARTAS]; // crea arreglo de objetos carta
     cartaActual = 0; // establece la carta actual
     numerosAleatorios = new Random(); // crea un generador de numero aleatorios
     
     // llena el paquete con objetos carta
     for (int cuenta = 0; cuenta < paquete.length; cuenta++)
         paquete[cuenta] = 
                 new Carta( caras[cuenta% 13], palos[cuenta/13]);
        }// final del constructor
    
    public void barajar(){
        // despues de barajar, la reparticion debe empezar con el paquete 0
        cartaActual = 0; // reinicializa carta actual
        
        // para cada carta, selecciona otra carta aleatoria y las intercambia
        for(int primera = 0; primera < paquete.length; primera++)
        {
            // selecciona un numero aleatorio entre 0 y 51
            int segunda = numerosAleatorios.nextInt( NUMERO_DE_CARTAS );
            
            //intercambia Carta actual con la seleccionada al azar
            Carta temp = paquete[primera];
            paquete[primera] = paquete[segunda];
            paquete[segunda] = temp; 
        }// cierra el for
    }// final del barajar
    
    //reparte una carta
    public Carta repartirCarta()
    {
        // determina si quedan cartas por repartir
        if(cartaActual < paquete.length)
            return paquete[cartaActual++];// devuelve la carta actual
        else
            return null; //devuelve null para indicar que se repartieron todas
    }// final de repartirCarta
}// final de clase
