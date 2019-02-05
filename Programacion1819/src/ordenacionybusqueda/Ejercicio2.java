/*Realiza un programa que cree dos vectores de 100 elementos. El primero almacenará
una serie de datos numéricos desordenados. Dichos datos serán datos generados aleatoriamente.
El segundo array contendrá los mismos datos pero ordenados por el método de inserción.*/

package ordenacionybusqueda;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int j, k, temp;

		int[] vectordesordenado = new int[100];
		int[] vectorordenado = new int[100];

		for (int i = 0; i < vectordesordenado.length; i++) {

			vectordesordenado[i] = (int) (Math.random() * 100) + 1;
		}

		vectorordenado=vectordesordenado.clone();

		for (j = 1; j < vectorordenado.length; j++) {
			temp = vectorordenado[j];
			k = j - 1;
			while ((k >= 0) && (vectorordenado[k] > temp)) {
				vectorordenado[k + 1] = vectorordenado[k];
				k--;
			}
			vectorordenado[k + 1] = temp;
		}
		
		for (int i = 0; i < vectorordenado.length; i++) {

			System.out.println(vectorordenado[i]);
		}
		
	}

}
