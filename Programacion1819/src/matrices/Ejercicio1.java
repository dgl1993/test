/*Crea una función sumaMatriz a la que se le pase como parámetro una matriz de tipo
entero y devuelva la suma de todos los elementos de dicha matriz. */
package matrices;

public class Ejercicio1 {
	
	public static void main(String[] args) {
		
		int [] [] matriz = {{1,2,3,4},{5,6,7,8}};
		
		int suma=0;
		
		suma=sumaMatriz(matriz);
		
		System.out.println(suma);
		
	}



public static int sumaMatriz (int matriz[][]) {
	
		int suma=0;
	
		for(int i=0;i<matriz.length;i++) {
			
			for(int j=0;j<matriz[i].length;j++) {
				
				 suma=suma+matriz[i][j];
			}
		}
	
			return suma;
	
	}



public static void muestraValoresMatriz (int [][] matriz) {
	
	for(int i = 0; i<matriz.length;i++) {
		
		for(int j = 0;j<matriz[i].length;j++) {
			
			
		}
	}
	
	
	
}
}


