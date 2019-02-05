package masejerciciosjava;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);
		
		int maximo=0, minimo=0, num_aleatorio=0, num_anterior=0;
		
		System.out.println("Introduzca un numero maximo ");
		maximo=teclado.nextInt();
		
		System.out.println("Introduzca un numero minimo ");
		minimo=teclado.nextInt();
		
		num_aleatorio=(int)(Math.random()*maximo-minimo)+minimo;//GENERO EL PRIMER NUMERO ALEATORIO// 
		
		num_anterior=maximo+1; //NUMERO ANTERIOR MAXIMO +1// 

		while(num_aleatorio>minimo) { //MIENTRAS QUE EL NUMERO ALEATORIO SEA MENOR QUE EL MINIMO// 
			
			num_aleatorio=(int)(Math.random()*maximo-minimo)+minimo; //GENERO NUMERO// 
			
			
			
			if(num_aleatorio < num_anterior) { //SI EL NUMERO ALEATORIO ES MENOR QUE MAXIMO +1 EN LA PRIMERA VEZ// 
				
				System.out.println(num_aleatorio); //IMPRIME NUM_ALEATORIO// 
				num_anterior=num_aleatorio; //IGUALO EL NUMERO ANTERIOR A EL ALEATORIO/
				
			}
					
			
		}
		
		
	
		
		
		teclado.close();
	}

}
