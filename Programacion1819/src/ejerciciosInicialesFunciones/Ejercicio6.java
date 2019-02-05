package ejerciciosInicialesFunciones;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		
		double altura=0,radio=0,total=0;
		
		char caracter=' ';
		
		System.out.println("Introduzca la altura del cilindro: ");
		altura=teclado.nextDouble();
		
		System.out.println("Introduzca el radio del cilindro: ");
		radio=teclado.nextDouble();
		
		System.out.println("Introduzca v para el volumen o a para el area ");
		caracter=teclado.next().charAt(0);
		
		total=Area_Volumen(altura,radio,caracter);
		
		
		if(caracter=='a') {
			
		System.out.println("El area es " +total);
		
		}
		
		if(caracter=='v') {
			
			System.out.println("El volumen es " +total);	
		}
		
		
		teclado.close();
		

	}

	public static double Area_Volumen(double h, double r, char caracter) {

		double resultado = 0;
		double pi = 3.14;
		
		if(caracter=='a') {
		

		resultado = 2 * pi * r * (r + h);
		

		
		}
		
		
		if(caracter=='v') {
			
			resultado= pi*Math.pow(r, 2)*h;
		}
		
		
		return resultado;
	}
	
	
	
}
