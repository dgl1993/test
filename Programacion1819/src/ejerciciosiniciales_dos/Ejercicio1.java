package ejerciciosiniciales_dos;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		double numero = 0;

		System.out.println("Introduzca un numero ");
		numero = teclado.nextDouble();

		if (numero > 0) {

			System.out.println("El numero " + numero + " es positivo");

		} else if (numero < 0) {
			
			System.out.println("El numero " + numero + " es negativo ");
			
		} else {

			System.out.println("El numero vale cero");
		}
		
		teclado.close();

	}

}
