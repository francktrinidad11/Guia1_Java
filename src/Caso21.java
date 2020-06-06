import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso21 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		DecimalFormat df= new DecimalFormat("#.00");
		
		System.out.print("Ingrese el total del gasto: ");
		
		float gasto= sc.nextFloat();
		
		float gastoTo= gasto-(gasto*0.12f);
		
		System.out.println("Resultado");
		System.out.println("===========");
		System.out.println("Gasto: "+df.format(gasto));
		System.out.println("Gasto disminuido en 12%: "+df.format(gastoTo));

	}

}