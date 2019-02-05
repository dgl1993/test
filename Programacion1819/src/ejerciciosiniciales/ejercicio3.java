package ejerciciosiniciales;

import ejerciciosInicialesFunciones.Entrada;

public class ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nombre = "", apellidos = "";

		System.out.println("Introduzca su nombre: ");
		nombre = Entrada.cadena();

		System.out.println("Introduzca sus apellidos: ");
		apellidos = Entrada.cadena();

		System.out.println("Tu nombre y apellidos son " + nombre + " " + apellidos);

	}

}
