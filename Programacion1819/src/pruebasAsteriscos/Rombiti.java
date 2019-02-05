package pruebasAsteriscos;

public class Rombiti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int numero=8;
	
		
		for (int i=0;i<=numero;i++) {
			for(int j=numero-i;j>0;j--) {
				
					System.out.print(" ");
				
					
					
				}
			
					for(int k=0;k<i;k++) {
						
						System.out.print(" *");
					}
				
					System.out.println();
			
			}
		
		
			for(int i=0;i<=numero;i++) {
				for(int j=0;j<=i;j++) {
					
					System.out.print(" ");
				}
				
				for(int k=numero-i-1;k>0;k--) {
					System.out.print(" *");
				}
				
				System.out.println();
			}
			
			
		}
		
	}


