/*Escribe una función recursiva sumarDigitos(entero num) que devuelva la suma de los
dígitos del número pasado como parámetro. Por ejemplo, si el número es 1592, devuelva el
número 1+5+9+2=17. */

package recursividad;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		int numero; 
		System.out.println("Introduce un numero");
		numero=teclado.nextInt(); 
		
		
		System.out.println(sumarDigitos(numero));
		
		teclado.close();
			
	}
	
	public static int sumarDigitos(int num) {
		
		
		if(num<10) {
			
			return num;
			
		} else {
			
			return  (num%10 + sumarDigitos(num/10));
			
		}
		
		
	}

}
