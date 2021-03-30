package Guia_1;

public class Caso7 {
	
	public static void main(String[] args) {
		 // Aqui hacemos uso de la variable n1 para realizar una potencia
		// n1 puede ser float o int
		int n1 = (int) Math.pow(3,2);
		
		/* Utilizamos <<float>> en las variables y sus operaciones, 
		 *  que tiene menor o igual de 6 a 7 decimales */
		float n2 = 17, n3 = 2, n4 = 6, n5 = 5, n6 = 2;
		/*Utilizamos <<double>> en las variables y sus operaciones 
		 * ,que tienen aprox. 15 decimales*/
		double  n7 = 4.7 , n8 = 1.2;
	    float res =(n2 * n3 + n1 - n4) / n5;
		double ros = n3 * (n7 - (n8 * n3));
		// Se usa Math.round, para redondear.
		double ja = Math.round((res - ros) * 100.0) / 100.0;
		 System.out.println("- - - - - - -");
		 System.out.println(" RESULTADOS ");
		 System.out.println("- - - - - - -");
		 System.out.println("La respues es " + ja);
		 
		
		
		
	}

}
