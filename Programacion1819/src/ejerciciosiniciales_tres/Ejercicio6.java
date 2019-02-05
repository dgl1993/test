/*Escribe un algoritmo que muestre por pantalla la suma de los números pares desde el 1 hasta el 20 
   y también la multiplicación de los números impares desde el 1 hasta el 20.*/

package ejerciciosiniciales_tres;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 0, pares = 0, impares = 1;

		while (i <= 20) {

			if (i % 2 == 0) {

				pares = pares + i;

			} else {

				impares = impares * i;
			}

			i++;

		}

		System.out.println("La suma de los numeros pares es " + pares);
		System.out.println("La multiplicacion de los numeros impares es " + impares);

	}

}
