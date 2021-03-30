package Guia_2;
import java.util.Scanner;
public class Caso6de2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Sueldo......: ");
		float sueldo = sc.nextFloat();
		
		float impuesto;
		
		if (sueldo > 2800 )
			impuesto = sueldo * 0.05f;
		else
			impuesto = sueldo * 0.02f;
		
		System.out.println("Impuesto calculado: "+ impuesto);
	}

}
