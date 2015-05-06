package programame;

import static java.lang.Math.abs;
import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class Dalton {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	int figuras;
	boolean sonDalton = true;
	
	figuras = sc.nextInt();
        while(figuras>0){
            /*
		double alturas[] = new double[figuras];
		int i;
		for (i = 0; i < figuras; ++i) {
			alturas[i] = sc.nextDouble();
		}
		double diferencia = Math.abs(alturas[0] - alturas[1]);
                if(diferencia==0){
                sonDalton = false;
                }
		for (i = 0; i < figuras - 1; ++i) {
			if( abs(alturas[i]-alturas[i+1]) != diferencia){
				sonDalton = false;
				break;
			}
		}
                    */
            sonDalton = true;
            double primero = sc.nextDouble();
            double segundo = sc.nextDouble();
            double diferencia = primero - segundo;
            if(diferencia == 0)
                sonDalton = false;
            for (int i = 0; i < figuras-2; i++) {
              primero = segundo;
              segundo = sc.nextDouble();
              if((primero-segundo) != diferencia)
                  sonDalton = false;
            }
	if(sonDalton) System.out.println("DALTON");
        else System.out.println("DESCONOCIDOS");
	figuras = sc.nextInt();
	}	
    }
}