package ejerciciosiniciales;

import ejerciciosInicialesFunciones.Entrada;

public class ejercicio10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String nombre="";
		int edad;
		
		System.out.println("Introduzca su nombre ");
		nombre = Entrada.cadena();
		
		System.out.println("Introduzca su edad ");
		edad = Entrada.entero();
		
		System.out.println("Hola " +nombre+ " tienes " +edad+ " años, ¡que mayor eres!");

	}

}
