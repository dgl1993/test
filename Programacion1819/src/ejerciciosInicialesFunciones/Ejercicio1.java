/*1. Realizar una funci�n, a la que se le pase como par�metro un n�mero N, y muestre por
pantalla N veces, el mensaje: �M�dulo ejecut�ndose�.*/

package ejerciciosInicialesFunciones;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int n = 0;

		System.out.println("Introduzca un numero ");
		n = teclado.nextInt();

		teclado.close();

		Imprimir(n);

	}

	public static void Imprimir(int n) {

		int i = 0;

		while (i < n) {

			System.out.println("modulo ejecutandose ");
			i++;
		}

	}

}
