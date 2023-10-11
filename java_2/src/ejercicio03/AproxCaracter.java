package ejercicio03;

import java.util.Scanner;


public class AproxCaracter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		String cadenaIn;
		
		do {
			System.out.println("Introduce cadena");
			cadenaIn = teclado.nextLine();
			System.out.println("**" +cadenaIn+ "**");
			
		}while(!cadenaIn.equals("exit"));

	}

}
