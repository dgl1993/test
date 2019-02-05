package cadenas;

import java.util.Scanner;

public class EjerciciosCadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String correo = CorreoCompleto();

		System.out.println("Tu correo es " +correo);
		
		int vocales=vocales(correo);
		
		System.out.println("Hay "+vocales+ " vocales en tu correo");

		guiones(correo);
	}

	// EJ1// 
	public static String CorreoCompleto() {

		Scanner teclado = new Scanner(System.in);

		System.out.println("Introduzca un nombre para el correo ");
		String nombre = teclado.nextLine();
		

		System.out.println("Introduzca un dominio ");
		String dominio = teclado.nextLine();
		

		System.out.println("Introduzca un TPL ");
		String tpl = teclado.nextLine();
		

		String arroba = new String("@");
		String punto = new String(".");

		String Correocompleto = nombre.trim().concat(arroba.trim()).concat(dominio.trim()).concat(punto.trim()).concat(tpl.trim());

		return Correocompleto.toLowerCase();

	}

	
	//EJ2//
	public static int vocales(String correo) {
	
		int vocales=0;
		
		char [] correos = correo.toCharArray();
		
		for(int i=0;i<correos.length;i++) {
			
			if(correos[i]=='a' || correos[i]=='e' || correos[i]=='i' || correos[i]=='o' || correos[i]=='u') {
				
				vocales++;
			}
		}
		
		return vocales;
	}
	
	//EJ3//
	public static void guiones (String correo) {
		
		char [] correos = correo.toCharArray();
		
		for(int i=0;i<correos.length;i++) {
			
			System.out.print(correos[i]+ "-");
			
		}
		
	}
	
	public static void cambiovocales (String correo) {
		
		
	}

}

