package vectores;

import java.util.Scanner;

public class vectoresYfunciones {
	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		/*
		 * ej1 muestraValoresVector: que recibe como par�metro un vector y muestra por
		 * pantalla la posici�n y el contenido para cada posici�n del vector de la forma
		 * �la posici�n 0 contiene el valor 3� y as� sucesivamente.
		 */

		int[] muestraValoresVector = { 3, 4, 5, 6 };

		muestraValores(muestraValoresVector);

		/*
		 * ej2 devuelvePosicion: que recibe como par�metro un vector y un n�mero y
		 * devuelve la primera posici�n donde est� dicho n�mero. Si el n�mero no est� en
		 * el vector, devolver� el valor -1.
		 */

		int[] vectorNumeros = { 11, 9, 10, 24, 12, 32, 16 };

		int numero = 0, posicion = 0;

		System.out.println("Introduzca el numero a buscar ");
		numero = teclado.nextInt();

		posicion = devuelvePosicion(vectorNumeros, numero);

		System.out.println("El numero " + numero + " se encuentra en la posici�n " + posicion);

		/*
		 * ej3 multiplicaPropioVector: que recibe como par�metro un vector y un n�mero y
		 * cambia todos los valores del vector multiplic�ndolos por el n�mero dado.
		 * 
		 */

		int[] vectorMultiplicar = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int multiplicador = 0;

		System.out.println("Introduzca el numero por el que quiere multiplicar su vector ");
		multiplicador = teclado.nextInt();

		multiplicarPropioVector(vectorMultiplicar, multiplicador);

		for (int i = 0; i < vectorMultiplicar.length; i++) {

			System.out.println(vectorMultiplicar[i]);

		}

		/*
		 * ej 4multiplicaVectorEnOtro: que recibe como par�metro un vector y un n�mero y
		 * devuelve un vector del mismo tama�o que el del par�metro con todos los
		 * valores multiplicados por el n�mero dado.
		 */

		int vectorUno[] = { 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		int vectorDos[] = vectorUno.clone();

		int num = 0;

		System.out.println("Introduzca un numero ");
		num = teclado.nextInt();

		vectorDos = multiplicaVectorEnOtro(vectorUno, num);

		for (int i = 0; i < vectorDos.length; i++) {

			System.out.println("El valor del vector dos en la posicion " + i + " es de " + vectorDos[i]);
		}

		for (int i = 0; i < vectorUno.length; i++) {

			System.out.println("El valor del vector uno en la posicion " + i + " es de " + vectorUno[i]);

		}

		/*
		 * ej5 sumaVectores: que recibe como par�metro dos vectores (se suponen del
		 * mismo tama�o) y devuelve un vector que en cada posici�n contiene la suma de
		 * los valores de los vectores pasados como par�metros para la misma posici�n.
		 */

	}

	/* EJERCICIO1 */
	public static void muestraValores(int muestraValoresVector[]) {

		for (int i = 0; i < muestraValoresVector.length; i++) {

			System.out.println("La posici�n " + i + " contiene el valor " + muestraValoresVector[i]);

		}
	}

	/* EJERCICIO2 */

	public static int devuelvePosicion(int vectorNumeros[], int numero) {

		for (int i = 0; i < vectorNumeros.length; i++) {

			if (vectorNumeros[i] == numero) {

				return i;

			}

		}

		return -1;

	}

	/* EJERCICIO3 */

	public static void multiplicarPropioVector(int vectorMultiplicar[], int numero) {

		for (int i = 0; i < vectorMultiplicar.length; i++) {

			vectorMultiplicar[i] = vectorMultiplicar[i] * numero;
		}

	}

	/* EJERCICIO4 */

	public static int[] multiplicaVectorEnOtro(int vectorUno[], int numero) {

		int vector_aux[] = new int[vectorUno.length];
		int posicion = 0;

		for (int i = 0; i < vectorUno.length; i++) {

			vector_aux[posicion] = vectorUno[i] * numero;
			posicion++;

		}

		return vector_aux;

	}
	
	/* */

}
