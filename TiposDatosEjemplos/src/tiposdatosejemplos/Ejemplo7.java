package tiposdatosejemplos;

import java.io.*;

public class Ejemplo7
{
		
	public static void main(String args[])
	{
		byte b=-128;
		short s=32767;
		int i=2147483647;
		long l=9223372036854775807L;
		
		b=b-1;
		s=s+1;
		
		System.out.println("El valor de b es "+b);
		System.out.println("El valor de s es "+s);
		System.out.println("El valor de i es "+i);
		System.out.println("El valor de l es "+l);

		
	}
}