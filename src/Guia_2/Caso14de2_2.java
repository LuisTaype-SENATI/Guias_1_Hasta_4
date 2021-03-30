package Guia_2;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso14de2_2 {

	public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
        DecimalFormat redondeo = new DecimalFormat("#0.00");
		
		System.out.print("Nombre de alumno....:");
		String alumno = datos.nextLine();
		
		System.out.print("Ingrese (DS, RC, DG):");
		String carrera = datos.nextLine();
		float dsc = 0.0f;
		float monto = 0.0f;
		String curso = "";
	
		switch (carrera) {
		case "DS":
			monto = 1500.0f;
			break;
			
		case "RC":
			monto = 1400.0f;
			break;
			
		case "DG":
			monto = 1300.0f;
			break;
			
		default	:
				monto = 0;
				dsc = 0;
		}
		System.out.print("Ingrese turno (M, T, N):");
		String turno = datos.nextLine();
		
		if(turno.equalsIgnoreCase("M")) {
			curso = "Mañana";
			dsc = monto * 0.1f;
		}
		else if(turno.equalsIgnoreCase("T")) {
			curso = "Tarde";
			dsc = monto * 0.2f;
		}
		else if(turno.equalsIgnoreCase("N")) {
			curso = "Noche";
			dsc = monto * 0.15f;
		}

			
		
		
		System.out.println("\n_ _ _ _ _ _ __ _ _ _ _ _ _ _ _ _ _");
		System.out.println("_ _ _ _ R E S U L T A D O _ _ _ _ _");
		System.out.println("_ _ _ _ _ _ __ _ _ _ _ _ _ _ _ _ _\n");
		System.out.println("El monto total es : " + monto);
		System.out.println("Turno.............: " + curso );
		System.out.println("Descuento........ : " + redondeo.format(dsc));System.out.println("El total a pagar..: " + (monto - dsc));
		System.out.println("Cambio en dolares.: " + redondeo.format((monto + dsc) / 3.33f) + " Dolares");


	}

}
