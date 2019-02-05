package masejerciciosjava;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner teclado = new Scanner(System.in);

		int numero = 0, i = 4,  miles = 0, centenas = 0, decenas = 0, unidades = 0,
				 numero_acumulado=0;

		String romano_mil = " ", romano_centenas = " ", romano_decenas = " ", romano_unidades = " ";

		System.out.println("Introduzca un numero");
		numero = teclado.nextInt();
		
		numero_acumulado=numero;

		while (numero > 3500) {

			System.out.println("Introduzca un numero");
			numero = teclado.nextInt();
		}

		miles = numero / 1000;
		numero = numero % 1000;

		centenas = numero / 100;
		numero = numero % 100;

		decenas = numero / 10;
		unidades = numero % 10;

		while (i > 0) {

			i--;

			if (i == 3) {

				miles = (int) (Math.round(miles * Math.pow(10, i)));

			}

			if (i == 2) {

				centenas = (int) (Math.round(centenas * Math.pow(10, i)));

			}

			if (i == 1) {

				decenas = (int) (Math.round(decenas * Math.pow(10, i)));

			}

			if (i == 0) {

				unidades = (int) (Math.round(unidades * Math.pow(10, i)));

			}

		}



		if (miles == 3000) {

			romano_mil = "MMM";
		}

		if (miles == 2000) {

			romano_mil = "MM";
		}

		if (miles == 1000) {

			romano_mil = "M";
		}
		
		if (centenas == 900) {

			romano_centenas = "CM";
		}
		
		if (centenas == 800) {

			romano_centenas = "DCCC";
		}
		
		if (centenas == 700) {

			romano_centenas = "DCC";
		}
		
		if (centenas == 600) {

			romano_centenas = "DC";
		}

		if (centenas == 500) {

			romano_centenas = "D";
		}

		if (centenas == 400) {

			romano_centenas = "CD";
		}

		if (centenas == 300) {

			romano_centenas = "CCC";
		}

		if (centenas == 200) {

			romano_centenas = "CC";
		}

		if (centenas == 100) {

			romano_centenas = "C";
		}

		if (decenas == 90) {
			romano_decenas = "XC";
		}

		if (decenas == 80) {
			romano_decenas = "XXC";
		}

		if (decenas == 70) {
			romano_decenas = "LXX";
		}

		if (decenas == 60) {
			romano_decenas = "LX";
		}

		if (decenas == 50) {
			romano_decenas = "L";
		}

		if (decenas == 40) {
			romano_decenas = "XL";
		}

		if (decenas == 30) {

			romano_decenas = "XXX";
		}

		if (decenas == 20) {

			romano_decenas = "XX";
		}

		if (decenas == 10) {

			romano_decenas = "X";
		}
		
		if(unidades==9) {
			
			romano_unidades="IX";
		}
		
		if(unidades==8) {
			
			romano_unidades="VIII";
		}
		
		if(unidades==7) {
			
			romano_unidades="VII";
		}
		
		if(unidades==6) {
			
			romano_unidades="VI";
		}
		
		if(unidades==5) {
			
			romano_unidades="V";
		}
		
		if(unidades==4) {
			
			romano_unidades="IV";
		}
		
		if(unidades==3) {
			
			romano_unidades="III";
		}
		
		if(unidades==2) {
			
			romano_unidades="II";
		}
		
		if(unidades==1) {
			
			romano_unidades="I";
		}
		
		System.out.println("EL numero " +numero_acumulado+ " En romano es " +romano_mil+ romano_centenas+ romano_decenas+ romano_unidades );

		teclado.close();
	}

}
