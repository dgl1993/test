/* Escriba un algoritmo que pida al usuario dos n�meros enteros positivos y muestre la potencia del n�mero m�s grande
de ambos elevado al n�mero m�s peque�o. Para este ejercicio no se puede usar la operaci�n de potencia ( el gorrito
^ ). (Haz una traza con los n�meros 4 y 7) */

package practicauno;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero_uno = 0, numero_dos = 0, mayor = 0, menor = 0,  i = 0, acumulador = 1;

		System.out.println("Introuzca un numero ");
		numero_uno = teclado.nextInt();

		System.out.println("Introduzca el segundo numero ");
		numero_dos = teclado.nextInt();

		if (numero_uno > numero_dos) {

			mayor = numero_uno;
			menor = numero_dos;

		} else {

			mayor = numero_dos;
			menor = numero_uno;
		}

		while (i < menor) {

			acumulador = acumulador * mayor;
			i++;
		}

		System.out.println("acumulador " + acumulador);
		teclado.close();
	}
}
