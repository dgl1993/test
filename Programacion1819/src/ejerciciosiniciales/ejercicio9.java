package ejerciciosiniciales;

import ejerciciosInicialesFunciones.Entrada;

public class ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero; 
		
		System.out.println("Introduzca un numero: ");
		numero = Entrada.entero();
		
		System.out.println("El numero vale " +numero);
		numero++;
		
		System.out.println("El numero vale " +numero);
		
		numero=numero+2;
		
		System.out.println("El numero finalmente vale " +numero);
		
	}

}
