/* Escribe un algoritmo que pida al usuario un número entero positivo. El algoritmo sumará todos los números desde 0
hasta dicho número incluido que sean múltiplos de 2 o sean múltiplos de 5, pero no aquellos números que sean
múltiplos de 2 y 5 a la vez. (Haz una traza con el número 22).*/

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
