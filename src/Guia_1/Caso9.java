package Guia_1;

import java.util.Scanner;

public class Caso9 {
	
	public static void main(String[] args) {
	    Scanner rectangulo = new Scanner(System.in);
		
		System.out.print("Ingrese la base: ");
		int base = rectangulo.nextInt();
		
		System.out.print("Ingrese la altura: ");
		int altura = rectangulo.nextInt();
		
	    int area = base * altura;
		
		int perimetro = (base + altura) * 2;
		
		System.out.println("-------- R E S U L T A D O S --------");
		System.out.println("El área del rectángulo es "+ area);
		System.out.println("El perímetro del rectángulo es "+ perimetro);	

	}

}
