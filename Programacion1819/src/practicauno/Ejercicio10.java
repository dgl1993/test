/*Escribe un algoritmo que pida al usuario nombre y dos apellidos de una persona, luego pida nombre y dos apellidos
de otra persona. El algoritmo debe mostrar por pantalla si esas dos personas pueden ser hermanos o primos o no
tienen parentesco teniendo en cuenta sus apellidos.*/

package practicauno;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		String nombre_uno = " ", apellido_unoA = " ", apellido_dosA = " ", nombre_dos = " ", apellido_unoB = " ",
				apellido_dosB = " ";

		System.out.println("Introduzca el nombre para la primera persona ");
		nombre_uno = teclado.nextLine();
		apellido_unoA = teclado.nextLine();
		apellido_dosA = teclado.nextLine();

		System.out.println("Introduzca el nombre para la segunda persona ");
		nombre_dos = teclado.nextLine();
		apellido_unoB = teclado.nextLine();
		apellido_dosB = teclado.nextLine();

		if ((apellido_unoA.equals(apellido_unoB)) && (apellido_dosA.equals(apellido_dosB))) {

			System.out.println(nombre_uno+ " y " +nombre_dos+ " son primos ");

		} else if ((apellido_unoA.equals(apellido_unoB)) || (apellido_unoA.equals(apellido_dosB))
				|| (apellido_dosA.equals(apellido_unoB)) || (apellido_dosA.equals(apellido_dosB))) {

			System.out.println(nombre_uno+ " y " +nombre_dos+ " son hermano ");
		} else {

			System.out.println(nombre_uno+ " y " +nombre_dos+ " no son primos ni hermanos");
		}

		teclado.close();

	}

}
