/*Crea una función esMatrizCuadrada que se le pase como parámetro una matriz y
devuelva cierto si la matriz es cuadrada o falso si no lo es. Una matriz es cuadrada
cuando el número de filas es igual al número de columnas. */

package matrices;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int  cuadrada [] [] = {{1,2,3},
							   {6,7}};
		
		if(esMatrizCuadrada(cuadrada)) {
			
			System.out.println("La matriz es cuadrada ");
		} else {
			
			System.out.println(" La matriz no es cuadrada ");
		}
		
		
		

	}
	
	
	public static boolean esMatrizCuadrada (int cuadrada[][]) {
		
		int acumulador=0;
		for(int i=0;i<cuadrada.length;i++) {
			if(cuadrada.length!=cuadrada[i].length) {
				
				return false;
			}
				
		}
		
		return true;
		
		
	}

}
