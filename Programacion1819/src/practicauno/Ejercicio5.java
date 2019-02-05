/*Escribe un algoritmo que pida al usuario un número entre 1 y 99 y muestre por pantalla si el dígito de las decenas es
mayor que el dígito de las unidades, si el dígito de las unidades es mayor que el dígito de las decenas, o si ambos
dígitos son iguales. Por ejemplo, si el número que escribe el usuario es 56, el algoritmo debe mostrar por pantalla “el
dígito de las unidades (6) es mayor que el dígito de las decenas (5)”. (Haz una traza con el número 77, otra con el
número 41 y otra traza con el número 6) */

package practicauno;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 0, unidades = 0, decenas = 0;

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca un numero ");
		numero = teclado.nextInt();

		if (numero >= 1 && numero <= 99) {

			decenas = numero / 10;
			unidades = numero % 10;

		}

		if (decenas > unidades) {

			System.out.println("El numero " + decenas + " que ocupa la posicion de las decenas es mayor que el numero "
					+ unidades + " que ocupa la posicion de las unidades");

		} else if (unidades > decenas) {

			System.out
					.println("El numero " + unidades + " que ocupa la posicion de las unidades es mayor que el numero "
							+ decenas + " que ocupa la posicion de las decenas");

		} else {

			System.out.println("Las unidades " + unidades + " y las decenas " + decenas + " son iguales");
		}

		teclado.close();

	}

}
