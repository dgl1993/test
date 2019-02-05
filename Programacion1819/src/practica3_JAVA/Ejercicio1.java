/* Escribe un programa en JAVA para crear un n�mero. El usuario
indicar� de cuantas cifras quiere el n�mero dado. Despu�s le ir� pidiendo las cifras al usuario.
El n�mero deber� cumplir unas particularidades:
� Las cifras las escribir� el usuario en formato cadena.
� La cifra que escriba el usuario en formato cadena siempre tendr� que ser
ALFABETICAMENTE MAYOR o IGUAL que la cifra escrita justo en la posici�n anterior.
(Por ejemplo, si la cifra anterior fue �OCHO�, la siguiente cifra no podr�a ser �DOS�,
�CUATRO�, �CINCO� o �NUEVE�, ya que alfabeticamente son menores, en cambio s�
podr�n ser �UNO�, �TRES�, �SEIS�, �SIETE� ya que alfabeticamente son mayores.
Tambi�n podr�a ser �OCHO�).
� El usuario siempre escribir� un n�mero (en formato cadena claro), pero podr�
escribirlo en may�sculas, min�sculas o con may�sculas y min�sculas alternas.
� Las cifras que sean correctas se ir�n agregando POR LA IZQUIERDA, y se mostrar� el
n�mero parcialmente a medida que se va construyendo.
� Como el n�mero que resulte puede ser grande, se usar� el tipo de datos long.*/

package practica3_JAVA;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		long numero = 0, acumulador = 0;
		int cifras = 0, i = 0;
		String cifras_cadena = " ", cadena_anterior = " ";

		System.out.println("�De cuantas cifras quiere construir el numero? ");
		cifras = teclado.nextInt();

		while (i >= 0 && i < cifras) {

			System.out.println("Introduce cifra: ");
			cifras_cadena = teclado.next().toLowerCase();

			if ((cadena_anterior.compareToIgnoreCase(cifras_cadena) < 0)
					|| (cadena_anterior.equalsIgnoreCase(cifras_cadena)) || (cadena_anterior == " ")) {

				switch (cifras_cadena) {

				case "cero":

					numero = 0;

					break;

				case "uno":

					numero = 1;

					break;

				case "dos":

					numero = 2;

					break;

				case "tres":

					numero = 3;

					break;

				case "cuatro":

					numero = 4;

					break;

				case "cinco":

					numero = 5;

					break;

				case "seis":

					numero = 6;

					break;

				case "siete":

					numero = 7;

					break;

				case "ocho":

					numero = 8;

					break;

				case "nueve":

					numero = 9;

					break;

				}

				cadena_anterior = cifras_cadena;

				acumulador = (long) (acumulador + numero * (Math.pow(10, i)));

				if (i == 0) {
					System.out.println("PRIMERA CIFRA INTRODUCIDA es: " + cifras_cadena);
					System.out.println("Su numero parcialmente es " + acumulador);

				} else {

					System.out.println("CIFRA VALIDA porque la cadena introducida antes fue " + cadena_anterior
							+ " y es menor o igual que " + cifras_cadena);

					System.out.println("Su numero parcialmente es " + acumulador);

				}

				i++;

			} else {

				System.out.println("CIFRA NO VALIDA porque la cadena introducida antes fue " + cadena_anterior
						+ " y es mayor que " + cifras_cadena);

				System.out.println("Su numero parcialmente es " + acumulador);
			}

		}

		System.out.println("Su numero completo es " + acumulador);

		teclado.close();

	}

}
