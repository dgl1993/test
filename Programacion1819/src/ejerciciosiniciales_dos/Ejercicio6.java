package ejerciciosiniciales_dos;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int numero = 0;

		System.out.println("Introduzca un numero ");
		numero = teclado.nextInt();

		if (numero >= 0 && numero <= 9999) {

			if (numero > 0 && numero < 10) {

				System.out.println("El numero " + numero + " tiene una cifra");
			}

			if (numero >= 10 && numero < 100) {

				System.out.println("El numero " + numero + " tiene dos cifras");
			}

			if (numero >= 100 && numero < 1000) {

				System.out.println("El numero " + numero + " tiene tres cifras");
			}

			if (numero >= 1000 && numero < 10000) {

				System.out.println("El numero " + numero + " tiene cuatro cifras");

			}
		} else {

			System.out.println("El numero no entra en rango ");
		}

		teclado.close();

	}

}
