package Guia_1;
import java.util.Scanner;
public class Caso18 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Altura del triangulo.....: ");
		float altura = sc.nextFloat();		
		System.out.print("Base del triangulo.......: ");
		float base = sc.nextFloat();
		
		float area = (altura * base)/2;
				
		System.out.println("=========== Resultados =========== ");
		System.out.println("Area del triangulo........: "+ area);

	}

}
