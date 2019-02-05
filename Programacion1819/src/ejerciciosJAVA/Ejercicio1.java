/*1. Diseña un algoritmo y su correspondiente código en java que dados dos números, diga si ambos números
son primos gemelos o no. Dos números son primos gemelos si son primos y solo existe un número entre ellos. El
usuario introducirá siempre primero el menor número y luego el mayor.*/

package ejerciciosJAVA;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int numero = 0, numero_dos = 0, i = 2, j = 2;

		boolean primo_uno = true, primo_dos = true;

		System.out.println("Introduzca el primer numero ");
		numero = teclado.nextInt();

		System.out.println("Introduzca el segundo numero ");
		numero_dos = teclado.nextInt();

		if (numero_dos - numero == 2) {

			while (i < numero && primo_uno) {

				if (numero % i == 0) {

					primo_uno = false;

				} else {

					i++;
				}
			}

			while (j < numero_dos && primo_dos) {

				if (numero_dos % j == 0) {

					primo_dos = false;

				} else {

					j++;
				}
			}

		} else {

			System.out.println("Los numeros introducidos no son primos gemelos  ");
		}

		if (primo_uno && primo_dos && numero_dos - numero == 2) {

			// COMPROBAR SI HAY UN NUMERO DE POR MEDIO AL PRINCIPIO//

			System.out.println("Los numeros " + numero + " y " + numero_dos + " son primos gemelos ");

			teclado.close();

		} 
	}
}
