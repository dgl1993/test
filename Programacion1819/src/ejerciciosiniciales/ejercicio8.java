package ejerciciosiniciales;

import ejerciciosInicialesFunciones.Entrada;

public class ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero, cubo, cuadrado;

		System.out.println("Introduzca un numero ");
		numero = Entrada.entero();

		cuadrado = (int) Math.pow(numero, 2);
		cubo = (int) Math.pow(numero, 3);

		System.out.println("El numero es " + numero);
		System.out.println("El numero " + numero + " elevado a 2 es " + cuadrado);
		System.out.println("El numero " + numero + " elevado a 3 es " + cubo);

	}

}
