package ordenacionarrays;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class EjSanFermin {
    public static void main(String[] args)  {
             
        Scanner sc = new Scanner(System.in);
        String datos = sc.nextLine();
        System.out.println(queToroEs(datos));
    }
    /*
    //Version con String
     public static int queToro(String datos){
     String[] MisDatos = datos.split(" ");
     int mayor = 0;
     for (int i = 1; i < MisDatos.length; i++) {
         int esteDato = Integer.parseInt(MisDatos[i]);
             if (esteDato > mayor) {
             mayor = esteDato;
         }
     }
     return mayor;
     }
     */
     public static int queToroEs(String datos){
     int mayor = 0;
     Scanner sc = new Scanner(datos);
     sc.nextInt();
     int estenumero;
         do {             
             estenumero = sc.nextInt();
             if (estenumero > mayor)
                 mayor = estenumero;
         } while (sc.hasNext());
     
     return mayor;
     }

}

