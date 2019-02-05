package ejerciciosiniciales_dos;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		final double PI = 3.14;

		double area_triangulo = 0, base_triangulo = 0, altura_triangulo = 0, radio_circulo = 0, area_circulo = 0;

		System.out.println("Introduzca la base del triangulo ");
		base_triangulo = teclado.nextDouble();

		System.out.println("Introduzca la altura del triangulo ");
		altura_triangulo = teclado.nextDouble();

		System.out.println("Introduzca el radio del circulo ");
		radio_circulo = teclado.nextDouble();

		radio_circulo = Math.pow(radio_circulo, 2);

		area_triangulo = (base_triangulo * altura_triangulo) / 2;
		area_circulo = PI * radio_circulo;

		if (area_circulo > area_triangulo) {

			System.out.println("El area del circulo es mayor que el area del triangulo ");

		} else if (area_triangulo > area_circulo) {

			System.out.println("El area del triangulo es mayor que el area del circulo ");

		}

		teclado.close();

	}

}
