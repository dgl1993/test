package recursividad;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Introduce un numero ");
		int num=teclado.nextInt();
		
		
		
		System.out.println(invertir(num,3));
		
		
	}

	
	public static int invertir(int num, int pos) {
		
		 if (num<10) {       
		  return num;
		 }
		 else {
			
		  return  (num % 10) * (int) Math.pow(10, pos) + (invertir(num/10, pos-1));
		  
		 }
		 
		}
}
