package ejercicios;

import java.util.Scanner;

public class MediaPiramideReves {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero = 0;

		System.out.println("introduzca un numero ");
		numero = teclado.nextInt();

		for (int i = numero; i > 0; i--) {

			for (int j = 0; j < i; j++) {

				System.out.print("*");
			}

			System.out.println(" ");
		}

		teclado.close();
	}

}
