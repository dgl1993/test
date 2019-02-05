/*Escribe un algoritmo que pida al usuario 10 números enteros (pueden ser positivos, negativos o cero). 
 * Cuando acabe de insertar los números, el algoritmo debe mostrar la suma de los números positivos, 
 * la media de los números negativos y el número de ceros que ha introducido el usuario. */

package ejerciciosiniciales_tres;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int i = 0, numero = 0, negativos = 0, positivos = 0, ceros = 0;

		while (i < 10) {

			System.out.println("Introduzca un numero ");
			numero = teclado.nextInt();

			if (numero < 0) {

				negativos = negativos + numero;
			}

			if (numero > 0) {

				positivos = positivos + numero;

			}

			if (numero == 0) {

				ceros++;
			}

			i++;
		}

		System.out.println("La suma de los positivos es: " + positivos);
		System.out.println("La media de los negativos es: " + negativos / +i);
		System.out.println("Y la cantidad de ceros introducidos es " + ceros);
		teclado.close();

	}

}
