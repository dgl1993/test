package vectores;

public class ejemploFuncionesYVectores {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] vec={1,2,3,4,5};
		int [] vecInverso;
		int suma=0;
		
		System.out.println("\n\nMostrando valores iniciales de vec....\n");
		muestraVector(vec);
		
		System.out.println("\n\nSumando valores de vec....\n");
		suma=sumaValoresVector(vec);
		System.out.println("La suma de sus elementos es: "+suma);
		
		
		System.out.println("\n\nAsignando a vectorInverso los valores de vec en orden inverso....\n");
		vecInverso=invierteVector(vec);
		System.out.println("La posicion de memoria de vec es"+vec);
		System.out.println("La posicion de memoria de vecInverso es"+vecInverso);
		muestraVector(vecInverso);
		
		System.out.println("\n\nPasando todos los valores de vec a 0.....\n");
		pasaValoresACero(vec);
		System.out.println("\n\n");
		muestraVector(vec);		
	}
	
	public static void muestraVector(int [] vector)
	{
		for(int i=0;i<vector.length; i++)
			System.out.println("En la posición "+i+" está el valor "+vector[i]);
	}
	
	public static void pasaValoresACero(int [] vector)
	{
		for(int i=0;i<vector.length; i++)
			vector[i]=0;
	}

	public static int sumaValoresVector(int [] vector)
	{
		int s=0;
		for(int i=0;i<vector.length; i++)
			s+=vector[i];
		
		return s;
	}
	
	public static int [] invierteVector(int [] vector)
	{
		int [] v_aux=new int[vector.length];
		int pos=0;
		
		for(int i=vector.length-1;i>=0;i--)
		{
			v_aux[pos]=vector[i];
			pos++;
		}
		
		return v_aux;
	}
}
