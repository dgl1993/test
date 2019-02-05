/*Escribe un algoritmo que pida al usuario tres caracteres  y muestre por pantalla los tres caracteres ordenados de mayor a menor.*/

package ejerciciosiniciales_dos;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		char car1 = ' ', car2 = ' ', car3 = ' ';

		System.out.println("Introduzca los caracteres ");
		car1 = teclado.next().charAt(0);
		car2 = teclado.next().charAt(0);
		car3 = teclado.next().charAt(0);

		if (car1 > car2 && car1 > car3) {

			if (car2 > car3) {

				System.out.println("El orden es: " + car1 + " , " + car2 + " , " + car3);
			} else {

				System.out.println("El orden es: " + car1 + " , " + car3 + " , " + car2);
			}

		}

		if (car2 > car1 && car2 > car3) {

			if (car1 > car3) {

				System.out.println("El orden es " + car2 + " , " + car1 + " , " + car3);

			} else {

				System.out.println("El orden es " + car2 + " , " + car3 + " , " + car1);
			}

		}

		if (car3 > car1 && car3 > car2) {

			if (car2 > car1) {

				System.out.println("El orden es " + car3 + " , " + car2 + " , " + car1);

			} else {

				System.out.println("El orden es " + car3 + " , " + car1 + " , " + car2);
			}
		}

		teclado.close();

	}

}
