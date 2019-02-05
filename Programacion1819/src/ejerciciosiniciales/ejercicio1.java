package ejerciciosiniciales;

import ejerciciosInicialesFunciones.Entrada;

public class ejercicio1 {
	
	public static void main(String[] args) {
		
		
		int numero;

		System.out.println("Introduzca un numero: ");
		numero = Entrada.entero();

		System.out.println("El doble es: " + numero * 2);
		System.out.println("El triple es: " + numero * 3);

	}
}
