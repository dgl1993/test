package ejercicios;

public class Cuadrado2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int numero=9;
	
		for(int i=1;i<=numero;i++) {
			for(int j=1;j<=numero;j++) {
				
				if(i==1 || i==numero || j==1 || j==numero) {
					System.out.print("*");
				} else {
					
					System.out.print(" ");
				}	
			}
			System.out.println();
		}

	}

}
