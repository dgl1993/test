package masejerciciosjava;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int num1 = 0, num2 = 0, acumulador = 1;

		boolean acierto = false;

		System.out.println("Introduzca el num1 ");
		num1 = teclado.nextInt();

		System.out.println("Introduzca el num2");
		num2 = teclado.nextInt();


		while(num2>0 && num1>9 && !acierto) {
			
		
		acumulador=num2%100;
		num2=num2/10;
			
			if(num1==acumulador) {
				
				System.out.println("VERDADERO!!");
				acierto=true;
			}
			
		
		}
		
		
		
		while(num2>0 && num1<10 && !acierto) {
			
			
		acumulador=num2%10;
		num2=num2/10;
			
			if(num1==acumulador) {
				
				System.out.println("VERDADERO!!");
				acierto=true;
				
			} 
		
		}
		
		if(!acierto) {
			
			System.out.println("FALSO!!");
		}
		
		teclado.close();
	}

}
