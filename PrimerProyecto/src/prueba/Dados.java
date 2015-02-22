/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prueba;

/**
 *
 * @author Julian
 */

import java.util.Random;

public class Dados {
    // crea un generador de numeros aleatoriospara usarlo en el metodo tirarDado
    private Random numeroAleatorios = new Random();
    
    // enumeracion de constantes de estado de juego
    private enum Estado { CONTINUA, GANO, PERDIO};
    
    // constantes que representan tiros comunes del dado
    private final static int DOS_UNOS = 2;
    private final static int TRES = 3;
    private final static int SIETE = 7;
    private final static int ONCE = 11;
    private final static int DOCE = 12;
    
    // ejecuta el juego
    public void jugar(){
        int miPunto = 0; // punto si no gana nada
        Estado estadoJuego; // puede contener tres estados
        
        int sumaDeDados = tirarDados(); // primer tiro de dados
        
        // determina el estado del juego y el punto con base en el primer tiro
        switch ( sumaDeDados){
            case SIETE: // gana en el primer tiro
            case ONCE:
                estadoJuego = Estado.GANO;
            break;
            
            case DOS_UNOS: // los casos en los que pierde
            case TRES: 
            case DOCE: 
                estadoJuego = Estado.PERDIO;
            break;
                
            default: // no gano ni perdio, entonces continua
                estadoJuego = Estado.CONTINUA;
                miPunto = sumaDeDados; // guarda el punto
                System.out.printf("El punto es %d\n", miPunto);
             break;
        }// final de switch 
             // mientras el juego no esta terminado
                while(estadoJuego == Estado.CONTINUA) // no gano ni perdio
                {
                    sumaDeDados = tirarDados();
                    
                    //determina el estado del juego
                    if (sumaDeDados == miPunto)
                        estadoJuego = Estado.GANO;
                    else
                        if (sumaDeDados == SIETE)
                        estadoJuego = Estado.PERDIO;  
                 }// fin del while
            
            // muestra el mensaje que gano o perdio
            if (estadoJuego == Estado.GANO)
                System.out.println("El jugador Gano");
            else 
                System.out.println("El jugador pierde");
                     
        }// final de jugar
    public int tirarDados(){
       // elije los valores aleatorios de los dados
        int dado1 = 1 + numeroAleatorios.nextInt(6);
        int dado2 = 1 + numeroAleatorios.nextInt(6);
        
        int suma = dado1 + dado2;
        // muestra los resultados de este tiro
        System.out.printf("El jugador tiro %d + %d = %d\n", 
                dado1, dado2, suma);
        return suma;
    }// fin de TirarDados
}// fin de clase dados, juego Crabs