/*Escribe un algoritmo que vaya pidiendo n�meros al usuario 
 * y vaya mostrando por pantalla si el n�mero introducido es par o
 *  impar (indistintamente que sea positivo o negativo). 
 *  El algoritmo terminar� cuando el usuario introduzca el n�mero cero.
 */

package ejerciciosiniciales_tres;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int numero = 0;

		System.out.println("Introdzca un numero ");
		numero = teclado.nextInt();

		while (numero != 0) {

			if (numero % 2 == 0) {

				System.out.println("El numero " + numero + " es par");

			} else {

				System.out.println("El numero " + numero + " es impar");

			}

			System.out.println("Introduzca un numero ");
			numero = teclado.nextInt();
		}

		teclado.close();

	}

}
