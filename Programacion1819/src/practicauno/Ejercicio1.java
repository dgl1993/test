/* Escribe un algoritmo que pida al usuario un car�cter y muestre por pantalla si el car�cter introducido es una vocal
min�scula, una vocal may�scula o una consonante (may�scula o min�scula). Suponemos que el car�cter que escribir�
el usuario es una letra. */
package practicauno;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		char letra = ' ';

		System.out.println("Introduzca una letra: ");
		letra = teclado.next().charAt(0);

		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {

			System.out.println("La letra " + letra + " es vocal y minuscula ");

		} else if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {

			System.out.println("La letra " + letra + " es vocal y mayuscula ");

		} else {

			System.out.println("La letra " + letra + " es una consonante");
		}

		teclado.close();

	}

}
