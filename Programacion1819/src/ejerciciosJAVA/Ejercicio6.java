/*6. Escribe un algoritmo y su correspondiente código en JAVA que pida al usuario un día y un mes (en formato
numérico) y te muestre el día de la semana que se corresponde con ese día en el año 2015, sabiendo que el 1 de
Enero del 2015 fue JUEVES. Por ejemplo: */

package ejerciciosJAVA;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		final int ANYO_ACTUAL = 2018;

		int dia = 0, mes = 0, dia_semana = 0;

		String dia_cadena = " ";

		System.out.println("Introduzca un dia ");
		dia = teclado.nextInt();

		System.out.println("Introduzca un mes ");
		mes = teclado.nextInt();

		dia_semana = ((dia - 1) % 7);

		switch (dia_semana) {

		case 0:

			dia_cadena = "lunes";

			break;

		case 1:

			dia_cadena = "martes";

			break;

		case 2:

			dia_cadena = "miercoles";

			break;

		case 3:

			dia_cadena = "jueves";

			break;

		case 4:

			dia_cadena = "viernes";

			break;

		case 5:

			dia_cadena = "sabado";

			break;

		case 6:

			dia_cadena = "domingo";

			break;

		}

		System.out.println("El dia " + dia + " del mes " + mes + " del año " + ANYO_ACTUAL + " es " + dia_cadena);

		teclado.close();

	}

}
