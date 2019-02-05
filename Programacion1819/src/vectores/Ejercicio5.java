/*Crea un vector numerosPositivos de 10 posiciones y pide al usuario que los rellene con valores
entre 1 y 20. Muestra por pantalla la suma de los números que están en las posiciones pares por un
lado y la suma de los números que están en las posiciones impares por otro.*/

package vectores;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int sumapares=0, sumaimpares=0;
		
		int [] numerosPositivos = new int [10];
		
		for(int i=0; i<numerosPositivos.length;i++) {
			
			System.out.println("Introduce un numero entre 1 y 20 ");
			numerosPositivos[i]=teclado.nextInt();
			
		}
		
		for(int i=0;i<numerosPositivos.length;i++) {
			
			if(i%2==0) {
				
				sumapares=sumapares+numerosPositivos[i];
				
			}
			
			
		}
		
		for(int i=0;i<numerosPositivos.length;i++) {
			
			if(i%2!=0) {
				
				sumaimpares=sumaimpares+numerosPositivos[i];
			}
			
			
		}
		
		System.out.println("La suma de pares es " +sumapares);
		System.out.println("La suma de impares es " +sumaimpares);
		teclado.close();
	}

}
