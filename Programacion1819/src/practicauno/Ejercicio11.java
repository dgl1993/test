/*Escribe un algoritmo que pida al usuario un n�mero entero y luego pida otro n�mero entero. El algoritmo mostrar�
por pantalla las tablas de multiplicar desde el 1 hasta el segundo n�mero pedido de todos los n�meros desde 1 hasta el
primer n�mero pedido. Por ejemplo, si el usuario escribe como primer n�mero el 5 y como segundo el 7, el algoritmo
imprimir� las siguientes tablas (no tiene que imprimirlas en columnas distintas como aparece aqu�): */

package practicauno;

import java.util.Scanner;

public class Ejercicio11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int numero_uno = 0, numero_dos = 0;

		System.out.println("Introduzca el primer numero ");
		numero_uno = teclado.nextInt();

		System.out.println("Introduzca el segundo numero ");
		numero_dos = teclado.nextInt();

		for (int i = 1; i <= numero_uno; i++) {

			System.out.println("Tabla de multiplicar de " + i);

			for (int j = 1; j <= numero_dos; j++) {

				System.out.println(+i + " x " + j + " = " + i * j);

			}
		}

		teclado.close();

	}

}
