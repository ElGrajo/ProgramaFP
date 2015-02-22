import java.io.*;

public class Ejemplo6
{
		
	public static void main(String args[])
	{
		byte b=-128;
		short s=32767;
		int i=-2147483648;
		long l=9223372036854775807L;
		
		i=i-1;
		l=l+1;
		
		System.out.println("El valor de b es "+b);
		System.out.println("El valor de s es "+s);
		System.out.println("El valor de i es "+i);
		System.out.println("El valor de l es "+l);

		
	}
}