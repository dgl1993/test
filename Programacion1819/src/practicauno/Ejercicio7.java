/* Escribe un algoritmo que guarde en una constante un CARACTER_SECRETO. El algoritmo irá pidiendo caracteres al
usuario hasta que lo acierte, indicando al usuario cada vez que escribe un carácter si éste es mayor o menor que el
CARACTER_SECRETO (ten en cuanta que el carácter ‘a’ es menor que ‘b’ y que ‘c’ y así sucesivamente). Ten en
cuenta que el usuario siempre va a escribir caracteres en minúscula. Cuando el usuario acierte el caracter debe
aparecer un mensaje de ACERTADO y el número de intentos que ha realizado hasta acertarlo. (Haz una traza con el
CARACTER SECRETO ‘f’ y que el usuario va intentado acertar con los caracteres ‘a’ ‘i’ ‘e’ ‘g’ ‘f’).
*/

package practicauno;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		final char CARACTER_SECRETO = 'f';

		char caracter = ' ';
		int contador = 0;

		while (caracter != CARACTER_SECRETO) {
			
			
			System.out.println("Introduce un caracter ");
			caracter = teclado.next().charAt(0);
			contador++;
			

			if (caracter > CARACTER_SECRETO) {

				System.out.println("El caracter introducido " + caracter + " es mayor que el caracter secreto");

			}

			if (caracter < CARACTER_SECRETO) {

				System.out.println("El caracter introducido " + caracter + " es menor que el caracter secreto");

			}
			
			

		}

		System.out.println("Enhorabuena has acertado el caracter secreto! en " + contador + " intentos");
		teclado.close();

	}

}
