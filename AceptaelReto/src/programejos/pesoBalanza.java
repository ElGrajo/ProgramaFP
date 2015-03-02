package programejos;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class pesoBalanza {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int pesoIzq = sc.nextInt();
        int distIzq = sc.nextInt();
        int pesoDer = sc.nextInt();
        int distDer = sc.nextInt();
        while(!(pesoIzq == 0 && distIzq == 0 && pesoDer == 0 && distDer == 0 )){
            if(verificar(pesoIzq, distIzq, pesoDer, distDer) > 0)
                System.out.println("SI");
            else
                System.out.println("NO");
        
        //Pedir datos para otra vuelta
        pesoIzq = sc.nextInt();
        distIzq = sc.nextInt();
        pesoDer = sc.nextInt();
        distDer = sc.nextInt();    
        }
        
        
    }
    
    public static int verificar(int pesoIzq, int distIzq, int pesoDer, int distDer){
        Scanner sc = new Scanner(System.in);
        //Si ningun peso es 0, es el caso base.
        if(pesoIzq != 0 && pesoDer != 0){
            if(pesoDer * distDer == pesoIzq * distIzq)
                return pesoDer + pesoIzq;
            else
                return -1;
        }
        
        //Las otras opciones pueden ser:
        //pesoIzq 0 y pesoDer 0
        //pesoizq 0 
        //pesoder 0
        else{
            if(pesoIzq == 0){
            int pesoIzq1 = sc.nextInt();
            int distIzq1 = sc.nextInt();
            int pesoDer1 = sc.nextInt();
            int distDer1 = sc.nextInt();
            pesoIzq = verificar(pesoIzq1, distIzq1, pesoDer1, distDer1);
            }
            if(pesoDer == 0){
            int pesoIzq1 = sc.nextInt();
            int distIzq1 = sc.nextInt();
            int pesoDer1 = sc.nextInt();
            int distDer1 = sc.nextInt();
            pesoDer = verificar(pesoIzq1, distIzq1, pesoDer1, distDer1);
            }
            if(pesoDer * distDer == pesoIzq * distIzq)
                return pesoDer + pesoIzq;
            else
                return -1;
        
            }
    }
}
