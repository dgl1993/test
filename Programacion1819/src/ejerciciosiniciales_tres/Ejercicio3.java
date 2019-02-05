/* Escribe un algoritmo que imprima por pantalla los 20 primeros números pares positivos */
package ejerciciosiniciales_tres;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 1, pares = 1;

		while (pares <= 20) {

			if (numero % 2 == 0) {

				System.out.println("Numero " + numero);

				pares++;

			}

			numero++;
		}

	}

}
