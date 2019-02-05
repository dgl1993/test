package ejercicios;

public class Piramide {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero=16;
		
		
		for(int i=1;i<=numero;i+=2) {
			for(int j=1;j<numero-i;j+=2) {
				
				System.out.print(" ");
				
			}
				for(int k=1;k<=i;k++) {
					
					System.out.print("*");
				}
				
				System.out.println();
			}
			
		
		}
		
	}


