/* Escriba un algoritmo que pida al usuario dos números enteros positivos y muestre la potencia del número más grande
de ambos elevado al número más pequeño. Para este ejercicio no se puede usar la operación de potencia ( el gorrito
^ ). (Haz una traza con los números 4 y 7) */

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
