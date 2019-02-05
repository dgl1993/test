/*Escribe un algoritmo que vaya pidiendo al usuario caracteres y los vaya imprimiendo. El algoritmo repetirá estas
acciones mientras el usuario escriba consonantes. Suponemos que el usuario siempre va a escribir letras en minúscula.
(Haz una traza en la que el usuario escribe las letras ‘c’ ‘d’ ‘z’ ‘a’) */ 
package practicauno;

/*Escribe un algoritmo que vaya pidiendo al usuario caracteres y los vaya imprimiendo. El algoritmo repetirá estas
acciones mientras el usuario escriba consonantes. Suponemos que el usuario siempre va a escribir letras en minúscula.
(Haz una traza en la que el usuario escribe las letras ‘c’ ‘d’ ‘z’ ‘a’) */
import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		char letra=' ';
		
		while(letra!='a' && letra!='e' && letra!='i' && letra!='o' && letra!='u') {
			
			System.out.println("Introduce una letra ");
			letra = teclado.next().charAt(0);
			
			System.out.println("La letra es " +letra);
		}
		
		
		
		
		teclado.close();

	}

}
