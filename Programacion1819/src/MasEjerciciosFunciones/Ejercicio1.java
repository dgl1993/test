/*Dise�a un m�todo menu que muestre opciones para calcular el area de un cuadrado, un
rect�ngulo, un tri�ngulo o un c�rculo y luego muestre por pantalla el resultado del c�lculo. Para
calcular el �rea de cada figura utiliza una funci�n tambi�n. Piensa bien si cada una de estas
funciones debe llevar par�metros y si debe o no devolver algo de manera que cada m�todo sea lo
m�s eficiente y legible posible.*/

package MasEjerciciosFunciones;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {

		
		Menu();

	}
	
	public static void Menu() {
		
		Scanner teclado = new Scanner(System.in);
		
		char opcion=' ';
		double base = 0, altura = 0, lado = 0, radio = 0, area_cuadrado = 0, area_triangulo = 0, area_rectangulo = 0,
		area_circulo = 0;
		
		System.out.println("Introduzca una opcion: ");
		System.out.println("\n a para cuadrado \n b para triangulo \n c para rectangulo \n d para circulo");
		opcion=teclado.next().charAt(0);
		
		if(opcion=='a') {
			
			System.out.println("Introduzca el lado ");
			lado = teclado.nextDouble();
			area_cuadrado=AreaCuadrado(lado);
			
			Imprimir(area_cuadrado);
			
		}
		
		if(opcion=='b') {
			
			System.out.println("Introduzca la base ");
			base = teclado.nextDouble();
			
			System.out.println("Introduzca la altura ");
			altura=teclado.nextDouble();
			
			area_triangulo=AreaTriangulo(base,altura);
			
			Imprimir(area_triangulo);
					
		}
		
		if(opcion=='c') {

			System.out.println("Introduzca la base ");
			base = teclado.nextDouble();
			
			System.out.println("Introduzca la altura ");
			altura=teclado.nextDouble();
			
			area_rectangulo=AreaRectangulo(base,altura);
			
			Imprimir(area_rectangulo);
					
		}
		
		
		if(opcion=='d') {
			
			System.out.println("Introduzca el radio ");
			radio=teclado.nextDouble();
			
			area_circulo=AreaCirculo(radio);
			
			Imprimir(area_circulo);
			
		}
		
		teclado.close();
		
	}

	public static double AreaCuadrado(double l) {

		double resultado = l * l;

		return resultado;

	}

	public static double AreaTriangulo(double h, double b) {

		double resultado = b * h;

		return resultado;

	}

	public static double AreaRectangulo(double b, double h) {

		double resultado = h * b;

		return resultado;
	}

	public static double AreaCirculo(double r) {

		double pi = 3.14, resultado = 0;

		resultado = pi * Math.pow(r, 2);

		return resultado;
	}

	public static void Imprimir(double i) {

		System.out.println("El area es " + i);

	}

}
