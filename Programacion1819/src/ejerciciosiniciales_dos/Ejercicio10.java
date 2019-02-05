package ejerciciosiniciales_dos;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		String jugador_uno = " ", jugador_dos = " ";

		System.out.println("Jugador uno introduzca un valor ");
		jugador_uno = teclado.nextLine();

		System.out.println("Jugador dos introduzca un valor ");
		jugador_dos = teclado.nextLine();

		if (jugador_uno.equals("piedra") && jugador_dos.equals("tijeras")) {

			System.out.println("Gana jugador uno ");
		}

		if (jugador_uno.equals("papel") && jugador_dos.equals("piedra")) {

			System.out.println("Gana jugador uno ");
		}

		if (jugador_uno.equals("tijeras") && jugador_dos.equals("papel")) {

			System.out.println("Gana jugador uno ");
		}

		if (jugador_uno.equals("tijeras") && jugador_dos.equals("piedra")) {

			System.out.println("Gana jugador dos ");
		}

		if (jugador_uno.equals("piedra") && jugador_dos.equals("papel")) {

			System.out.println("Gana jugador dos ");
		}

		if (jugador_uno.equals("papel") && jugador_dos.equals("tijeras")) {

			System.out.println("Gana jugador dos ");
		}

		if (jugador_uno.equals(jugador_dos)) {

			System.out.println("Habeis empatado");

		}
		teclado.close();

	}
}
