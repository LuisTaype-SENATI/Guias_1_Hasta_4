package Guia_1;

import java.util.Scanner;

public class Caso19 {

	public static void main(String[] args) {
		Scanner suma = new Scanner(System.in);
				
		System.out.print("Ingrese lado 1........: ");
		int a = suma.nextInt();
		
		System.out.print("Ingrese lado 2........: ");
		int b = suma.nextInt();	
		
		System.out.print("Ingrese lado 3........: ");
		int c = suma.nextInt();
		
		int total = a + b + c;
		
		System.out.println("El perimetro del triangulo es " +  total);
	}

}
