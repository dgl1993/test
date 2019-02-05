/*7. Escribe un algoritmo y su correspondiente código en JAVA que le pida un número al usuario e imprima la
cantidad de cada uno de esos dígitos que hay en el número.*/

package ejerciciosJAVA;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int cuenta_cero = 0, cuenta_uno = 0, cuenta_dos = 0, cuenta_tres = 0, cuenta_cuatro = 0, cuenta_cinco = 0,
				cuenta_seis = 0, cuenta_siete = 0, cuenta_ocho = 0, cuenta_nueve = 0, acumulador = 0;

		long numero = 0;

		System.out.println("Introduzca un numero: ");
		numero = teclado.nextLong();

		while(numero!=0) {
		

			acumulador = Math.round(numero) % 10;
			numero = Math.round(numero) / 10;
			
			
			
			switch(acumulador) {
				
			case 0:
				
				cuenta_cero++;
				
			break;
			
			case 1:
				
				cuenta_uno++;
				
			break;

			case 2:
				
				cuenta_dos++;
				
			break;
			
			case 3:
				
				cuenta_tres++;
				
			break;
			
			case 4:
				
				cuenta_cuatro++;
				
			break;
			
			case 5:
				
				cuenta_cinco++;
				
			break;
			
			case 6:
				
				cuenta_seis++;
				
			break;
			
			case 7:
				
				cuenta_siete++;
				
			break;
			
			case 8:
				
				cuenta_ocho++;
				
			break;
			
			case 9:
				
				cuenta_nueve++;
				
			break;
			
			
			}
			

		}	
		
		
			System.out.println("Hay " +cuenta_cero+ " ceros");
			System.out.println("Hay " +cuenta_uno+ " unos");
			System.out.println("Hay " +cuenta_dos+ " dos");
			System.out.println("Hay " +cuenta_tres+ " tres");
			System.out.println("Hay " +cuenta_cuatro+ " cuatros");
			System.out.println("Hay " +cuenta_cinco+ " cincos");
			System.out.println("Hay " +cuenta_seis+ " seis");
			System.out.println("Hay " +cuenta_siete+ " sietes");
			System.out.println("Hay " +cuenta_ocho+ " ochos");
			System.out.println("Hay " +cuenta_nueve+ " nueves");
			
			teclado.close();

		
	}
}
