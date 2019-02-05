/*Escribe un algoritmo que pida al usuario dos números enteros y muestre por pantalla qué número es
mayor que el otro. En caso que sean iguales, mostrará por pantalla un mensaje diciendo que ambos
números son iguales.*/
package ejerciciosiniciales_dos;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int numero_uno = 0, numero_dos = 0;

		System.out.println("Introduzca el primer numero ");
		numero_uno = teclado.nextInt();

		System.out.println("Introduzca el segundo numero ");
		numero_dos = teclado.nextInt();

		if (numero_uno > numero_dos) {

			System.out.println("el numero " + numero_uno + " es mayor que " + numero_dos);

		} else if (numero_dos > numero_uno) {

			System.out.println("El numero " + numero_dos + " es mayor que " + numero_uno);

		} else {

			System.out.println("Los numeros " + numero_uno + " y " + numero_dos + " son iguales ");

		}

		teclado.close();

	}

}
