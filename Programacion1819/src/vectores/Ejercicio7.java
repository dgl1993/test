/*Crea un vector numerosOrdenados de 10 posiciones que guarde valores aleatorios entre 1 y 50
pero teniendo en cuenta que en cada posición el número debe ser mayor o igual que las posiciones
anteriores. */

package vectores;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] numerosOrdenados = new int[10];

		for (int i = 0; i < numerosOrdenados.length; i++) {

			numerosOrdenados[i] = (int) ((Math.random() * 10) + 1);
		}

		for (int i = 0; i < (numerosOrdenados.length - 1); i++) {

			for (int j = i + 1; j < numerosOrdenados.length; j++) {

				if (numerosOrdenados[i] >= numerosOrdenados[j]) {

					int variable = numerosOrdenados[i];
					numerosOrdenados[i] = numerosOrdenados[j];
					numerosOrdenados[j] = variable;

				}

			}

			System.out.println(numerosOrdenados[i]);
		}

	}

}
