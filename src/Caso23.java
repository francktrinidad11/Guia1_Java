import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso23 {

	public static void main(String[] args) {
		
		Scanner sc=	new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		
		System.out.print("Ingrese el nombre del producto: ");
		String name= sc.nextLine();
		
		System.out.print("Ingrese el precio del producto: ");
		float precio= sc.nextFloat();
		
		System.out.print("Ingrese la cantidad de producto: ");
		int cantidad=sc.nextInt();
		
		float importe= precio*cantidad;
		
		float igv= importe*0.18f;
		
		float descuento= importe*0.03f;
		
		float total=importe+igv+descuento;
		
		System.out.println("Resultado");
		System.out.println("=============");
		System.out.println("Importe: "+df.format(importe));
		System.out.println("IGV Importe "+igv);
		System.out.println("Descuento: "+descuento);
		System.out.println("Total "+df.format(total));
		

	}

}
