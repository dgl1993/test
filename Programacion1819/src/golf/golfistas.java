package golf;

import java.util.Scanner;

public class golfistas {

	static int N = 5;
	static int M = 4;
	static int[][] golfistas_jornadas = { { 10, 12, 10, 14 }, { 11, 9, 13, 14 }, { 12, 11, 10, 14 }, { 10, 13, 10, 10 },
			{ 10, 15, 12, 12 } };
	static int[] punt_golf = new int[5];

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// rellenaMatriz();

		CalculaPuntosDeJornada(punt_golf);
		muestraResultados();
		calculaMejoresRegistros(punt_golf);
		System.out.println();
		imprimePuntosFinales();
		System.out.println();
		podio();
		
	}

	public static void rellenaMatriz() {

		Scanner teclado = new Scanner(System.in);

		for (int i = 0; i < golfistas_jornadas.length; i++) {
			for (int j = 0; j < golfistas_jornadas[i].length; j++) {

				System.out.println("jugador " + i);
				System.out.println("Introduce el numero de golpes para la jornada " + j);
				golfistas_jornadas[i][j] = teclado.nextInt();

			}
		}

	}

	public static void muestraResultados() {

		int[][] golfistas_jornadas_3 = golfistas_jornadas.clone();

		System.out.print("Jornada     ");
		for (int i = 0; i < M; i++) {

			System.out.print((i + 1));
			System.out.print("  ");
		}

		System.out.println("\t");

		for (int i = 0; i < golfistas_jornadas_3.length; i++) {
			int jornadas = i + 1;
			System.out.print("jugador " + (i + 1) + ":  ");

			for (int j = 0; j < golfistas_jornadas_3[i].length; j++) {
				int golfistas = j + 1;

				System.out.print(golfistas_jornadas_3[i][j]);
				System.out.print(" ");

			}
			System.out.println("\t");
		}

	}

	public static int[] CalculaPuntosDeJornada(int[] punt_golf) {

		int[] puntos_jornada = new int[5];
		int[][] golfistas_jornadas2 =  { { 10, 12, 10, 14 }, { 11, 9, 13, 14 }, { 12, 11, 10, 14 }, { 10, 13, 10, 10 },
				{ 10, 15, 12, 12 } };
		int contador = 0, segundo = 0, tercero = 0;
		int temp;
		int i, j;
		for (int k = 0; k < M; k++) {
			for (i = 1; i < N; i++) {
				for (j = 0; j < i; j++) {
					if (golfistas_jornadas2[i][k] < golfistas_jornadas2[j][k]) {
						temp = golfistas_jornadas2[j][k];
						golfistas_jornadas2[j][k] = golfistas_jornadas2[i][k];
						golfistas_jornadas2[i][k] = temp;
					}
				}
			}

			for (i = 0; i < 5; i++) {

				if (golfistas_jornadas2[i][k] == golfistas_jornadas2[0][k]) {

				}

			}

			segundo = golfistas_jornadas2[4][k];

			for (i = 0; i < N; i++) {

				if (golfistas_jornadas2[i][k] > golfistas_jornadas2[0][k] && golfistas_jornadas2[i][k] < segundo) {

					segundo = golfistas_jornadas2[i][k];
				}
			}

			tercero = golfistas_jornadas2[4][k];

			for (i = 0; i < N; i++) {

				if (golfistas_jornadas2[i][k] > segundo && golfistas_jornadas2[i][k] < tercero) {

					tercero = golfistas_jornadas2[i][k];
				}
			}

			for (i = 0; i < 5; i++) {

				if (golfistas_jornadas2[i][k] == segundo) {

				}

			}

			for (i = 0; i < 5; i++) {

				if (golfistas_jornadas2[i][k] == tercero) {

				}

			}

			for (i = 0; i < 5; i++) {

				if (golfistas_jornadas[i][k] == tercero) {

					punt_golf[i] += 1;

				}

				if (golfistas_jornadas[i][k] == segundo) {

					punt_golf[i] += 2;

				}

				if (golfistas_jornadas[i][k] == golfistas_jornadas2[0][k]) {

					punt_golf[i] += 3;
				}

			}

		}

		return punt_golf;
	}

	public static void calculaMejoresRegistros(int[] punt_golf2) {

		int[][] golfistas_jornadas_ordenados =golfistas_jornadas.clone();

		int temp;
		int i, j;
		for (i = 0; i < N; i++) {
			for (int k = 0; k < M - 1; k++) {
				for (j = k + 1; j < M; j++) {
					if (golfistas_jornadas_ordenados[i][k] < golfistas_jornadas_ordenados[i][j]) {
						temp = golfistas_jornadas_ordenados[i][j];
						golfistas_jornadas_ordenados[i][j] = golfistas_jornadas_ordenados[i][k];
						golfistas_jornadas_ordenados[i][k] = temp;
					}
				}
			}
		}

		for (i = 0; i < golfistas_jornadas_ordenados.length; i++) {
			for (j = 0; j < golfistas_jornadas_ordenados[i].length; j++) {

			}

		}
		int minimo = golfistas_jornadas_ordenados[0][M - 1];
		int jugador = 0;
		for (i = 1; i < N; i++) {

			if (minimo > golfistas_jornadas_ordenados[i][M - 1]) {
				minimo = golfistas_jornadas_ordenados[i][M - 1];
				jugador = i + 1;
				punt_golf[i] += 2;
			}

		}

	}

	public static void imprimePuntosFinales() {

		for (int i = 0; i < punt_golf.length; i++) {
			int jugador = i + 1;

			System.out.println("jugador" + jugador + " " + punt_golf[i]);
		}

	}

	public static void podio() {

		int[] puntos_golf = punt_golf.clone();

		int i, temp, j;
		for (i = 1; i < puntos_golf.length; i++) {
			temp = puntos_golf[i];
			j = i - 1;
			while ((j >= 0) && (puntos_golf[j] > temp)) {
				puntos_golf[j + 1] = puntos_golf[j];
				j--;
			}
			puntos_golf[j + 1] = temp;
		}

		int primero = puntos_golf[4];
		int segundo = puntos_golf[2];
		int tercero = puntos_golf[0];

		for (i = 0; i < 5; i++) {

			if (primero == punt_golf[i]) {

				System.out.println("Primer puesto ");
				System.out.println("jugador " + (i + 1));
			}

			if (segundo == punt_golf[i]) {

				System.out.println("segundo puesto ");
				System.out.println("jugador " + (i + 1));
			}

			if (tercero == punt_golf[i]) {

				System.out.println("tercer puesto ");
				System.out.println("jugador " + (i + 1));
			}

		}

	}

}
