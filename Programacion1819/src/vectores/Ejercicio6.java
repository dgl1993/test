/* Crea un vector numerosSinRepetir de 10 posiciones que guarde valores aleatorios entre 1 y 50 en
el que los valores no estén repetidos.*/

package vectores;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int aleatorio=0, j=0;
		boolean encontrado;

		int[] numerosSinRepetir = new int[10];

		for (int i = 0; i < numerosSinRepetir.length; i++) {
			
			encontrado=true;

			 aleatorio = (int) ((Math.random() * 10) + 1);
			 
			 while(!encontrado && j<i) {
				 
				 if(numerosSinRepetir[j]==aleatorio) {
					 encontrado=true;
					 j++;
				 }
			 }
			 
			 if(!encontrado) {
				 
				 numerosSinRepetir[i]=aleatorio;
				 i++;
			 }
			 
			 for(int k=0;k<numerosSinRepetir.length;k++) {
					
					System.out.println(numerosSinRepetir[k]);
				}
			
		}
		
		

		

	}
}

