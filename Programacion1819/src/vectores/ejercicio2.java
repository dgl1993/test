/*Genera un vector vectorInicial de 10 posiciones, pide al usuario que introduzca números entre 1 y
20 en dicho vector hasta completarlo (pueden ser repetidos). Crea dos vectores vectorPares y
vectorImpares que almacenen los valores pares e impares respectivamente del vector inicial.
Luego muestra ambos vectores por pantalla.*/

package vectores;

import java.util.Scanner;

public class ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int pares=0,posvectorpar=0;
		
		int impares=0, posvectorimpar=0;

		int[] vectorInicial = new int[10];

		int[] vectorPares;

		int[] vectorImpares;

		for (int i = 0; i < vectorInicial.length; i++) {

			System.out.println("Dame un valor para la posicion " + i + " entre 1 y 20 ");
			int num = teclado.nextInt();

			vectorInicial[i] = num;
		}
		
		for(int i=0;i < vectorInicial.length;i++) {
			
			if(vectorInicial[i]%2==0) {
				
				pares++;
				
			} else {
				
				impares++;
			}
			
		}
		
		
		//Vectores con el tamaño de los numeros pares e impares que haya// 
		vectorPares=new int [pares];
		vectorImpares=new int [impares];
		
		for(int i=0;i<vectorInicial.length;i++) {
			
			if(vectorInicial[i]%2==0) {
				
				//posicion a parte de i para el vector par // 
				vectorPares[posvectorpar]=vectorInicial[i];
				posvectorpar++;
				
			} else {
				
				//posicion a parte de i para el vector impar//
				vectorImpares[posvectorimpar]=vectorInicial[i];
				posvectorimpar++;
			}
			
			
			
		}
		
		System.out.println("Los pares son ");
		for(int i=0;i<vectorPares.length;i++) {
			
			
			
			System.out.println(vectorPares[i]);
			
		}
		
		
		System.out.println("Los impares son ");	
	for(int i=0;i<vectorImpares.length;i++) {
		
		
			
			System.out.println(vectorImpares[i]);
		}

		
		
		teclado.close();

	}

}
