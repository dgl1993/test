/* Escribe un algoritmo que pida al usuario dos números enteros y muestre por pantalla si el primer número
es múltiplo del segundo número.*/
package ejerciciosiniciales_dos;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int numero_uno = 0, numero_dos = 0;

		System.out.println("Introduzca el primer numero ");
		numero_uno = teclado.nextInt();

		System.out.println("Introduzca el segundo numero ");
		numero_dos = teclado.nextInt();

		if (numero_uno % numero_dos == 0) {

			System.out.println("El numero " + numero_uno + " es multiplo del numero " + numero_dos);

		} else {

			System.out.println("El numero " + numero_uno + " no es multiplo del numero " + numero_dos);
		}

		teclado.close();

	}

}
