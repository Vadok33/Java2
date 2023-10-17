package ejemplos.bucles2;
import java.util.Scanner;

public class AlgunImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner (System.in);
		int numIntroducido;
		boolean esImpar = false;
		
		for (int i=0; i<10; i++) {
			System.out.println("Introduce un número");
			numIntroducido = teclado.nextInt();
			if (numIntroducido%2!=0)
				esImpar = true;
				
		}
		if (esImpar)
			System.out.println("Has metido un número impar");
		else
			System.out.println("No has metido ningun número impar");

	}

}
