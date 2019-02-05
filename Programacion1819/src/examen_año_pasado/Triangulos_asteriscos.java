package examen_año_pasado;

import java.util.Scanner;

public class Triangulos_asteriscos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int numero = 0;

		System.out.println("Introduzca un numero impar mayor de 10 ");
		numero = teclado.nextInt();

		while ((numero % 2 == 0) || (numero % 2 != 0 && numero <= 10)) {

			System.out.println("Introduzca un numero impar mayor de 10 ");
			numero = teclado.nextInt();

		}

		for (int i = 1; i <= numero; i++) {
			for (int j = 1; j <= numero; j++) {

				if (i == 1 || i == numero || j == 1 || j == numero || j == numero / 2 + 1 || i == numero / 2 + 1
						|| i == j || j == numero - (i - 1)) {

					System.out.print("*");

				} else {

					System.out.print(" ");
				}

				System.out.print(" ");
			}

			System.out.println();
		}
		teclado.close();
	}

}
