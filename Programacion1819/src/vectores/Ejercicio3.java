/*3. Crea un vector vectorNumeros de 10 posiciones y guarda valores aleatorios (que pueden ser
repetidos) en �l entre 1 y 100. Debes mostrar por pantalla el valor m�ximo que hay almacenado en
el vector y en qu� posici�n est� (muestra el vector por pantalla para poder comprobarlo).*/

package vectores;

public class Ejercicio3 {

	public static void main(String[] args) {

		int max = 0;
		int posicion = 0;

		int[] vectorNumeros = new int[10];

		for (int i = 0; i < vectorNumeros.length; i++) {

			vectorNumeros[i] = (int) (Math.random() * 100) + 1;

			max = vectorNumeros[0];

		}

		for (int i = 0; i < vectorNumeros.length; i++) {

			System.out.println(vectorNumeros[i]);
		}

		for (int i = 0; i < vectorNumeros.length; i++) {

			if (max < vectorNumeros[i]) {

				max = vectorNumeros[i];
				posicion = i;
			}

		}

		System.out.println("El numero m�ximo es " + max + " y se encuentra en la posci�n " + posicion);

	}

}
