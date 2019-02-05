/*3. Ídem una versión que calcule el máximo de 3 números y lo devuelva.*/

package ejerciciosInicialesFunciones;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int numeroA = 0, numeroB = 0, numeroC = 0, maximo=0;

		System.out.println("Introduce un numero ");
		numeroA = teclado.nextInt();

		System.out.println("Introduce otro numero ");
		numeroB = teclado.nextInt();

		System.out.println("Introduce otro numero ");
		numeroC = teclado.nextInt();

		teclado.close();

		maximo=maximo(numeroA, numeroB, numeroC);
		
		System.out.println("El numero maximo es " +maximo);

	}

	public static int maximo(int a, int b, int c) {

		if (a > b && a > c) {

			return a;

		} else {

			if (b > a && b > c) {

				return b;

			} else {

				return c;
			}

		}
	}
	
	
	

}
