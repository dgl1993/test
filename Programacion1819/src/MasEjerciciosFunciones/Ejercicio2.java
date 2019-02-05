/*Diseña un método numerosPrimosGemelos que reciba como parámetro un número n e
imprima por pantalla las n primeras tuplas de primos gemelos. Por ejemplo, si el número
introducido es el 5, el método devolverá:
Las 5 primeras tuplas de números primos gemelos son:
(3,5) (5,7) (11,13) (17,19) (29,31) */

package MasEjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int numero = 0;

		System.out.println("introduzca un numero ");
		numero = teclado.nextInt();

		tuplas(numero);
	}
	
	public static void tuplas(int n) {
		
		int i=0,primo1=1, primo2=2;
		
		while(n<i) {
			
			if((primo2-primo1)==2) {
			
				i++;
				System.out.println(+primo1+ "," +primo2);
				
			} 
				
				primo1=primo2;
				primo2=SiguientePrimo(primo2);
			
		}
		
		
	}

	public static boolean EsPrimo(int n) {

		boolean esprimo = true;

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {

				return false;
			}

		}

		return true;

	}

	public static int SiguientePrimo(int n) {

		boolean noprimo = true;
		n = n + 1;
		while (noprimo) {

			if (EsPrimo(n)) {

				noprimo = false;

			} else {

				n++;
			}

		}
	
		return n;

	}

}
