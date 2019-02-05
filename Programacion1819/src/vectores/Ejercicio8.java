/*Crea un vector vectorDelDerecho que sea de un tamaño indicado por el usuario. Pide al usuario
que rellene dicho vector. */
package vectores;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int[] vectorDelDerecho;
		int [] vectorDelReves;

		System.out.println("Introduce un tamaño para tu vector ");
		int tamañovector = teclado.nextInt();

		vectorDelDerecho = new int[tamañovector];

		for (int i = 0; i < vectorDelDerecho.length; i++) {

			System.out.println("Introduce un valor pra la posicion " + i);
			int valor = teclado.nextInt();

			vectorDelDerecho[i] = valor;

		}

		for (int i = 0; i < vectorDelDerecho.length; i++) {

			System.out.println(vectorDelDerecho[i]);
			
			
		}
		
		System.out.println("\n");

		vectorDelReves = vectorDelDerecho.clone();
		
		for(int i=0;i<vectorDelReves.length;i++) {
			
			vectorDelReves[i]=vectorDelDerecho[vectorDelDerecho.length-1-i];
			
			System.out.println(vectorDelReves[i]);
			
		}
		System.out.println("\n");
	
		
		
		
			
		
		
		teclado.close();

	}

}
