/* Crea una funci�n buscaElemento que se le pase como par�metro una matriz de tipo
entero y un n�mero entero y muestre por pantalla todas las apariciones de ese
n�mero y en qu� fila y columna se encuentra dicho n�mero. Al final tambi�n debe
imprimir el n�mero de apariciones de dicho n�mero.*/

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
