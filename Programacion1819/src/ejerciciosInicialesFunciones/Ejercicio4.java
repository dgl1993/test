/*4. Función a la que se le pasan dos enteros y muestra todos los números comprendidos entre
ellos,inclusive.*/

package ejerciciosInicialesFunciones;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int numeroA=0, numeroB=0;
		
		System.out.println("Introduce el primer numero ");
		numeroA=teclado.nextInt();
		
		System.out.println("Introduce el segundo numero ");
		numeroB=teclado.nextInt();
		
		Rango(numeroA, numeroB);
		
		teclado.close();
		
		

	}
	
	public static void Rango (int a, int b) {
		
		
		while (a<=b) {
			System.out.println("Numero: " +a);
			a++;
		}
		
	}

}
