package practicaIVJAVASubprogramas;

import java.util.Scanner;

public class ExamenAnyoPasado {

	private static char ficha1 = ' ', ficha2 = ' ', ficha3 = ' ', ficha4 = ' ', ficha5 = ' ', fic1 = ' ', fic2 = ' ',
			fic3 = ' ', fic4 = ' ', fic5 = ' ';

	private static int blancaSecretas = 0, negraSecretas = 0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		boolean ganar = false;

		int pos = 1, contador = 0, intentos = 0;

		char color = ' ', respuesta = ' ';
		
		System.out.println("Generando fichas secretas y posición....");
		System.out.println();
		System.out.println();
		asignaColorAFichas();
		blancaSecretas=cuentaColorFichasSecretas('B');
		negraSecretas=cuentaColorFichasSecretas('N');

		while (!ganar) {
			pos = 1;
			while (pos <= 5) {

				if (pos == 1) {

					fic1 = PideFicha(pos);

				}

				if (pos == 2) {

					fic2 = PideFicha(pos);

				}

				if (pos == 3) {

					fic3 = PideFicha(pos);

				}

				if (pos == 4) {

					fic4 = PideFicha(pos);

				}

				if (pos == 5) {

					fic5 = PideFicha(pos);

				}

				pos++;
			}

			contador = 0;

			if (comparaFichaEnSuPosicion(fic1, 1)) {

				contador++;
			}
			if (comparaFichaEnSuPosicion(fic2, 2)) {

				contador++;
			}
			if (comparaFichaEnSuPosicion(fic3, 3)) {

				contador++;
			}

			if (comparaFichaEnSuPosicion(fic4, 4)) {

				contador++;
			}
			if (comparaFichaEnSuPosicion(fic5, 5)) {

				contador++;
			}

			System.out.println("Su combinación " + fic1 + " " + fic2 + " " + fic3 + " " + fic4 + " " + fic5);
			System.out.println("Tienes " + contador + " fichas bien colocadas");

			if (contador == 5) {

				ganar = true;

			} else {

				System.out.println("¿Quieres que te lo ponga fácil?, ¿Quieres ver que posiciones has acertado? (s/n)");
				respuesta = teclado.next().charAt(0);
				if (respuesta == 's') {

					fic1 = devuelveCaracter(fic1, 1);
					fic2 = devuelveCaracter(fic2, 2);
					fic3 = devuelveCaracter(fic3, 3);
					fic4 = devuelveCaracter(fic4, 4);
					fic5 = devuelveCaracter(fic5, 5);
					cuentaColorFichasSecretas('B');
					cuentaColorFichasSecretas('N');

					System.out.println(
							"LLEVAS BIEN COLOCADAS " + fic1 + " " + fic2 + " " + fic3 + " " + fic4 + " " + fic5);
					System.out.println("Hay " + blancaSecretas+ " blancas y "
							+ negraSecretas + " negras");

				}
			}

			intentos++;
		}

		System.out.println("¡¡MUY BIEN!! LO HAS CONSEGUIDO EN " + intentos + " INTENTOS ");
	}

	public static char PideFicha(int pos) {

		char color = ' ';

		Scanner teclado = new Scanner(System.in);

		if (pos == 1) {

			System.out.println("Introduzca una ficha para la posicion 1 ");
			color = teclado.next().charAt(0);
		} else

		if (pos == 2) {
			System.out.println("Introduzca una ficha para la posicion 2 ");
			color = teclado.next().charAt(0);
		} else

		if (pos == 3) {

			System.out.println("Introduzca una ficha para la posicion 3 ");
			color = teclado.next().charAt(0);
		} else

		if (pos == 4) {

			System.out.println("Introduzca una ficha para la posicion 4 ");
			color = teclado.next().charAt(0);
		} else

		if (pos == 5) {
			System.out.println("Introduzca una ficha para la posicion 5 ");
			color = teclado.next().charAt(0);
		}

		return color;

	}

	public static char aleatorioBlancoONegro() {

		int aleatorio = (int) ((Math.random() * 2) + 1);
		char ficha = ' ';

		switch (aleatorio) {

		case 1:

			ficha = 'B';

			break;

		case 2:

			ficha = 'N';

			break;

		}

		return ficha;

	}

	public static void asignaColorAFichas() {

		ficha1 = aleatorioBlancoONegro();
		ficha2 = aleatorioBlancoONegro();
		ficha3 = aleatorioBlancoONegro();
		ficha4 = aleatorioBlancoONegro();
		ficha5 = aleatorioBlancoONegro();

	}

	public static int cuentaColorFichasSecretas(char color) {

		int CuentaBlancas = 0, CuentaNegras = 0;

		if (color == 'B') {

			if (ficha1 == 'B') {

				CuentaBlancas++;
			}

			if (ficha2 == 'B') {

				CuentaBlancas++;
			}

			if (ficha3 == 'B') {

				CuentaBlancas++;
			}

			if (ficha4 == 'B') {

				CuentaBlancas++;
			}

			if (ficha5 == 'B') {

				CuentaBlancas++;
			}

			return CuentaBlancas;

		} else {

			if (color == 'N') {

				if (ficha1 == 'N') {

					CuentaNegras++;
				}

				if (ficha2 == 'N') {

					CuentaNegras++;
				}

				if (ficha3 == 'N') {

					CuentaNegras++;
				}

				if (ficha4 == 'N') {

					CuentaNegras++;
				}

				if (ficha5 == 'N') {

					CuentaNegras++;
				}

			}

			return CuentaNegras;
		}

	}

	public static boolean comparaFichaEnSuPosicion(char fich, int pos) {

		if (pos == 1 && fich == ficha1) {

			return true;

		} else if (pos == 2 && fich == ficha2) {

			return true;

		} else if (pos == 3 && fich == ficha3) {

			return true;

		} else if (pos == 4 && fich == ficha4) {

			return true;

		} else if (pos == 5 && fich == ficha5) {

			return true;
		} else {

			return false;
		}

	}

	public static int mensajeFichasBienColocadas(char fic1, char fic2, char fic3, char fic4, char fic5) {

		int bienColocadas = 0;

		if (fic1 == ficha1) {

			bienColocadas++;

		} else if (fic2 == ficha2) {

			bienColocadas++;

		} else if (fic3 == ficha3) {

			bienColocadas++;

		} else if (fic4 == ficha4) {

			bienColocadas++;

		} else if (fic5 == ficha5) {

			bienColocadas++;
		}

		return bienColocadas;

	}

	public static boolean ganador(char fic1, char fic2, char fic3, char fic4, char fic5) {

		if (ficha1 == fic1 && ficha2 == fic2 && ficha3 == fic3 && ficha4 == fic4 && ficha5 == fic5) {

			return true;

		} else {

			return false;
		}

	}

	public static char devuelveCaracter(char fich, int pos) {

		if (pos == 1 && fich == ficha1) {

			return fich;

		} else if (pos == 2 && fich == ficha2) {

			return fich;

		} else if (pos == 3 && fich == ficha3) {

			return fich;

		} else if (pos == 4 && fich == ficha4) {

			return fich;

		} else if (pos == 5 && fich == ficha5) {

			return fich;

		} else {

			return 'X';
		}
	}

	public static void muestraResultadoParcial(char fic1, char fic2, char fic3, char fic4, char fic5) {

		fic1 = devuelveCaracter(fic1, 1);

		System.out.println(fic1);

		fic2 = devuelveCaracter(fic2, 2);

		System.out.println(fic2);

		fic3 = devuelveCaracter(fic3, 3);

		System.out.println(fic3);

		fic4 = devuelveCaracter(fic4, 4);

		System.out.println(fic4);

		fic5 = devuelveCaracter(fic5, 5);

		System.out.println(fic5);

	}

}
