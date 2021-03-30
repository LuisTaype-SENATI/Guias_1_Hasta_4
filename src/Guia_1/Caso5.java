package Guia_1;

import java.util.Scanner;

public class Caso5 {
	
	public static void main(String[] args) {
		// Instanciacion del objeto.
		Scanner num = new Scanner(System.in);
		
		System.out.print("Ingrese número 1: ");
		float n1 = num.nextFloat();
		
		System.out.print("Ingrese número 2: ");
		float n2 = num.nextFloat();
		
		float promedio = (n1 + n2 ) / 2;
		
		/* Le asignamos la <<double>> a las variables p_20 y s_30 
		 * porque sus operaciones tienen mas de 7 decimales*/
		double p_20 = n1 * 1.2;
		
		double s_30 = n2 * 0.7;
		
		System.out.println("R E S U L T A D O S");
		
		System.out.println("Resultado 1: " + promedio);
		System.out.println("Resultado 2: " + p_20);
		System.out.println("Resultado 3: " + s_30);

	}

}
