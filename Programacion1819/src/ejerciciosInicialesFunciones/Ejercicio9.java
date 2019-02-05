package ejerciciosInicialesFunciones;

import java.util.Scanner;

public class Ejercicio9 {

		public static void main(String[] args) {
			Scanner teclado = new Scanner(System.in);
			
			int numero1=0, numero2=0, numero3=0, mcd=0;

			System.out.println("Introduzca un primer numero ");
			numero1=teclado.nextInt();
			
			System.out.println("Introduzca un segundo numero ");
			numero2=teclado.nextInt();
			
			System.out.println("Introduzca el tercer numero");
			numero3=teclado.nextInt();
			
			teclado.close();
			
			mcd=mcd(numero1,numero2,numero3);
			imprimirmcd(mcd);
			
			
		}	
		
public static int mcd(int a, int b, int c) {
	
	int mcd=0;
	
	
	for(int i=1;i<=a && i<=b && i<=c;i++) {
		
		if(a%i==0 && b%i==0 && c%i==0) {
			
			mcd=i;
			

		}
	}
	
					

	return mcd;
	
	}


public static void imprimirmcd(int imp) {
	
	System.out.println("El mcd de los numeros introducidos es " +imp);
	
}
	
	
	
}
		
		

