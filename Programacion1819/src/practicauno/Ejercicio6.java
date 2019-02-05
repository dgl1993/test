/*Escribe un algoritmo que pida al usuario un número de cuatro cifras e imprima por pantalla si el número es capicúo o
no. (Haz una traza con el número 5465 y otra con el número 3223) */

package practicauno;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int numero = 0, resto_numero = 0, unidad_mil = 0, centenas = 0, decenas = 0, unidades = 0;

		System.out.println("Introduce un numero ");
		numero = teclado.nextInt();

		if (numero > 999 && numero <= 9999) {

			unidad_mil = numero / 1000;
			resto_numero = numero % 1000;

			centenas = resto_numero / 100;
			resto_numero = resto_numero % 100;

			decenas = resto_numero / 10;
			unidades = resto_numero % 10;

			if (unidad_mil == unidades && centenas == decenas) {

				System.out.println("El numero " + numero + " es capicua");
				
			} else {

				System.out.println("El numero " + numero + " no es capicua");

			}

		} else {

			System.out.println("El numero ha de tener cuatro cifras, introduce un numero ");
			numero = teclado.nextInt();

		}

		teclado.close();
	}

}
