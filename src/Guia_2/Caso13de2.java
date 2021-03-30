package Guia_2;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso13de2 {

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  DecimalFormat redondear = new DecimalFormat("#.00");
			
			
			System.out.print("Ingrese primer número....: ");
			float n1 = sc.nextFloat();
			
			System.out.print("Ingrese egundo número..: ");
			float n2 = sc.nextFloat();
			
			System.out.print("Ingrese operación[1 - 6].: ");
			int nivel = sc.nextInt();
			
			String text= "";
			float ja = 0;
			
			
			switch (nivel) {
			case 1:
				ja= n1 + n2;
				text = "Suma";
				
				break;
			case 2:
				ja= n1 - n2;
				text = "Resta";
				break;
			case 3:
				ja= n1 * n2;
				text = "Producto";
				break;
			case 4:
				if (n2 > 0) {
					ja= n1 / n2;
					text = "División";
					
				}
				else
					text = "No es posible hallar el resto entero";
				break;
			case 5:
				if (n2 > 0) {
					ja= n1 % n2;
				    text = "Resto entero";
				}
				else
					text = "No es posible hallar el resto entero";
				break;
			case 6:
				ja = (n1 + n2)/2;
				text = "Promedio";
				break;
			default	:
				text = "Invalido";
				ja = 0;
				
			

			
			}
			
			System.out.println("\n----------------");
			System.out.println("....Resultados....");
			System.out.println("----------------");
			System.out.println("Núnmero 1........:" + n1);
			System.out.println("Núnmero 2........:" + n2);
			System.out.println("Operación........:" + text);
			System.out.println("Resultado........:" + ja );
			
			
			
			 
	}

}
