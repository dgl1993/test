package matrices;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int matriz[][] = { { 1, 2, 3 }, { 2, 1, 3 }, { 3, 1, 2 } };
		
		prueba(matriz);
		
		if(prueba(matriz)) {
			
			System.out.println (" es escalar ");
		} else {
			
			System.out.println (" no es escalar ");
		}

	}

	public static boolean prueba(int matriz[][]) {
		
		for(int i=1;i<matriz.length;i++) {
			
			if(matriz[i-1][i-1]!=matriz[i][i]) {
				
				return false;
			}
		}

			return true;
	}

}