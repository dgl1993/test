/*3. Diseña un algoritmo en pseudocódigo y su correspondiente código en java que pida al usuario un número
de 3 cifras y muestre por pantalla si el número es un número Armstrong o no. Todo el código debe ser
desarrollado en el programa principal y no hacer uso de funciones ni diseñadas por ti mismo ni predeterminadas
(no se puede hacer uso de la función Math.pow), para elevar el número obligatoriamente debe usarse un bucle.^*/

package ejerciciosJAVA;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int numero = 0, centenas = 0, decenas = 0, unidades = 0, potencia_centenas = 1, i = 0, potencia_decenas = 1,
				potencia_unidades = 1, suma_potencias = 0, acumulador_numero = 0;

		System.out.println("Introduzca un numero ");
		numero = teclado.nextInt();

		if (numero < 100 || numero > 999) {

			System.out.println("El numero ha de tener 3 cifras por favor introduzca otro numero ");
			numero = teclado.nextInt();
		}

		acumulador_numero = numero;

		centenas = numero / 100;
		numero = numero % 100;
		decenas = numero / 10;
		unidades = numero % 10;

		while (i < 3) {

			potencia_centenas = potencia_centenas * centenas;

			potencia_decenas = potencia_decenas * decenas;

			potencia_unidades = potencia_unidades * unidades;

			i++;

		}

		suma_potencias = potencia_centenas + potencia_decenas + potencia_unidades;

		if (suma_potencias == acumulador_numero) {

			System.out.println("El numero " + acumulador_numero + " es un numero armstrong ");

		} else {

			System.out.println("El numero " + acumulador_numero + " no es un numero armstrong");
		}

		teclado.close();

	}

}
