package pruebasAsteriscos;

public class PruebaArbolito {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n=10;
		
		n=n*2-1;
		
		for(int i=1;i<=n;i+=2) {
			for(int j=1;j<n-i;j+=2) {
				
				System.out.print(" ");
				
			}
				
				for(int k=1; k<=i; k++) {
					
					System.out.print("*");
				}
			
			
			System.out.println();
		}
		
		for(int l=1; l<=2; l++) {
			
			System.out.println("        ***");
		}

	}

}
