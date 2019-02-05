package practica3_JAVA;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		final int DIA_ACTUAL = 14, MES_ACTUAL = 11, ANYO_ACTUAL = 2018;

		int dia = 0, mes = 0, año = 0, dia_semana = 0, dias_año = 0, i = 1, dia_mes = 0, dia_mes_actual = 0,
				dias_totales = 0;

		boolean bisiesto = false;

		String dia_cadena = " ";

		System.out.println("Introduzca un dia ");
		dia = teclado.nextInt();

		System.out.println("Introduzca un mes ");
		mes = teclado.nextInt();

		System.out.println("Introduzca un año ");
		año = teclado.nextInt();

		if ((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0)) {

			bisiesto = true;
		}

		while (año < ANYO_ACTUAL - 1) { // DIAS DESDE EL 01/01/1994 hasta el 31/12/2017/

			año++;

			if ((año % 4 == 0) && (año % 100 != 0) || (año % 400 == 0)) {

				dias_año = dias_año + 366;

			} else {

				dias_año = dias_año + 365;
			}

		}

		while (mes <= 12) {

			if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {

				dia_mes = dia_mes + 31;

			}

			if (mes == 2 && bisiesto) {

				dia_mes = dia_mes + 29;

			}

			if (mes == 2 && !bisiesto) {

				dia_mes = dia_mes + 28;
			}

			if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {

				dia_mes = dia_mes + 30;

			}

			mes++;
		}

		while (i < MES_ACTUAL) {

			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12) {

				dia_mes_actual = dia_mes_actual + 31;

			}

			if (i == 2) {

				dia_mes_actual = dia_mes_actual + 28;
			}

			if (i == 4 || i == 6 || i == 9 || i == 11) {

				dia_mes_actual = dia_mes_actual + 30;

			}

			i++;

		}

		dia_mes = dia_mes - (dia);
		dia_mes_actual = dia_mes_actual + DIA_ACTUAL;
		dias_totales = dia_mes + dias_año + dia_mes_actual;
		dia_semana = dias_totales % 7;

		switch (dia_semana) {

		case 0:

			dia_cadena = "miercoles";

			break;

		case 1:

			dia_cadena = "martes";

			break;

		case 2:

			dia_cadena = "lunes";

			break;

		case 3:

			dia_cadena = "domingo";

			break;

		case 4:

			dia_cadena = "sabado";

			break;

		case 5:

			dia_cadena = "viernes";

			break;

		case 6:

			dia_cadena = "jueves";

			break;

		}

		System.out.println("Sabiendo que el dia " + DIA_ACTUAL + " de " + MES_ACTUAL + " de " + ANYO_ACTUAL
				+ " es MIERCOLES... \nusted nacio un " + dia_cadena);

		teclado.close();

	}

}
