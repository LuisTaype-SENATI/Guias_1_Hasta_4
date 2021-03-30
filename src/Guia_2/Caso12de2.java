package Guia_2;
import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso12de2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		DecimalFormat redondear = new DecimalFormat("#.00");
		
		System.out.print("Empleado......:");
		String nombre = sc.nextLine();
		
		System.out.print("Nivel......:");
		int nivel =sc.nextInt();
		
		System.out.print("Sueldo.....:");
		float sueldo = sc.nextFloat();
		
		float inc = 0;
		
		switch (nivel) {
		case 1:
			inc=0.04f;
			break;
		case 2:
			inc=0.06f;
			break;
		case 3:
			inc=0.8f;
			break;
		case 4:
			inc=0.11f;
			break;
	
		}
		System.out.println("----------------");
		System.out.println("REsultados");
		System.out.println("----------------");
		System.out.println("Empleado......:"+nombre);
		System.out.println("Nivel......:"+nivel);
		System.out.println("Imcremento......:"+(inc*100));
		System.out.println("Sueldo......:"+redondear.format(sueldo+(sueldo*inc)));
	}



	}


