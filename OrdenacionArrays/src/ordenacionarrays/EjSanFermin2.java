
package ordenacionarrays;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class EjSanFermin2 {
    public static void main(String args[]) throws IOException{
        String archivo = "C:\\Users\\DAM1\\Documents\\FP\\6. Programacion\\"
                + "NetBeansProjects\\OrdenacionArrays\\src\\ordenacionarrays\\"
                + "EjSanFermin.txt\\" ;
        Scanner entrada = new Scanner(new File(archivo));
        int maximo = 0;
        while(entrada.hasNext()){
            int cantidadDias = entrada.nextInt();
            for (int i = 0; i < cantidadDias; i++) {
                System.out.print(" " + entrada.nextInt());
            }
            System.out.println("");
        }
        entrada.close();
    }
}
