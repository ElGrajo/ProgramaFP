/*
 * https://www.aceptaelreto.com/problem/statement.php?id=129&cat=57
 */
package programejos;

/**
 *
 * @author Julian
 */
public class marcadores {
    public static void main(String args[]){
        System.out.println(compara(1,2));
        System.out.println(compara(8,9));
        System.out.println(compara(1,9));
    
    }
    //Recibe lo
    public static int compara(int numero1, int numero2){
        //Luces que se encienden con cada número.
    char [][] luces = {
       {'a','b','c','d','e','f',' '}, //el 0
       {' ',' ','c','d',' ',' ',' '}, // el 1
       {' ','b','c',' ','e','f','g'}, //el 2
       {' ','b','c','d','e','f',' '}, //el 3
       {'a',' ','c','d',' ',' ','g'}, //el 4
       {'a','b',' ','d','e',' ',' '}, //el 5
       {'a','b',' ','d','e','f','g'}, //el 6
       {' ','b','c','d',' ',' ',' '}, //el 7
       {'a','b','c','d','e','f','g'}, //el 8
       {'a','b','c','d','e',' ','g'}, //el 9
       {' ',' ',' ',' ',' ',' ',' '}, //el 10
    };
        int diferentes = 0;
        for (int i = 0; i < 7; i++) {
            if(!(luces[numero1][i] == luces[numero2][i]))
                diferentes++;
        }
    return diferentes;
    }
}
