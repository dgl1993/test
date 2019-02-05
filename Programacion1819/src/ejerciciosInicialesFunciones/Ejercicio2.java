/*Diseñar una función que tenga como parámetros dos números, y que devuelva el máximo.*/

package ejerciciosInicialesFunciones;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		int numeroA=0, numeroB=0,maximo=0;
		
		System.out.println("Introduce un numero ");
		numeroA=teclado.nextInt();
		
		System.out.println("Introduce otro numero ");
		numeroB=teclado.nextInt();
		
		teclado.close();
		
		maximo=maximo(numeroA,numeroB);
		
		System.out.println("El numero maximo es " +maximo);
		
	}
	
	
	public static int maximo (int a, int b) {
		
		
		if(a>b) {
			
			return a;
			
		} else {
			
			
			return b;
			
			
		}
		
		
	}
	

}
