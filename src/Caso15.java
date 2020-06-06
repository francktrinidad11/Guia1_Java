import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso15 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.00");
		
		System.out.print("Ingrese cantidad: ");
		
		float cantidad= sc.nextFloat();
		
		System.out.print("Ingrese precio: ");
		
		float precio=sc.nextFloat();
		
		float importe,importe1,importe2;
		
		importe=cantidad*precio;
		importe1= importe/3.24f;
		importe2= importe/3.75f;
				
		
		System.out.println("==================");
		System.out.println("Resultado");
		System.out.println("==================");
		System.out.println("Importe: "+ df.format(importe));
		System.out.println("Importe en dolares: "+ df.format(importe1));
		System.out.println("Importe en euros: "+ df.format(importe2));
		

	}

}
