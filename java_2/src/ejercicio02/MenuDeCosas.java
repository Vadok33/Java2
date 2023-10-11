package ejercicio02;

import java.util.Scanner;

public class MenuDeCosas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int numIntroducido;
		int contador = 0;
		
		do {
			System.out.println("Introduce un numero");
			numIntroducido = teclado.nextInt();
			if (numIntroducido%2==0 && numIntroducido > 10 && numIntroducido <30)
				contador = contador +1;
		}while(numIntroducido!=-1);
		
		System.out.println("El resltado es " + contador);
	}

}
