package Guia_3;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Caso9de3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		DecimalFormat df = new DecimalFormat("#0.00");
		int i = 0, o = 1;
		
		while (i == 0 ) {
			System.out.println("\n**********************");
			System.out.println("    R E G I S T R O " + o + ":");
			System.out.println("**********************");
			
			System.out.print("Alumno........... : ");
			String nombre = sc.nextLine();
			
			System.out.print("Nota 1........... : ");
			float nota1 = sc.nextFloat();
			
			System.out.print("Nota 2........... : ");
			float nota2 = sc.nextFloat();
			
			System.out.print("Nota 3........... : ");
			float nota3 = sc.nextFloat();
			
			System.out.print("Asistencia [1-12] : ");
			float na = sc.nextFloat();
			
			//Cast es el metodo de 0.3f
			float promedio = nota1 * 0.2f + nota2 * 0.3f + nota3 * 0.5f;
			
			float pa = na / 12;
			
			String estado = "Sin certificado";
			
			if(promedio >= 13 && pa >= 0.7)
				estado = "Tiene certificado";
			
			System.out.println("\n R E S U L T A D O");
			System.out.println("Promedio.........: " + df.format(promedio));
			System.out.println("Asistencia.......: " + df.format((pa * 100)) + "%");
			System.out.println("Estado...........: " + estado); 
			
			sc.nextLine();
			
			System.out.println("¿Registra otro ? [S / N] :");
			String sino = sc.nextLine();
			
			if (sino.equalsIgnoreCase("N"))
				i++;
				
			o++;
		}
		
		

	}

}
