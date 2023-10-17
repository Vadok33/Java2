package ejemplos.bucles2;
import java.util.Scanner;

public class AlgunImpar2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner teclado = new Scanner (System.in);
		int numIntroducido;
		boolean esImpar = false;
		int i = 0;
		
		while ((i<10)&&(!esImpar)) {
			System.out.println("Introduce un número");
			numIntroducido = teclado.nextInt();
			if (numIntroducido%2!=0)
				esImpar = true;
			
			i = i+1;
			
		}
		if (esImpar)
			System.out.println("Has metido un número impar");
		else
			System.out.println("No has metido ningun número impar");
	}

}
