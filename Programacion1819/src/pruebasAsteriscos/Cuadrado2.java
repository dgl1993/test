package pruebasAsteriscos;

public class Cuadrado2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
	
		for(int i=1;i<=9;i++) {
			for(int j=1;j<=9;j++) {
				
				if(i==1 || i==9 || j==1 || j==9) {
					System.out.print( "*" );
				} else {
					
					System.out.print(" ");
				}	
			}
			System.out.println();
		}

	}

}
