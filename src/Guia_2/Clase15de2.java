package Guia_2;

import java.util.Scanner;

public class Clase15de2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ingrese nombre: ");
		String nombre = sc.nextLine();
		
		System.out.print("Ingrese Producto [TB/LT/MN/IM]: ");
		String producto = sc.nextLine();
		
		String nom_producto = "", modo_pago = "", mostrar_modo = "", mostrar_di = "";
		
		int cantidad = 0, importe = 0, precio = 0;
		float di = 0.0f, total = 0.0f;
		
		switch(producto) {
		
		case "TB":
			precio = 350;
			nom_producto = "Tablet";
			break;
			
		case "LT":		
			precio = 2300;
			nom_producto = "Laptop";
			break;
			
		case "MN":
			precio = 850;
			nom_producto = "Monitor";
			break;
			
		case "IM":
			precio = 680;
			nom_producto = "Impresora";
			break;
		default:
			precio = 0;
			nom_producto = "Desconocido";
		}
		System.out.print("Ingrese cantidad: ");
		cantidad = sc.nextInt();
		
		importe = precio * cantidad;
		
		sc.nextLine();
		
		System.out.print("Ingrese forma de pago [C1/C2]: ");
		modo_pago = sc.nextLine();
		
		if (modo_pago.equalsIgnoreCase("C1")) {
			di = importe * 0.05f;
			mostrar_modo = "Contado";
			total = importe - di;
			mostrar_di = "Descuento";
		}
		else if (modo_pago.equalsIgnoreCase("C2")) {
			di = importe * 0.12f;
			mostrar_modo = "Crédito";
			total = importe + di;
			mostrar_di = "Incremento";
		}
		System.out.println();
		System.out.println("===========================");
		System.out.println("    R E S U L T A D O S    ");
		System.out.println("===========================");
		System.out.println("Cliente......................: " + nombre);
		System.out.println("Producto.....................: " + nom_producto);
		System.out.println("Precio.......................: " + precio);
		System.out.println("Cantidad.....................: " + cantidad);
		System.out.println("Importe......................: " + importe);
		System.out.println("Forma de pago................: " + mostrar_modo);
		System.out.println(mostrar_di + "....................: " + di);
		System.out.println("Total a pagar................: " + total);
	
	}

}
