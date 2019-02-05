package ejerciciosiniciales;

import ejerciciosInicialesFunciones.Entrada;

public class ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final double PI = 3.14;

		double radio = 0.0, area = 0.0, perimetro = 0.0, radio_cuadrado = 0.0;

		System.out.println("Introduzca el area del circulo ");
		radio = Entrada.real();

		radio_cuadrado = Math.pow(radio, 2);

		area = PI * radio_cuadrado;

		perimetro = (2 * PI) * radio;

		System.out.println("El area del circulo es igual a " + area + " y el perimetro es igual a " + perimetro);
		
	}

}
