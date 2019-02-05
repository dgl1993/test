/*Escribe un algoritmo que pida un número entero positivo al usuario 
y muestre por pantalla todos los números desde el 0 
hasta el número introducido por el usuario */

package ejerciciosiniciales_tres;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int numero = 0;

		System.out.println("Introduzca un numero: ");
		numero = teclado.nextInt();

		for (int i = 0; i < numero; i++) {

			System.out.println("Numero " + i);
		}

		teclado.close();

	}

}
