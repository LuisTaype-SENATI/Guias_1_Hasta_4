package Guia_1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso24 {

	public static void main(String[] args) {
		Scanner ah = new Scanner(System.in);
		DecimalFormat df = new DecimalFormat("#.00");
		
		System.out.print("Ingrese primer monto.........: ");
		int n1 = ah.nextInt();
		
		System.out.print("Ingrese segundo monto........: ");
		int n2 = ah.nextInt();
		
		System.out.print("Ingrese tercer monto.........: ");
		int n3 = ah.nextInt();
		
		float primera = n1 / 5f;
		float sp = n2 * 0.2f;
		
		float segunda = n3 * 1.6f * 0.5f;
		
		float tercera = (n1 + n2 + n3) * 0.92f;
		
		
		
		System.out.println("Primera condición..........: " + (primera + sp));
		System.out.println("Segunda condición..........: " +  segunda);
		System.out.println("Tercera condición..........: " + tercera);
	}

}
