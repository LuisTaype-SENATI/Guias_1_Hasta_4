package Guia_1;
import java.util.Scanner;
public class Caso10 {

	public static void main(String[] args) {
		Scanner circulo = new Scanner(System.in);
		
		final double pi = 3.1416;
		
		System.out.print("Ingrese radio: ");
		
		double radio = circulo.nextDouble();
		double radio_cuadrado = (double)Math.pow(radio, 2);
		double area = pi * radio_cuadrado;
		double perimetro = 2 * radio * pi;
		
		System.out.println("-------- R E S U L T A D O S --------");
		System.out.println("El área del círculo es "+ area);
		System.out.println("El perímetro del círculo es "+ perimetro);
		

	}

}
