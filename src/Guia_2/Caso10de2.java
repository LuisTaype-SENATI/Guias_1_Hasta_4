package Guia_2;
import java.util.Scanner;
public class Caso10de2 {

	public static void main(String[] args) {
		Scanner datos = new Scanner(System.in);
		
		System.out.print("Empleado............:");
		String nombre = datos.nextLine();
		
		System.out.print("Horas Trabajadas....:");
		int horas_t = datos.nextInt();
		
		System.out.print("Tarifa por hora.....:");
		float tarifa = datos.nextFloat();
		
		System.out.print("Numero de minutos por tardanza.....:");
		int m_tardanza = datos.nextInt();
		
		float importe = tarifa * horas_t;
		
		float bono = importe * 0.04f;
		
		if (horas_t > 60 )
			bono = importe*0.13f;
		
		float descuento = 0.0f;
		
		if (m_tardanza > 15)
			descuento = 0.03f;
		
		float meta = (horas_t /70.0f)*100.0f;
		
		System.out.println("Resultados");
		System.out.println("Empleado................: "+nombre);
		System.out.println("Horas Trabajadas........: "+horas_t);
		System.out.println("Tarifa por horas ........: "+tarifa);
		System.out.println("Importe ........: "+ importe);
		System.out.println("Bono ........: "+ bono);
		System.out.println("Descuento ........: "+descuento);
		System.out.println("Meta alcanzada........:"+meta+"%");
	}
}