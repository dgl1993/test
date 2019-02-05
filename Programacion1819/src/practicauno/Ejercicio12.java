package practicauno;

import java.util.Scanner;

public class Ejercicio12 {
	
	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		
		int numero=0, numero_dos=0, posibleprimo=0, i=2;
		
		System.out.println("Introduzca un numero ");
		numero = teclado.nextInt();
		
		while(posibleprimo<numero && posibleprimo<numero_dos) {
			if(numero%posibleprimo==0 && numero_dos%posibleprimo==0) {
				while(i<=(posibleprimo/2) && posibleprimo!=0) {
					i++;
				}
				
				if(i>posibleprimo/2) {
					System.out.println(+posibleprimo+ " es primo y divide a " +numero+ " y " +numero_dos );
				}
			}
		}
		
		
		
		
		teclado.close();
	}

}
