package ejerciciosiniciales_dos;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		double nota=0.0;
		
		System.out.println("Introduce la nota ");
		nota = teclado.nextDouble();
		
		if(nota>=0 && nota<5) {
			
			System.out.println("Tu nota " +nota+ " es insuficiente");
		}
		
		if(nota>=5 && nota<6) {
			
			System.out.println("Tu nota " +nota+ " es suficiente");
		}
		
		if(nota>=6 && nota<7) {
			
			System.out.println("Tu nota " +nota+ " es bien");
		}
		
		if(nota>=7 && nota<9) {
			
			System.out.println("Tu nota " +nota+ " es notable");
		}
		
		if(nota>=9 && nota<=10) {
			
			System.out.println("Tu nota " +nota+ " es sobresaliente");
			
		}
		
		teclado.close();
		
	}

}
