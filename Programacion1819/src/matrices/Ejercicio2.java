/* Crea una función buscaElemento que se le pase como parámetro una matriz de tipo
entero y un número entero y muestre por pantalla todas las apariciones de ese
número y en qué fila y columna se encuentra dicho número. Al final también debe
imprimir el número de apariciones de dicho número.*/

package matrices;

public class Ejercicio2 {

	public static void main(String[] args) {

		int numero = 1;

		int[][] elementos = { { 1, 2, 1, 4, 5 }, 
							  { 6, 7, 1, 9, 10 }};
		
		buscaElemento(elementos,numero);

	}

	public static void buscaElemento(int elementos[][], int numero) {

		int contador = 0;

		for (int i = 0; i < elementos.length; i++) {
			for (int j = 0; j < elementos[i].length; j++) {

				if (elementos[i][j]==numero) {

					System.out.println(
							" El numero " + numero + " se encuentra en la fila " + i + " y en la columna " + j);
					contador++;
				}

			}

		}
		
		System.out.println("El numero " + numero + " se repite " + contador + " veces ");
	}
}
