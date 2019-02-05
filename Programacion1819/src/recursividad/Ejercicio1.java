
package recursividad;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int numero = 0;
		System.out.println("De que numero quieres hacer la tabla: ");
		numero = teclado.nextInt();
		tablaDeMultiplicar(numero, 6);
		int res = potencia(2, 4);

		System.out.println("La potencia de 2 elevado a 4 es " + res);
	}

	public static void tablaDeMultiplicar(int num, int j) {
		// caso base
		if (j == 1) {
			System.out.println(num + "x" + j + "=" + num * j);
			// caso recursivo
		} else {
			tablaDeMultiplicar(num, j - 1);
			System.out.println(num + "x" + j + "=" + num * j);
		}
	}

	public static int potencia(int base, int exponente) {
		int pot;
		if (exponente == 0) {
			return 1;
		} else {
			pot = base * potencia(base, exponente - 1);
			return pot;
		}
	}

	public static void imprimeCifras(int num) {

		int cifra;
		int restNumero;

		if (num < 10) {

			System.out.println(" " + num);

		} else {

			cifra = num % 10;
			restNumero = num / 10;

			imprimeCifras(restNumero);
			System.out.println(" " + cifra);

		}

	}
	
	

}
