/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package programejos;

import java.util.Scanner;

/**
 *
 * @author Julian
 */
public class manhattan {
     public static void main(String[] args) {
         
        Scanner sc = new Scanner(System.in);
    	int i, j, distancia, hipoCuadr, ladoa, ladob, resultado, rta;
	distancia = sc.nextInt();
	hipoCuadr = distancia * distancia;
	for (i = 1; i < distancia-1; ++i) {
		for (j = 1; j < distancia-1; ++j) {
			resultado = (i * i) + (j * j);
                        System.out.printf("resultado=%d i=%d j=%d\n", resultado, i, j);
			if(resultado == hipoCuadr){
			 ladoa=i;
			 ladob=j;
			 rta = ladoa+ladob;
			 System.out.printf("%d", rta);
			 break;
			}
		}
	}
     }
}

