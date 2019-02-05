package vectores;

import java.util.Scanner;

public class EjerciciosIniciales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		final int NUM = 15;

		Scanner teclado = new Scanner(System.in);

		char[] vocales = { 'a', 'e', 'i', 'o', 'u' };

		float[] vectorF1 = new float[10];

		float[] vectorF2 = new float[10];

		int[] vectorI = new int[NUM];

		float[] vectorFsuma = new float[vectorF1.length];

		for (int i = 0; i < vectorF1.length; i++) {

			System.out.println("Introduce un valor para la posicion " + i);
			vectorF1[i] = teclado.nextFloat();

		}

		vectorF2 = vectorF1.clone();

		for (int i = 0; i < vectorI.length; i++) {

			System.out.println("En la poscion  " + i + " El vector vale " + vectorI[i]);
		}

		for (int i = 0; i < vectorI.length; i++) {

			System.out.println("Introduce un multiplo de 5 para la posicion " + i);
			vectorI[i] = 5*(i+1);

		}

		for (int i = 0; i < vectorI.length; i++) {

			System.out.println("En la poscion  " + i + " El vector vale " + vectorI[i]);
		}

		if (vectorF1 == vectorF2) {

			System.out.println("Los vectores son iguales ");

		} else {

			System.out.println("Los vectores son diferentes ");

		}

		for (int i = 0; i < vectorF2.length; i++) {

			System.out.println("Introduce valor float para la posicion " + i);
			vectorF2[i] = teclado.nextFloat();
		}

		if (vectorF1 == vectorF2) {

			System.out.println("Los vectores son iguales ");

		} else {

			System.out.println("Los vectores son diferentes ");

		}

		for (int i = 0; i < vectorFsuma.length; i++) {

			vectorFsuma[i] = vectorF1[i] + vectorF2[i];
		}

		for (int i = 0; i < vectorFsuma.length; i++) {

			System.out.println("En la poscion  " + i + " El vector vale " + vectorFsuma[i]);
		}

		for (int i = 0; i < vocales.length; i++) {

			vocales[i] = Character.toUpperCase(vocales[i]);

			System.out.println(vocales[i]);

		}
		
		teclado.close();

	}
}
