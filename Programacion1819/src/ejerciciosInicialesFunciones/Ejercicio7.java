package ejerciciosInicialesFunciones;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean esprimo=true;
		

		esprimo = Primo(esprimo);
		
		imprimirPrimo(esprimo);
		
		

	}

	public static boolean Primo(boolean primo) {

		Scanner teclado = new Scanner(System.in);

		int n = 0;
		System.out.println("Introduzca un numero ");
		n=teclado.nextInt();
		teclado.close();
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {

				primo = false;

			}

		}
		return primo;
	}
	
	public static void imprimirPrimo(boolean i) {
		
		if(i) {
		
		System.out.println("El booleano devuelve verdadero ");
		
		} else {
			
			System.out.println("El booleano devuelve falso ");
		}
	}
	


}
