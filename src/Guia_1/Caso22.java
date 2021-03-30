package Guia_1;
import java.util.Scanner;
public class Caso22 {

	public static void main(String[] args) {
		Scanner alumno = new Scanner(System.in);
		float nota1,nota2,nota3;
		
		System.out.print("Nota 1: ");
		nota1 = alumno.nextFloat();		
		System.out.print("Nota 2: ");
		nota2 = alumno.nextFloat();
		System.out.print("Nota 3: ");
		nota3 = alumno.nextFloat();
		
		float promedio = ((nota1*0.20f) +(nota2*0.30f) +(nota3*0.5f));
		
		System.out.println("=========== Resultados =========== ");
		System.out.println("Promedio........: "+ promedio);
	}

}
