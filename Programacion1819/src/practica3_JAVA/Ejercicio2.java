package practica3_JAVA;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int numero_uno = 0, numero_dos = 0;

		System.out.println("introduzca el primer numero ");
		numero_uno = teclado.nextInt();

		System.out.println("Inroduzca el segundo numero ");
		numero_dos = teclado.nextInt();
		boolean primo = true;

		for (int i = 1; i <= numero_dos; i++) {

			for (int j = 1; j <= numero_uno; j++) {

				primo = true;

				for (int k = 2; k < i; k++) {

					if (i % k == 0) {

						primo = false;
					}
				}

				if (primo) {

					int resultado = j * i;

					if (resultado < 10) {

						System.out.print(j + "*" + i + "=" + resultado + "   \t");

					} else if (resultado < 100 && resultado > 9) {

						System.out.print(j + "*" + i + "=" + resultado + "  \t");

					} else if (resultado < 1000 && resultado > 99) {

						System.out.print(j + "*" + i + "=" + resultado + " \t");

					}

				}

			}

			if (primo) {

				System.out.print("\n");
			}
		}

		teclado.close();

	}

}
