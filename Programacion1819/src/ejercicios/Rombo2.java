package ejercicios;

public class Rombo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero=10;
		
		for(int i=0; i<numero; ++i) {
			System.out.println();
			for(int j=0;j<numero-i-1;++j) {
				
				System.out.print(" ");
				
			}
			
			for(int k=0;k<2*i+1;++k) {
				
				System.out.print("*");
			}
		}

			for(int j=numero-2;j>=0;--j) {
				
				System.out.println();
				
				for(int i=0;i<numero-j-1;++i) {
					System.out.print(" ");
					
				}
					
					for(int k=0;k<2*j+1;++k) {
						
						System.out.print("*");
					}
				}
				
				System.out.println();
			}
	}


