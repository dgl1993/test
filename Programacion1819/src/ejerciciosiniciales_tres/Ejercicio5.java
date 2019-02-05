/*Escribe un algoritmo que muestre por pantalla la multiplicación de los números desde el 1 hasta el 20. */
package ejerciciosiniciales_tres;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador=1, acumulador=1;
		
		while(contador<=20) {
			
			acumulador=acumulador*contador;
			contador++;
			
		}
		
		System.out.println(+acumulador);

	}

}
