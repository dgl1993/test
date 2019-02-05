
package vectores;

import java.util.Scanner;

public class ejemplovectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner teclado = new Scanner(System.in);
		
		//declarar vector// //tamaño vector//
		
		int [] vector1	=     new int [5];
		
		//inciializado// 
		
		int [] vector2 =  {5,2,-1,4,7};
		
		//pedir y guardar  valor vecto1 usuario// 
		
		System.out.println("Introduce valor 0 ");
		vector1[0]=teclado.nextInt();
		
		//pedir y guardar los valores segun la longitud del vector//
		
		for(int i=0;i<vector1.length;i++) {
			
			System.out.println("Dame un valor para la posicion " +i);
			vector1[i]=teclado.nextInt();
		}
		
		//mostrar arrays//
		
		for(int i=0;i<vector1.length;i++) {
			
			System.out.println("En la poscion  " +i+ " El vector vale " +vector1[i]);
		}
		
		//asignacion//
		
		vector1=vector2;
		
		System.out.println("Los datos del vector 1 son");
		for(int i=0;i<vector1.length;i++) {
			
			System.out.println("En la poscion  " +i+ " El vector vale " +vector1[i]);
		}
		
		vector1[0]=2;
		
		System.out.println("Los datos del vector 2 son");
		for(int i=0;i<vector2.length;i++) {
			
			System.out.println("En la poscion  " +i+ " El vector vale " +vector1[i]);
		}
		
		
		
		//clonar//
		
		vector1=vector2.clone();
		
		System.out.println("Los datos del vector 1 son");
		for(int i=0;i<vector1.length;i++) {
			
			System.out.println("En la poscion  " +i+ " El vector vale " +vector1[i]);
		}
		
		vector2[0]=2;
		
		System.out.println("Los datos del vector 2 son");
		for(int i=0;i<vector2.length;i++) {
			
			System.out.println("En la poscion  " +i+ " El vector vale " +vector2[i]);
		} 
		
		
		//comparar vectores// 
		
		vector1=vector2; //con este son iguales// 
		
		vector1=vector2.clone(); // con este son diferentes//
		
		//CON EL PUNTO EQUALS SE COMPARAN VECTORES COMPLETOS//
		
		if(vector1.equals(vector2)) {
			
			System.out.println("Los vectores son igualess  ");
			
		} else {
			
			System.out.println("Los vectores son diferentes ");
		}
		
		//comparar contenido de posiciones// 
		
		if(vector1[2]==vector2[3]) {
			
		}
		
		//comparar array strings// 
		
	//	if(vector1[2].compareTo(vector2[3])==0) {
			
		//}
		
		teclado.close();
	}

}
