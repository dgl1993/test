package pruebasAsteriscos;

import java.util.Scanner;

public class EjercicioZeta {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numero = 0;

		System.out.println("introduzca un numero impar mayor o igual que cinco  ");
		numero = teclado.nextInt();

		while (numero % 2 == 0 || numero < 5) {

			System.out.println("introduzca un numero impar mayor o igual que cinco  ");
			numero = teclado.nextInt();
		}

		for (int i = 1; i <= numero; i++) {
			for (int j = 1; j <= numero; j++) {

				if (i == 1 || i == numero || i == numero / 2 + 1) {

					System.out.print("*");
				} else {

					if (j < (numero - (i - 1)) || j > (numero - (i - 1))) {

						System.out.print(" ");
					} else {

						System.out.print("*");
					}
				}
			}
			System.out.println();
		}
			teclado.close();
	}

}
