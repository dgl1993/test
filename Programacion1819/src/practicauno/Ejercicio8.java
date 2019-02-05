/* Escribe un algoritmo que pida al usuario un n�mero entero positivo. El algoritmo sumar� todos los n�meros desde 0
hasta dicho n�mero incluido que sean m�ltiplos de 2 o sean m�ltiplos de 5, pero no aquellos n�meros que sean
m�ltiplos de 2 y 5 a la vez. (Haz una traza con el n�mero 22).*/

package practicauno;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int numero = 0, acumulador = 0, i = 0;

		System.out.println("Introduzca un numero ");
		numero = teclado.nextInt();

		while (i <= numero && numero > 0) {

			if ((i % 2 == 0 || i % 5 == 0) && !(i % 2 == 0 && i % 5 == 0)) {

				acumulador = acumulador + i;
			}

			i++;

		}

		System.out.println("El total es " + acumulador);
		teclado.close();

	}

}
