/* 10.Crea un vector vectorInicial de 10 posiciones. Pide al usuario que lo rellene. Muestra el vector.
Ahora genera un bucle que haga lo siguiente:
- Pida al usuario dos posiciones del vector
- Trasponga los contenidos de esas dos posiciones en el vector.
- Muestre el vector por pantalla.
-Pregunta al usuario si desea trasponer más valores (si no, sale del bucle y termina).*/

package vectores;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int[] vectorInicial = new int[10];
		boolean salida = false;

		for (int i = 0; i < vectorInicial.length; i++) {

			System.out.println("Introduzca el valor para la posicion " + i);
			int valor = teclado.nextInt();

			vectorInicial[i] = valor;

		}

		while (!salida) {

			System.out.println("Introduzca una posición ");
			int pos1 = teclado.nextInt();

			System.out.println("Introduzca una segunda posición ");
			int pos2 = teclado.nextInt();

			for (int i = 0; i < vectorInicial.length; i++) {

				int aux2 = vectorInicial[pos2];
				int aux1 = vectorInicial[pos1];

				vectorInicial[pos2] = vectorInicial[pos1];
				vectorInicial[pos1] = vectorInicial[pos2];

				System.out.println(vectorInicial[i]);
			}

			System.out.println("Desea transponer mas posicion s/n ");
			char respuesta = teclado.next().charAt(0);

			if (respuesta == 'n') {

				salida = true;
			}

		}
		
		teclado.close();

	}

}
