/*Escribe un algoritmo que muestre por pantalla la suma de los números desde el 1 hasta el 20.*/
package ejerciciosiniciales_tres;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int posicion=1, numero=0;
		
		while(posicion<20) {
			
			numero=numero+posicion;
			posicion++;
			numero++;
		}
		
		System.out.println("La suma total es " +numero);

	}

}
