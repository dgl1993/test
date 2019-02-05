package ejerciciosiniciales_dos;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int numero_uno = 0, numero_dos = 0, numero_tres = 0;

		System.out.println("Introduzca tres numeros: ");
		numero_uno = teclado.nextInt();
		numero_dos = teclado.nextInt();
		numero_tres = teclado.nextInt();

		if (numero_uno + numero_dos == numero_tres) {

			System.out.println("La suma de " + numero_uno + " y " + numero_dos + " es " + numero_tres);

		} else if (numero_dos + numero_tres == numero_uno) {

			System.out.println("La suma de " + numero_dos + " y " + numero_tres + " es " + numero_uno);

		} else if (numero_uno + numero_tres == numero_dos) {

			System.out.println("La suma de " + numero_dos + " y " + numero_tres + " es " + numero_uno);

		} else {

			System.out.println("ningun resultado de la suma de dos numeros coincide con el tercero ");
		}

		teclado.close();

	}

}
