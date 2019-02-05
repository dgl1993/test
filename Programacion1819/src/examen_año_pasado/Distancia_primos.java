package examen_año_pasado;

import java.util.Scanner;

public class Distancia_primos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);

		int menor=0,mayor=0,primo1=0,primo2=0,distancia=0, div=0,primoDefinitivo1=0, primoDefinitivo2=0;

		boolean esprimo=false;
		
		System.out.println("Introduce el menor numero del rango ");
		menor = teclado.nextInt();

		System.out.println("Introduce el mayor numero del rango ");
		mayor = teclado.nextInt();
	
		//SACO EL PRIMER NMERO PRIMO DE RANGO INTRODUCIDO
		
		while(!esprimo) {
			
			
			div=2;
			while(menor%div!=0 && div<=(menor/2)) 
				
				div++;
				if(menor%div!=0) {
					
					esprimo=true;
					primo1=menor;
				}
				
				menor++;
			
		}

		for(int num=menor;num<=mayor;num++) {
			
			div=2;
			while(num%div!=0 && div<=(num/2)) 
				
				div++;
				
				if(num%div!=0) {
					
					primo2=num;
					
					if((primo2-primo1-1)>distancia) {
						
						distancia=primo2-primo1-1;
						primoDefinitivo1=primo1;
						primoDefinitivo2=primo2;
						
					}
					
					primo1=primo2;
				}
			
			
			
		}
		
		System.out.println("La mayor distancia entre dos primos es " +distancia+ " y esta entre " +primoDefinitivo1+ " y " +primoDefinitivo2);
		teclado.close();

	}

}
