/* Escribe un algoritmo que vaya pidiendo al usuario n�meros enteros positivos que debe ir contando. 
Cuando el usuario no quiera insertar m�s n�meros, introducir� un n�mero negativo y el algoritmo,
antes de acabar, mostrar� cu�ntos n�meros positivos ha introducido anteriormente el usuario. */

package ejerciciosiniciales_tres;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero = 0, contador = 0;

		while (numero >= 0) {

			System.out.println("Introduzca un numero ");
			numero = teclado.nextInt();

			if (numero >= 0) {
				
				contador++;

			}
		}

		System.out.println("La cantida de numeros positivos introducidos por el usuario son " + contador);
		teclado.close();
	}
		

}
