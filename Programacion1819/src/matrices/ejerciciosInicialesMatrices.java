

package matrices;

public class ejerciciosInicialesMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] mat1= {{3,5,7},
					   {1,-1,9},	
				       {3,3,3}};
		
		int[][] matIdent= {{1,0,0},
						   {0,1,0},	
			               {0,0,1}};
		
		int[][]mat2= {{1,9,4},{3,7}};
		
		muestraValoresMatriz(matIdent);
		
		String a=" ";
		
		a=esMatrizTriangular(matIdent);
		System.out.println(a);
		
		//System.out.println("La suma de la matriz mat2 es:"
		//							+sumaMatriz(mat1));
		
		//buscaElemento(mat2, -6);
		
	/*	if(esMatrizCuadrada(mat1))
			System.out.println("La matriz es cuadrada");
		else
			System.out.println("La matriz NO es cuadrada");*/
		
		if(esMatrizIdentidad(matIdent))
			System.out.println("La matriz es identidad");
		else
			System.out.println("La matriz NO es identidad");

		
	}

	public static void muestraValoresMatriz(int[][]mat)
	{
		/*for (int i = 0; i < mat[0].length; i++) {
			System.out.print("\t"+i);
		}*/
		
	
				
			
		}
		
		

	
	
	public static int sumaMatriz(int[][] matriz) {
		int suma = 0;

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				suma += matriz[i][j];
			}
		}
		return suma;
	}
	
	// Sandra
	public static void buscaElemento(int [][]matriz, int num) {
			int aparicion=0;
			
			for(int i=0;i<matriz.length;i++) {
				for(int j=0;j<matriz[i].length;j++)	{
					if (matriz[i][j]==num) {
						System.out.println("\nEl número "+num+
												" se encuentra en la fila "
														+i+" y en la columna "+j);
						aparicion++;
					}
				}
			}
			
			
			System.out.println("\nEl número ha aparecido "+aparicion+" veces");			
		}
	
	//Javier
	public static boolean esMatrizCuadrada (int [][] matriz) {

		for (int i = 0; i < matriz.length; i++) {
			if(matriz.length!=matriz[i].length)
				return false;
		}
		
		return true;
	}

	//Ángel
	public static boolean esMatrizEscalar(int [][] matriz) {
		int i=1, diagonal=matriz[0][0];		
		
		if (!esMatrizCuadrada(matriz)) {
			return false;
		}
		
		while(i<matriz.length) {
			if (matriz[i][i]!=diagonal) {
				return false;
			}
			i++;
		}
		
	/*	for(i=1;i<matriz.length;i++)
		{
			if(matriz[i-1][i-1]!=matriz[i][i])
				return false;
		}*/
		
		return true;
	}

	//Antonio
/*	public static boolean esMatrizIdentidad (int [][] m) {
		int contadorIguales=0;
		int cont=0;
		
		if(esMatrizCuadrada(m)) {

			for (int i=0; i<m.length; i++) {
				for (int j=0; j<m[i].length; j++) {
					if(contadorIguales<m.length-1) {
						if (m[i][cont]==1 && m[i+1][cont+1]==1)
							contadorIguales++;
						else if(m[i][j]!=0 ) 
							return false;
					}
				}
				cont++;
			}
			return true;
		}
		return false;
	}*/

	public static boolean esMatrizIdentidad(int[][] matriz) {
		if(!esMatrizCuadrada(matriz))
			return false;
		
		for(int i=0;i<matriz.length;i++) {
			for(int j=0;j<matriz[i].length;j++) {			
				if(i==j && matriz[i][j]!=1)
					return false;
				else if(i!=j && matriz[i][j]!=0)
					return false;				
			}
		}
		
		return true;
	}


	public static String esMatrizTriangular(int[][] matIdent) {

		String respuesta = " ";

		if (esMatrizTriangularSuperior(matIdent) && esMatrizTriangularInferior(matIdent)) {

			respuesta = " Es diagonal ";

		} else if ((esMatrizTriangularSuperior(matIdent) && !esMatrizTriangularInferior(matIdent))) {

			respuesta = "es triangular superior ";

		} else if ((!esMatrizTriangularSuperior(matIdent) && esMatrizTriangularInferior(matIdent))) {

			respuesta = "es triangular inferior";
			
		} else if ((!esMatrizTriangularSuperior(matIdent) && !esMatrizTriangularInferior(matIdent))) {
			
			respuesta="no es triangular";
		}
		
		return respuesta;

	}
		
		
	
	
	public static boolean esMatrizTriangularSuperior(int[][] matIdent) {

		for (int i = 0; i < matIdent.length / 2; i++) {
			for (int j = i + 1; j < matIdent.length; j++) {

				if (matIdent[i][j] != 0) {

					return false;
				}
			}

		}

		return true;
	}
	
	public static boolean esMatrizTriangularInferior(int[][] matIdent) {
		
		for(int i=1;i<matIdent.length/2;i++) {
			for(int j=0;j<=matIdent.length;j++) {
				
				if(matIdent[i][j]!=0) {
					return false;
				}
			}
		}
		
		return true;
	}

}
