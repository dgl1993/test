/*Escribe un algoritmo que vaya pidiendo al usuario n�meros enteros positivos. 
 * Cuando el usuario no quiera insertar m�s n�meros, introducir� un n�mero negativo y el 
 * algoritmo, antes de acabar, mostrar� la media de los n�meros positivos que ha introducido anteriormente el usuario. */
package ejerciciosiniciales_tres;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int acumulador = 0, numero = 0, posicion = 0;

		while (numero >= 0) {

			System.out.println("Introduzca un numero ");

			numero = teclado.nextInt();

			if (numero >= 0) {

				acumulador = acumulador + numero;
				posicion++;
			}

		}
		
		System.out.println("La media de los numeros positivos es " +acumulador / +posicion);

		teclado.close();

	}

}
