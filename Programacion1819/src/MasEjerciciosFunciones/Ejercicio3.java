package MasEjerciciosFunciones;

import java.util.Scanner;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int num=0; 
		String fig=" ";

	}
	
	public static void GeneradorFiguras(int numero, String figura) {
		
		if(figura.equals("cuadrado lleno")) {
			
			for(int i=1;i<=numero;i++) {
				for(int j=1;j<=numero;j++) {
					
					System.out.print("*");
				}
				
				System.out.println(" ");
			}
			
		}
		
		if(figura.equals("cuadrado vacio")) {
			
		}
		
	
		
	
	}
	
	public static void CuadradoLLeno(int numero) {
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduzca un numero ");
		numero=teclado.nextInt();
	
	}

}
