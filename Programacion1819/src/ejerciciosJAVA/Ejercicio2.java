/*2. Diseña un algoritmo y su correspondiente código en java que pida una fecha de nacimiento al usuario (el día
y el año en formato entero y el mes en formato cadena) y diga cuantos años tiene el usuario a día de hoy (21 de
Noviembre del 2014), la fecha del día de hoy debe ir guardada en CONSTANTES, no en variables. La fecha de
nacimiento introducida debe ser válida.*/

package ejerciciosJAVA;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		final int DIA_ACTUAL = 9, MES_ACTUAL = 11, AÑO_ACTUAL = 2018;

		int dia = 0, año = 0, mes_numerico = 0, años_totales = 0;

		String mes = " ";

		boolean bisiesto = false;

		System.out.println("Introduzca un mes valido ");
		mes = teclado.nextLine();

		System.out.println("Introduzca un dia valido ");
		dia = teclado.nextInt();

		System.out.println("Introduzca un año ");
		año = teclado.nextInt();

		if ((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0)) {

			bisiesto = true;
		}

		switch (mes) {

		case "enero":

			mes_numerico = 1;

			break;

		case "febrero":

			mes_numerico = 2;

			break;

		case "marzo":

			mes_numerico = 3;

			break;

		case "abril":

			mes_numerico = 4;

			break;

		case "mayo":

			mes_numerico = 5;

			break;

		case "junio":

			mes_numerico = 6;

			break;

		case "julio":

			mes_numerico = 7;

			break;

		case "agosto":

			mes_numerico = 8;

			break;

		case "septiembre":

			mes_numerico = 9;

			break;

		case "octubre":

			mes_numerico = 10;

			break;

		case "noviembre":

			mes_numerico = 11;

			break;

		case "diciembre":

			mes_numerico = 12;

			break;

		default:

			System.out.println("Introduzca un mes correcto ");
			mes = teclado.nextLine();

			break;

		}

		años_totales = AÑO_ACTUAL - año;

		if ((mes_numerico == 1 || mes_numerico == 3 || mes_numerico == 5 || mes_numerico == 7 || mes_numerico == 8
				|| mes_numerico == 10 || mes_numerico == 12) && (dia <= 31)) {

			if ((mes_numerico > MES_ACTUAL) || (MES_ACTUAL == mes_numerico && dia > DIA_ACTUAL)) {

				años_totales--;

			}

			System.out.println("Tu cantidad de años es " + años_totales);

		} else if ((mes_numerico == 4 || mes_numerico == 6 || mes_numerico == 9 || mes_numerico == 11) && (dia <= 30)) {

			if ((mes_numerico > MES_ACTUAL) || (MES_ACTUAL == mes_numerico && dia > DIA_ACTUAL)) {

				años_totales--;

			}

			System.out.println("Tu cantidad de años es " + años_totales);

		} else if ((mes_numerico == 2 && bisiesto) && (dia <= 29)) {

			if ((mes_numerico > MES_ACTUAL) || (MES_ACTUAL == mes_numerico && dia > DIA_ACTUAL)) {

				años_totales--;

			}

			System.out.println("Tu cantidad de años es " + años_totales);

		} else if ((mes_numerico == 2 && !bisiesto) && (dia <= 28)) {

			if ((mes_numerico > MES_ACTUAL) || (MES_ACTUAL == mes_numerico && dia > DIA_ACTUAL)) {

				años_totales--;

			}

			System.out.println("Tu cantidad de años es " + años_totales);

		} else {

			System.out.println("La fecha introducida no es correcta ");
		}

		teclado.close();

	}

}
