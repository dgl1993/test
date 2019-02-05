/*Realiza un método que tome como parámetros de entrada dos arrays de enteros y
devuelva como salida un único array con los elementos de los anteriores arrays ordenados de
forma ascendente. Intenta hacerlo de la manera más eficiente posible. ¿Qué método de
ordenación has usado?*/


package ordenacionybusqueda;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] vectoruno = new int [10];
		int [] vectordos = new int [10];
		int [] vectortres= rellenar(vectoruno,vectordos);
		
		for(int i=0;i<vectortres.length;i++) {
			
			System.out.println(vectortres[i]);
		}

	}
	
	public static int[] rellenar (int vectoruno[],int vectordos[]) {
		
		int [] vectortres = new int [20];
		
		for(int i=0;i<vectoruno.length;i++) {
			
			vectoruno[i]=(int) (Math.random()*100)+1;
		}
		
		for(int i=0;i<vectordos.length;i++) {
			
			vectordos[i]=(int) (Math.random()*100)+1;
		}
		
		int j=0;
		for(int i=0;i<10;i++) {
			
			vectortres[j]=vectoruno[i];
			j++;
			vectortres[j]=vectordos[i];
			j++;
		}
		
		int temp;
		int i;
		
		for(i=1;i<vectortres.length;i++) {
			for(j=0;j<i;j++) {
				
				if(vectortres[i]<vectortres[j]) {
					temp=vectortres[j];
					vectortres[j]=vectortres[i];
					vectortres[i]=temp;
				}
			}
		}
		
		return vectortres;
		
		
	}
	
	

}
