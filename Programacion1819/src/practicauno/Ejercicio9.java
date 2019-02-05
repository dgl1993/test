/* Escribe un algoritmo que pregunte al usuario cuantos números quiere introducir. Luego pida al usuario esos números
y una vez pedidos todos muestre por pantalla el número menor que ha introducido el usuario. (Haz una traza en la que
el usuario indica que quiere introducir 8 números y luego introduce los números 4,7,3,4,3,6,2,7)
*/

package practicauno;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int cantidad = 0, i = 1, numero = 0, menor = 9999;

		System.out.println("Introduzca la cantidad de numeros que quiere introducir ");
		cantidad = teclado.nextInt();

		while (i <= cantidad) {

			System.out.println("Introduzca un numero ");
			numero = teclado.nextInt();

			if (numero < menor) {

				menor = numero;
			}

			i++;

		}

		System.out.println("El menor de todos los numeros es " + menor);

		teclado.close();

	}

}
