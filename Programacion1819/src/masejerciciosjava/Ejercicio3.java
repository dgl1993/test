package masejerciciosjava;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int dia = 0, mes = 0, año = 0;

		boolean bisiesto = false;

		System.out.println("Introduzca un dia ");
		dia = teclado.nextInt();

		System.out.println("Introduzca un mes ");
		mes = teclado.nextInt();

		System.out.println("Introduzca un año ");
		año = teclado.nextInt();

		if (año % 400 == 0 || año % 100 != 0 && año % 400 == 0) {

			bisiesto = true;
		}

		if ((dia < 30 || dia < 31)) {

			dia++;

		}

		if (dia == 30 || dia == 31 && mes != 12) {

			dia = 1;
			mes++;

		}

		if (dia == 31 && mes == 12) {

			dia = 1;
			mes = 1;
			año++;
		}

		if ((mes == 2 && bisiesto) && (dia < 29)) {

			dia++;
		}

		if ((mes == 2 && !bisiesto) && (dia < 28)) {

			dia++;
		}

		if ((mes == 2 && bisiesto) && (dia == 29)) {

			dia = 1;
			mes++;
		}

		if ((mes == 2 && !bisiesto) && (dia == 28)) {

			dia = 1;
			mes++;
		}

		System.out
				.println("Sumandole un dia al dia puesto el dia es " + dia + " en el mes " + mes + " en el año " + año);
		teclado.close();
	}

}
