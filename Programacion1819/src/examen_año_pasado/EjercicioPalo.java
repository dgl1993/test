package examen_año_pasado;

import java.util.Scanner;

public class EjercicioPalo {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		final int NUMERO_CARTA=2;
		final String PALO_CARTA="oros";
		
		int intentos=3,numero=0;
		String palo="";
		boolean acierto=false;
		
		System.out.println("Generando Carta... ");
		System.out.println("YA! EMPIEZA EL JUEGO, ADIVINA MI CARTA!");
		
		while(intentos!=0 && !acierto) {
			
			System.out.println("Te quedan " +intentos+ " intentos");
			System.out.println("Introduce el número de la carta: ");
			numero=teclado.nextInt();
			System.out.println("Introduce el palo ");
			palo = teclado.next();
			
			
			if((numero!=NUMERO_CARTA) || (!palo.equals(PALO_CARTA))) {
				
				System.out.println("FALLASTE!");
				intentos--;
			}
		
			
			if(numero==NUMERO_CARTA && palo.equals(PALO_CARTA)) {
				acierto=true;
				System.out.println("MUY BIEN! ACERTASTE!");
			}
			
		}
		
		if(!acierto) {
			
		
			System.out.println("La carta era el " +NUMERO_CARTA+ " de " +PALO_CARTA );
		}
			teclado.close();
	}

}
