package ejercicios;

public class Romboide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int numero = 10;

		for (int i = 0; i < numero; i++) {
			for (int j = numero - i; j > 0; j--) {
				System.out.print("  ");

			}
			
			for(int k=0;k<numero;k++) {
				
					System.out.print(" *");
				
			}
			
			System.out.println("");

		}

	}

}
