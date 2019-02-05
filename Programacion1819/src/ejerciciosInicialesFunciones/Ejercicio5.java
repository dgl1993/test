package ejerciciosInicialesFunciones;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner teclado = new Scanner(System.in);
		int numero = 0;

		System.out.println("Introduzca un numero: ");
		numero = teclado.nextInt();
		teclado.close();

		numero = Doble(numero);

		System.out.println("El doble es " +numero);
	}

	public static int Doble(int n) {

		int operacion = n * 2;

		return operacion;

	}

	

}
