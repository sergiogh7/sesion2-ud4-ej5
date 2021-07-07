/**
 * Version 1.0
 * @author Sergio Galimany Hoyo
 * 
 */
public class S2Ud4Ej5App {

	public static void main(String[] args) {
		
		// Variables.
		int A=0;
		int B=1;
		int C=2;
		int D=3;
		
		// Salida con valores iniciales.
		System.out.println("Valores iniciales:");
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		System.out.println("C = " + C);
		System.out.println("D = " + D + "\n");
		
		// Cambiando valores.
		B=C;
		C=A;
		A=D;
		D=B;
		
		// Salida con valores cambiados.
		System.out.println("Valores cambiados:");
		System.out.println("A = " + A);
		System.out.println("B = " + B);
		System.out.println("C = " + C);
		System.out.println("D = " + D);

	}

}
