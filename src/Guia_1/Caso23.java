package Guia_1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso23 {

	public static void main(String[] args) {
		Scanner objeto = new Scanner(System.in);
		DecimalFormat redondeo = new DecimalFormat("#.00");
		
		System.out.println("Ingrese el nombre del producto: ");
		String producto = objeto.nextLine();
		
		System.out.println("Ingrese el precio: ");
		float precio = objeto.nextFloat();
		
		System.out.println("Ingrese la cantidad: ");
		int cantidad = objeto.nextInt();
		
		float importe = cantidad * precio;
		
		float igv = importe * 0.18f;
		
		float descuento = importe * 0.03f;
		
		System.out.println("========== R E S U L T A D O S ==========");
		System.out.println("Importe................: " + redondeo.format(importe));
		System.out.println("IGV.................: " + redondeo.format(igv));
		System.out.println("Descuento...............: " + redondeo.format(descuento));
		System.out.println("Total Neto.............: " + redondeo.format(importe - descuento + igv));
	
	}

}
