/*. Genera un vector de 10 posiciones vectorAleatorio que guarde valores aleatorios entre 1 y 20
(pueden ser repetidos). Luego muestra por pantalla cuantos números pares y cuantos números
impares hay en dicho vector (imprime el vector por pantalla también para comprobarlo).*/


package vectores;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
	
		int [] vectorAleatorio  = new int[10];
		
		int pares=0;
		
		int impares=0;
		
		for(int i=0;i<vectorAleatorio.length;i++) {
			
			vectorAleatorio[i]=(int) (Math.random()*20+1);
		}
		
		
		for(int i=0;i<vectorAleatorio.length;i++) {
			
			if(vectorAleatorio[i]%2==0) {
				
				pares++;	
				
			} else {
				
				impares++;
			}
			
			
		}
		
		for(int i=0;i<vectorAleatorio.length;i++) {
			
			System.out.println(vectorAleatorio[i]);
		}
		
		
		System.out.println("Hay " +pares+ " numeros pares");
		
		System.out.println("Hay " +impares+ " numeros impares");
		
		teclado.close();

	}

}
