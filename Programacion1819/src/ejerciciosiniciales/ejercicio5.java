package ejerciciosiniciales;

import ejerciciosInicialesFunciones.Entrada;

public class ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero_uno, numero_dos;

		System.out.println("Introduzca el primer numero ");
		numero_uno = Entrada.entero();

		System.out.println("Introduzca el segundo numero ");
		numero_dos = Entrada.entero();

		System.out.println("El cociente de los numeros es " + numero_uno / +numero_dos);
		System.out.println("El resto de los numeros es " + numero_uno % +numero_dos);

	}

}
