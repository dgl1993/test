package masejerciciosjava;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			Scanner teclado = new Scanner(System.in);
			
			final int MAYUSCULA=32;
		
			char letra=' ';
			byte letra_ascii=0;
							
			
			System.out.println("Intoduzca una letra ");
			letra=teclado.next().charAt(0);
			
			letra_ascii=(byte)(letra-MAYUSCULA);
			
			letra=(char)letra_ascii;
			
			System.out.println(letra);		
			
			teclado.close();
			
			
	}
	


}
