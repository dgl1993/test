/* Escribe un algoritmo que pida al usuario un número de segundos y pase dicho número a horas, minutos y segundos
mostrándolos por pantalla. (Haz una traza con 505 segundos) */
package practicauno;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		int segundos_resto = 0, segundos = 0, minutos = 0, minutos_resto = 0, horas = 0;

		System.out.println("Introduzca un numero de segundos ");
		segundos = teclado.nextInt();

		segundos_resto = segundos % 60;

		minutos = segundos / 60;

		minutos_resto = minutos % 60;

		horas = minutos / 60;

		System.out.println(" hay " + horas + " horas " + minutos_resto + " minutos y " + segundos_resto + " segundos");

		teclado.close();

	}

}
