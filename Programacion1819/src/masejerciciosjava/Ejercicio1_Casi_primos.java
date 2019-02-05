package masejerciciosjava;

import java.util.Scanner;

public class Ejercicio1_Casi_primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int numero_uno = 0, numero_dos = 0, divisoresi = 0,  divisoresk = 0;
	
		System.out.println("Introduzca un numero ");
		numero_uno = teclado.nextInt();

		System.out.println("Introduzca un segundo numero ");
		numero_dos = teclado.nextInt();

		for (int i = numero_uno; i <= numero_dos; i++) {
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					for (int k = 1; k <= j; k++) {
						if (j % k == 0) {
							divisoresk++;
						}
					}

					if (divisoresk == 1 || divisoresk == 2) {
						divisoresi++;
					}

					divisoresk = 0;
				}
			}
			if (divisoresi == 1) {
				System.out.println("El numero " + i + " Es casi primo");
			} else {
				System.out.println("El numero " + i + " no es casi primo");
			}

			divisoresi = 0;
			teclado.close();
		}

	}

}
