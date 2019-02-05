package MasEjerciciosFunciones;

import java.util.Scanner;

public class CalcularEdad {

	public static int dia_hoy = 01, mes_hoy = 12, anyo_hoy = 2018;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		boolean bisiesto = true, fecha = true, mayor = true;

		int dia = 0, anyo = 0, mes_entero = 0, dias_mes = 0, edad = 0;

		String mes = " ";

		System.out.println("Introduzca una fecha: ");
		dia = teclado.nextInt();
		mes = teclado.next().toLowerCase();

		anyo = teclado.nextInt();

		bisiesto = Bisiesto(anyo);

		mes_entero = Meses(mes);

		dias_mes = dias(mes_entero, anyo);

		fecha = FechaCorrecta(dia, mes_entero, anyo);

		mayor = esMayor(dia, mes_entero);

		if (fecha) {

			CalculaEdad(dia, mes_entero, anyo);

		} else {

			while(!fecha) {
				
				System.out.println("Fecha incorrecta vuelva a introducir una fecha: ");
				dia = teclado.nextInt();
				mes = teclado.next().toLowerCase();
				anyo = teclado.nextInt();
				
				
				mes_entero = Meses(mes);
				fecha=FechaCorrecta(dia, mes_entero, anyo);
				
				if(fecha) {
					
					CalculaEdad(dia, mes_entero, anyo);
					
				}
				
			}

		}

		teclado.close();

	}

	public static boolean Bisiesto(int anyo) {

		if ((anyo % 4 == 0) && (anyo % 100 != 0) || (anyo % 400 == 0)) {

			return true;

		} else {

			return false;
		}

	}

	public static int Meses(String meses) {

		int mes = 0;

		switch (meses) {

		case "enero":

			mes = 1;

			break;

		case "febrero":

			mes = 2;

			break;

		case "marzo":

			mes = 3;

			break;

		case "abril":

			mes = 4;

			break;

		case "mayo":

			mes = 5;

			break;

		case "junio":

			mes = 6;

			break;

		case "julio":

			mes = 7;

			break;

		case "agosto":

			mes = 8;

			break;

		case "septiembre":

			mes = 9;

			break;

		case "octubre":

			mes = 10;

			break;

		case "noviembre":

			mes = 11;

			break;

		case "diciembre":

			mes = 12;

			break;

		default:

			mes = -1;

			break;

		}

		return mes;

	}

	public static int dias(int d, int anyo) {

		int dias = 0;

		if (d == 1 || d == 3 || d == 5 || d == 7 || d == 8 || d == 10 || d == 12) {

			dias = 31;
		}

		if (d == 2 && Bisiesto(anyo)) {

			dias = 29;
		}

		if (d == 2 && !Bisiesto(anyo)) {

			dias = 28;
		}

		if (d == 4 || d == 6 || d == 9 || d == 11) {

			dias = 30;
		}

		return dias;

	}

	public static boolean FechaCorrecta(int dia, int mes_entero, int anyo) {

		boolean fecha = true;

		if ((dia < 0) || (dia > (dias(mes_entero, anyo))) || (anyo > anyo_hoy)) {

			fecha = false;

		}

		return fecha;

	}

	public static boolean esMayor(int dia, int mes_entero) {

		boolean mayor = true;

		if ((dia > dia_hoy) && (mes_entero > mes_hoy) || (mes_entero==mes_hoy && dia>dia_hoy)) {

			mayor = true;

		} else {

			mayor = false;
		}

		return mayor;

	}

	public static void CalculaEdad(int dia, int mes_entero, int anyo) {

		int edad = 0;

		if (FechaCorrecta(dia, mes_entero, anyo) && (!esMayor(dia, mes_entero) )) {

			edad = anyo_hoy - anyo;

		} else {

			edad = ((anyo_hoy) - (anyo) - 1);
		}

		System.out.println("Tu edad es " + edad);

	}

}
	