package practicaIVJAVASubprogramas;

import java.util.Scanner;

public class pseudoDAMAS {

	private static boolean fichaProg1 = true, fichaProg2 = true, fichaProg3 = true, fichaUser1 = true,
			fichaUser2 = true, fichaUser3 = true, ganaPrograma = false, ganaUsuario = false, tablas = false,
			comido = true;

	private static int Xprog1 = 3, Yprog1 = 2, Xprog2 = 15, Yprog2 = 2, Xprog3 = 27, Yprog3 = 2, Xuser1 = 3,
			Yuser1 = 18, Xuser2 = 15, Yuser2 = 18, Xuser3 = 27, Yuser3 = 18, TAMFIL = 20, TAMCOL = 30, fichaUser = 0,
			fichaProg = 0;

	private static char caracter = ' ', letraProg1 = 'P', letraProg2 = 'P', letraProg3 = 'P', letraUser1 = 'U',
			letraUser2 = 'D', letraUser3 = 'T';

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int numFichaProg = 0;
		boolean movimiento = true, movimiento_derecha = true, movimiento_user = true, movimiento_user_derecha = true,
				movimiento_prog = true;
		String move_programa = " ";

		System.out.println("!!BIENVENIDOS AL JUEGO DE DAMAS!!");
		ImprimeLetrasTablero();
		System.out.println();
		ImprimirTablero();

		System.out.println("Empiezas tu ");

		while (!ganaPrograma && !ganaUsuario && !tablas) {
			System.out.println(" ");
			System.out.println("¡TABLAS!");
			System.out.println(" ");
			System.out.println("Tablas s/n");
			String tabla = teclado.next().toLowerCase();

			if (tabla.equals("s")) {
				tablas = true;

			}

			if (tabla.equals("n")) {

				System.out.println("Indica Que ficha quieres mover ");
				fichaUser = teclado.nextInt();

				System.out.println("Indica hacia donde quieres mover la ficha ");
				String mover = teclado.next().toLowerCase();

				if (mover.equals("izquierda")) {

					MueveFichaIzquierdaUsuario(fichaUser, movimiento_user);
					ImprimeLetrasTablero();
					System.out.println(" ");
					ImprimirTablero();
				}

				if (mover.equals("derecha")) {

					MueveFichaDerechaUsuario(fichaUser, movimiento_user_derecha);
					ImprimeLetrasTablero();
					System.out.println(" ");
					ImprimirTablero();
				}

				fichaProg = FichaAleatoria();

				if (fichaProg == 1) {

					move_programa = ladoAleatorio();

					if (move_programa.equals("izquierda")) {

						mueveIzquierdaFichaPrograma(fichaProg, movimiento_prog);
						ImprimeLetrasTablero();
						System.out.println(" ");
						ImprimirTablero();
					}

					if (move_programa.equals("derecha")) {

						mueveDerechaFichaPrograma(fichaProg, movimiento_prog);
						ImprimeLetrasTablero();
						System.out.println(" ");
						ImprimirTablero();
					}

				} else if (fichaProg == 2) {

					move_programa = ladoAleatorio();

					if (move_programa.equals("izquierda")) {

						mueveIzquierdaFichaPrograma(fichaProg, movimiento_prog);
						ImprimeLetrasTablero();
						System.out.println(" ");
						ImprimirTablero();
					}

					if (move_programa.equals("derecha")) {

						mueveDerechaFichaPrograma(fichaProg, movimiento_prog);

						ImprimirTablero();
					}

				} else if (fichaProg == 3) {
					move_programa = ladoAleatorio();

					if (move_programa.equals("izquierda")) {

						mueveIzquierdaFichaPrograma(fichaProg, movimiento_prog);
						ImprimeLetrasTablero();
						System.out.println(" ");
						ImprimirTablero();
					}

					if (move_programa.equals("derecha")) {

						mueveDerechaFichaPrograma(fichaProg, movimiento_prog);
						ImprimeLetrasTablero();
						System.out.println(" ");
						ImprimirTablero();
					}

				}

			}
			if (!fichaUser1 && !fichaUser2 && !fichaUser3) {

				ganaPrograma = true;
			}

			if (!fichaProg1 && !fichaProg2 && !fichaProg3) {

				ganaUsuario = true;
			}
		}

		if (ganaPrograma) {

			System.out.println("El programa te ha ganado ");

		} else if (ganaUsuario) {

			System.out.println("El usuario te ha ganado ");

		} else if (tablas) {

			System.out.println("Habeis quedado en tablas ");
		}

	}

	public static void ImprimeLetrasTablero() {

		char letra = ' ';

		byte letras = 65;

		for (int i = 0; i <= TAMCOL; i++) {

			if (i % 2 != 0 && i % 3 == 0) {

				letra = (char) letras;
				System.out.print(letra);
				letras++;

			} else {

				System.out.print(" ");
			}
		}

	}

	public static void ImprimirTablero() {

		for (int i = 0; i <= TAMFIL; i++) {
			for (int j = 0; j <= TAMCOL; j++) {

				if (i % 4 == 0) {

					System.out.print("*");

				} else if (j % 6 == 0) {

					System.out.print("*");

				} else if (i % 2 == 0 && j % 3 == 0) {

					ImprimeFichas(i, j);

				}

				else {
					System.out.print(" ");
				}

			}

			System.out.println();
		}

	}

	public static void ImprimeFichas(int x, int i) {

		if ((fichaProg1 && i == Xprog1 && x == Yprog1)) {

			System.out.print(letraProg1);

		} else if (fichaProg2 && i == Xprog2 && x == Yprog2) {

			System.out.print(letraProg2);

		} else if (fichaProg3 && i == Xprog3 && x == Yprog3) {

			System.out.print(letraProg3);

		} else if (fichaUser1 && i == Xuser1 && x == Yuser1) {

			System.out.print(letraUser1);

		} else if (fichaUser2 && i == Xuser2 && x == Yuser2) {

			System.out.print(letraUser2);

		} else if (fichaUser3 && i == Xuser3 && x == Yuser3) {

			System.out.print(letraUser3);

		}

		else {
			System.out.print(" ");
		}

	}

	public static boolean mueveIzquierdaFichaPrograma(int numFichaProg, boolean movimiento) {

		if (numFichaProg == 1 && fichaProg1) {
			if ((Xprog1 + 6 != Xprog2 || Yprog1 + 4 != Yprog2 || !fichaProg2)
					&& (Xprog1 + 6 != Xprog3 || Yprog1 + 4 != Yprog3 || !fichaProg3)
					&& (Xprog1 + 6 < TAMCOL && Yprog1 < TAMFIL)) {

				Xprog1 = Xprog1 + 6;
				Yprog1 = Yprog1 + 4;
				caracter = letraProg1;
				System.out.println("BUEN MOVIMIENTO");
				movimiento = true;
				Comeficha(comido);

			} else {

				movimiento = false;
				System.out.println("MOVIMIENTO ERRONEO, EL PROGRAMA PIERDE TURNO ");
			}
		}

		if (numFichaProg == 2 && fichaProg2) {
			if ((Xprog2 + 6 != Xprog1 || Yprog2 + 4 != Yprog1 || !fichaProg1)
					&& (Xprog2 + 6 != Xprog3 || Yprog2 + 4 != Yprog3 || !fichaProg3)
					&& (Xprog2 + 6 < TAMCOL && Yprog2 < TAMFIL)) {

				Xprog2 = Xprog2 + 6;
				Yprog2 = Yprog2 + 4;
				caracter = letraProg2;
				System.out.println("BUEN MOVIMIENTO");
				movimiento = true;
				Comeficha(comido);

			} else {

				movimiento = false;
				System.out.println("MOVIMIENTO ERRONEO, EL PROGRAMA PIERDE TURNO ");
			}
		}

		if (numFichaProg == 3 && fichaProg3) {
			if ((Xprog3 + 6 != Xprog1 || Yprog3 + 4 != Yprog1 || !fichaProg2)
					&& (Xprog3 + 6 != Xprog2 || Yprog3 + 4 != Yprog2 || !fichaProg3)
					&& (Xprog3 + 6 < TAMCOL && Yprog3 < TAMFIL)) {

				Xprog3 = Xprog3 + 6;
				Yprog3 = Yprog3 + 4;
				caracter = letraProg3;
				System.out.println("BUEN MOVIMIENTO");
				movimiento = true;
				Comeficha(comido);

			} else {

				movimiento = false;
				System.out.println("MOVIMIENTO ERRONEO, EL PROGRAMA PIERDE TURNO ");
			}
		}

		return movimiento;

	}

	public static boolean mueveDerechaFichaPrograma(int numFichaProg, boolean movimiento_derecha) {

		if (numFichaProg == 1 && fichaProg1) {
			if ((Xprog1 - 6 != Xprog2 || Yprog1 + 4 != Yprog2 || !fichaProg2)
					&& (Xprog1 - 6 != Xprog3 || Yprog1 + 4 != Yprog3 || !fichaProg3)
					&& (Xprog1 - 6 > 0 && Yprog1 < TAMFIL)) {

				Xprog1 = Xprog1 - 6;
				Yprog1 = Yprog1 + 4;
				caracter = letraProg1;
				System.out.println("BUEN MOVIMIENTO");
				movimiento_derecha = true;
				Comeficha(comido);

			} else {

				movimiento_derecha = false;
				System.out.println("MOVIMIENTO ERRONEO, EL PROGRAMA PIERDE TURNO ");
			}
		}

		if (numFichaProg == 2 && fichaProg2) {
			if ((Xprog2 - 6 != Xprog1 || Yprog2 + 4 != Yprog1 || !fichaProg1)
					&& (Xprog2 - 6 != Xprog3 || Yprog2 + 4 != Yprog3 || !fichaProg2)
					&& (Xprog2 - 6 > 0 && Yprog2 < TAMFIL)) {

				Xprog2 = Xprog2 - 6;
				Yprog2 = Yprog2 + 4;
				caracter = letraProg2;
				System.out.println("BUEN MOVIMIENTO");
				movimiento_derecha = true;
				Comeficha(comido);

			} else {

				movimiento_derecha = false;
				System.out.println("MOVIMIENTO ERRONEO, EL PROGRAMA PIERDE TURNO ");
			}
		}

		if (numFichaProg == 3 && fichaProg3) {
			if ((Xprog3 - 6 != Xprog1 || Yprog3 + 4 != Yprog1 || !fichaProg1)
					&& (Xprog3 - 6 != Xprog2 || Yprog3 + 4 != Yprog2 || !fichaProg2)
					&& (Xprog3 - 6 > 0 && Yprog3 < TAMFIL)) {

				Xprog3 = Xprog3 - 6;
				Yprog3 = Yprog3 + 4;
				caracter = letraProg3;
				System.out.println("BUEN MOVIMIENTO");
				movimiento_derecha = true;
				Comeficha(comido);

			} else {

				movimiento_derecha = false;
				System.out.println("MOVIMIENTO ERRONEO, EL PROGRAMA PIERDE TURNO ");
			}
		}

		return movimiento_derecha;

	}

	public static boolean MueveFichaIzquierdaUsuario(int numFichaUser, boolean movimiento_user) {

		if (numFichaUser == 1 && fichaUser1) {
			if ((Xuser1 - 6 != Xuser2 || Yuser1 - 4 != Yuser2 || !fichaUser2)
					&& (Xuser1 - 6 != Xuser3 || Yuser1 - 4 != Yuser3 || !fichaUser3)
					&& (Xuser1 - 6 > 0 && Yuser1 > 0)) {

				Xuser1 = Xuser1 - 6;
				Yuser1 = Yuser1 - 4;
				caracter = letraUser1;
				System.out.println("BUEN MOVIMIENTO");
				movimiento_user = true;
				Comeficha(comido);

			} else {

				movimiento_user = false;
				System.out.println("MOVIMIENTO ERRONEO, EL JUGADOR PIERDE TURNO ");
			}
		}

		if (numFichaUser == 2 && fichaUser2) {
			if ((Xuser2 - 6 != Xuser1 || Yuser2 - 4 != Yuser1 || !fichaUser2)
					&& (Xuser2 - 6 != Xuser3 || Yuser2 - 4 != Yuser3 || !fichaUser3)
					&& (Xuser2 - 6 > 0 && Yuser2 > 0)) {

				Xuser2 = Xuser2 - 6;
				Yuser2 = Yuser2 - 4;
				caracter = letraUser2;
				System.out.println("BUEN MOVIMIENTO");
				movimiento_user = true;
				Comeficha(!comido);

			} else {

				movimiento_user = false;
				System.out.println("MOVIMIENTO ERRONEO, EL JUGADOR PIERDE TURNO ");
			}
		}

		if (numFichaUser == 3 && fichaUser3) {
			if ((Xuser3 - 6 != Xuser1 || Yuser3 - 4 != Yuser1 || !fichaUser1)
					&& (Xuser3 - 6 != Xuser2 || Yuser3 - 4 != Yuser2 || !fichaUser2)
					&& (Xuser3 - 6 > 0 && Yuser3 > 0)) {

				Xuser3 = Xuser3 - 6;
				Yuser3 = Yuser3 - 4;
				caracter = letraUser3;
				System.out.println("BUEN MOVIMIENTO");
				movimiento_user = true;
				Comeficha(comido);

			} else {

				movimiento_user = false;
				System.out.println("MOVIMIENTO ERRONEO, EL JUGADOR PIERDE TURNO ");
			}
		}

		return movimiento_user;

	}

	public static boolean MueveFichaDerechaUsuario(int numFichaUser, boolean movimiento_user_derecha) {

		if (numFichaUser == 1 && fichaUser1) {
			if ((Xuser1 + 6 != Xuser2 || Yuser1 - 4 != Yuser2 || !fichaUser2)
					&& (Xuser1 + 6 != Xuser3 || Yuser1 - 4 != Yuser3 || !fichaUser3)
					&& (Xuser1 + 6 < TAMCOL && Yuser1 > 0)) {

				Xuser1 = Xuser1 + 6;
				Yuser1 = Yuser1 - 4;
				caracter = letraUser1;
				System.out.println("BUEN MOVIMIENTO");
				movimiento_user_derecha = true;
				Comeficha(comido);

			} else {

				movimiento_user_derecha = false;
				System.out.println("MOVIMIENTO ERRONEO, EL JUGADOR PIERDE TURNO ");
			}
		}

		if (numFichaUser == 2 && fichaUser2) {
			if ((Xuser2 + 6 != Xuser1 || Yuser2 - 4 != Yuser1 || !fichaUser1)
					&& (Xuser2 + 6 != Xuser3 || Yuser2 - 4 != Yuser3 || !fichaUser3)
					&& (Xuser2 + 6 < TAMCOL && Yuser2 > 0)) {

				Xuser2 = Xuser2 + 6;
				Yuser2 = Yuser2 - 4;
				caracter = letraUser2;
				System.out.println("BUEN MOVIMIENTO");
				movimiento_user_derecha = true;
				Comeficha(comido);

			} else {

				movimiento_user_derecha = false;
				System.out.println("MOVIMIENTO ERRONEO, EL JUGADOR PIERDE TURNO ");
			}
		}

		if (numFichaUser == 3 && fichaUser3) {
			if ((Xuser3 + 6 != Xuser1 || Yuser3 - 4 != Yuser1 || !fichaUser1)
					&& (Xuser3 + 6 != Xuser2 || Yuser3 - 4 != Yuser2 || !fichaUser2)
					&& (Xuser3 + 6 < TAMCOL && Yuser3 > 0)) {

				Xuser3 = Xuser3 + 6;
				Yuser3 = Yuser3 - 4;
				caracter = letraUser3;
				System.out.println("BUEN MOVIMIENTO");
				movimiento_user_derecha = true;
				Comeficha(comido);

			} else {

				movimiento_user_derecha = false;
				System.out.println("MOVIMIENTO ERRONEO, EL JUGADOR PIERDE TURNO ");
			}
		}

		return movimiento_user_derecha;

	}

	public static boolean Comeficha(boolean comido) {

		if (caracter == letraProg1 && fichaProg == 1) {
			if (Xprog1 == Xuser1 && Yprog1 == Yuser1) {

				fichaUser1 = false;
				System.out.println("Te has comido una ficha del adversario ");
				return true;

			} else if (Xprog1 == Xuser2 && Yprog1 == Yuser2) {

				fichaUser2 = false;
				System.out.println("Te has comido una ficha del adversario ");
				return true;

			} else if (Xprog1 == Xuser3 && Yprog1 == Yuser3) {

				fichaUser3 = false;
				System.out.println("Te has comido una ficha del adversario ");
				return true;
			}
		}

		if (caracter == letraProg2 && fichaProg == 2) {
			if (Xprog2 == Xuser1 && Yprog2 == Yuser1) {
				fichaUser1 = false;
				System.out.println("Te has comido una ficha del adversario ");
				return true;
			} else if (Xprog2 == Xuser2 && Yprog2 == Yuser2) {

				fichaUser2 = false;
				System.out.println("Te has comido una ficha del adversario ");
				return true;

			} else if (Xprog2 == Xuser3 && Yprog2 == Yuser3) {
				fichaUser3 = false;
				System.out.println("Te has comido una ficha del adversario ");
				return true;
			}

		}

		if (caracter == letraProg3 && fichaProg == 3) {
			if (Xprog3 == Xuser1 && Yprog3 == Yuser1) {

				fichaUser1 = false;
				System.out.println("Te has comido una ficha del adversario ");
				return true;
			} else if (Xprog3 == Xuser2 && Yprog3 == Yuser2) {

				fichaUser2 = false;
				System.out.println("Te has comido una ficha del adversario ");
				return true;

			} else if (Xprog3 == Xuser3 && Yprog3 == Yuser3) {

				fichaUser3 = false;
				System.out.println("Te has comido una ficha del adversario ");
				return true;
			}

		}

		if (caracter == letraUser1 && fichaUser == 1) {
			if (Xuser1 == Xprog1 && Yuser1 == Yprog1) {

				fichaProg1 = false;
				System.out.println("Te has comido una ficha del adversario ");
				return true;

			} else if (Xuser1 == Xprog2 && Yuser1 == Yprog2) {

				fichaProg2 = false;
				System.out.println("Te has comido una ficha del adversario ");
				return true;

			} else if (Xuser1 == Xprog3 && Yuser1 == Yprog3) {

				fichaProg3 = false;
				System.out.println("Te has comido una ficha del adversario ");
				return true;
			}
		}

		if (caracter == letraUser2 && fichaUser == 2) {
			if (Xuser2 == Xprog1 && Yuser2 == Yprog1) {

				fichaProg1 = false;
				System.out.println("Te has comido una ficha del adversario ");
				return true;

			} else if (Xuser2 == Xprog2 && Yuser2 == Yprog2) {

				fichaProg2 = false;
				System.out.println("Te has comido una ficha del adversario ");
				return true;

			} else if (Xuser2 == Xprog3 && Yuser2 == Yprog3) {

				fichaProg3 = false;
				System.out.println("Te has comido una ficha del adversario ");
				return true;
			}
		}

		if (caracter == letraUser3 && fichaUser == 3) {
			if (Xuser3 == Xprog1 && Yuser3 == Yprog1) {

				fichaProg1 = false;
				System.out.println("Te has comido una ficha del adversario ");
				return true;

			} else if (Xuser3 == Xprog2 && Yuser3 == Yprog2) {

				fichaProg2 = false;
				System.out.println("Te has comido una ficha del adversario ");
				return true;

			} else if (Xuser3 == Xprog3 && Yuser3 == Yprog3) {

				fichaProg3 = false;
				System.out.println("Te has comido una ficha del adversario ");
				return true;
			}
		}

		return false;
	}

	public static String ladoAleatorio() {

		int numero = (int) ((Math.random() * 2) + 1);
		String movimiento = " ";

		switch (numero) {

		case 1:

			movimiento = "izquierda";

			break;

		case 2:

			movimiento = "derecha";

			break;

		}

		return movimiento;

	}

	public static int FichaAleatoria() {

		int numero = (int) ((Math.random() * 3) + 1);

		return numero;

	}

}
