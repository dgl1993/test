package matrices;

import java.util.Scanner;

public class Corredores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		float tiempos[][] = new float[2][5];

		int corredor = 0;

		int puntos[] = new int[2];
		
		
	
		System.out.println("Introduce para que corredor quieres introducir los tiempos 1 o 2 ");
		corredor = teclado.nextInt();
		
		pideTiempos(tiempos,corredor);
		
		System.out.println("Introduce para que corredor quieres introducir los tiempos 1 o 2 ");
		corredor = teclado.nextInt();
		
		pideTiempos(tiempos,corredor);
		puntos=calculaPuntos(tiempos);
		
		for(int i=0;i<puntos.length;i++) {
			
			System.out.println(puntos[i]);
			if(puntos[0] > puntos[1]) {
				
				System.out.println("El ganador es  el corredor uno con " +puntos[0]+ " puntos");
			} 
			
			if(puntos[0] < puntos[1]) {
				
				System.out.println("El ganador es el corredor dos con " +puntos[1]+ " puntos");
			}
			
			
		}
		
		
	}

	public static void pideTiempos(float tiempos[][], int corredor) {

		Scanner teclado = new Scanner(System.in);

		if (corredor == 1) {

			for (int i = 0; i < 1; i++) {
				for (int j = 0; j < 5; j++) {

					System.out.println("Introduce el tiempo para el corredor 1 en la carrera " + j);
					tiempos[i][j] = teclado.nextFloat();
				}
			}
		}

		if (corredor == 2) {

			for (int i = 1; i < 2; i++) {
				for (int j = 0; j < 5; j++) {

					System.out.println("Introduce el tiempo para el corredor 2 en la carrera " + j);
					tiempos[i][j] = teclado.nextFloat();
				}
			}
		}

	}
	
	public static int[] calculaPuntos (float tiempos[][]) {
		
		int puntos [] = new int [2], puntosc1=0, puntosc2=0;
		
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<tiempos[i].length;j++) {
				
				
				
				if(tiempos[0][j] < tiempos[1][j]) {
					puntos[0]+=3;
					puntos[1]+=1;					
				}
				
				if(tiempos[1][j] < tiempos[0][j]) {
					puntos[0]+=3;
					puntos[1]+=1;
					
				}
				
				if(tiempos[1][j]==tiempos[0][j]) {
					puntos[0]+=2;
					puntos[1]+=2;
					
				}
			}
		}
		

		
		return puntos;
		
	}

	
	public static int corredorConMenorTiempo(float tiempos[][]) {
		
		float tiempoc1=0, tiempoc2=0;
		int ganador=0;
		
		for(int i=0;i<2;i++) {
			for(int j=0;j<5;j++) {
				
				tiempoc1=tiempoc1+tiempos[0][j];
				tiempoc2=tiempoc2+tiempos[1][j];
				
		
			}
		}
		
		if(tiempoc1 > tiempoc2) {
			ganador=2;
		} 
		
		if(tiempoc2 > tiempoc1) {
			ganador=1;
		}
		
		return ganador;
	}
}
