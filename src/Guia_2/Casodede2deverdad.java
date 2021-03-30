package Guia_2;

import java.util.Scanner;

public class Casodede2deverdad {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese numero: ");
		int n = sc.nextInt();
		
		int sumatoria = 0;
		int i = 1;
		
		while (i <= n) {
			sumatoria +=i;
			
			if (i != n) 
				System.out.print(i + " + ");
			else
				System.out.print(i + " = " + sumatoria);
			i++;
		}

	}

}