package Guia_2;

import java.util.Scanner;

public class Caso14de2 {

	public static void main(String[] args) {
        Scanner datos = new Scanner(System.in);
		
		System.out.print("Nombre de alumno....:");
		String alumno = datos.nextLine();
		
		System.out.print("Ingrese (DS, RC, DG):");
		String carrera = datos.nextLine();
		
		System.out.print("Ingrese turno (M, T, N):");
		String turno = datos.nextLine();
		
		float dsc = 0;
		float monto = 0;
		String curso = "";
	
		switch ( carrera) {
		case "DS":
				monto = 1500f;
				switch (turno) {
				case "M":
					dsc = monto * 0.1f;
					curso = "Mañana";
					break;
				case "T":
					dsc = monto * 0.2f;
					curso = "Tarde";
					break;
				case "N":
					dsc = monto * 0.15f;
					curso = "Noche";
					break;
				}
		case "RC":
			monto = 1400f;
			switch (turno) {
			case "M":
				dsc = monto * 0.1f;
				curso = "Mañana";
				break;
			case "T":
				dsc = monto * 0.2f;
				curso = "Tarde";
				break;
			case "N":
				dsc = monto * 0.15f;
				curso = "Noche";
				break;
			}
		case "DG":
			monto = 1300f;
			switch (turno) {
			case "M":
				dsc = monto * 0.1f;
				curso = "Mañana";
				break;
			case "T":
				dsc = monto * 0.2f;
				curso = "Tarde";
				break;
			case "N":
				dsc = monto * 0.15f;
				curso = "Noche";
				break;
		default	:
				monto = 0;
				dsc = 0;
			}
		
		
		}
		System.out.println("\n_ _ _ _ _ _ __ _ _ _ _ _ _ _ _ _ _");
		System.out.println("_ _ _ _ R E S U L T A D O _ _ _ _ _");
		System.out.println("_ _ _ _ _ _ __ _ _ _ _ _ _ _ _ _ _\n");
		System.out.println("El monto total es : " + monto);
		System.out.println("Turno.............: " + curso );
		System.out.println("Descuento........ : " + dsc);
		System.out.println("El total a pagar..: " + (monto + dsc));
		System.out.println("Cambio en dolares.: " + ((monto + dsc) * 3.33f) + " Dolares");

	}

}
