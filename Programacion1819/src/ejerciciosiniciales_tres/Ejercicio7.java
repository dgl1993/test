/*Escribe un algoritmo que vaya pidiendo al usuario n�meros enteros positivos que debe ir sumando.
Cuando el usuario no quiera insertar m�s n�meros, introducir� un n�mero negativo y el algoritmo, 
antes de acabar, mostrar� la suma de los n�meros positivos introducidos anteriormente por el usuario. */
package ejerciciosiniciales_tres;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero = 0, acumulador = 0;

		while (numero >= 0) {

			System.out.println("Introduzca un numero ");
			numero = teclado.nextInt();

			if (numero >= 0) {

				acumulador = acumulador + numero;

			}

		}

		System.out.println("La suma de los numeros es " + acumulador);

		teclado.close();

	}
}
