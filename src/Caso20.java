import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso20 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		DecimalFormat df= new DecimalFormat("#.00");
		
		System.out.print("Ingrese el costo de la venta: ");
		
		float venta= sc.nextFloat();
		
		float ventaTo= venta+(venta*0.42f);
		
		System.out.println("Resultado");
		System.out.println("===========");
		System.out.println("Venta: "+df.format(venta));
		System.out.println("Venta aumentada en 42%: "+df.format(ventaTo));

	}

}
