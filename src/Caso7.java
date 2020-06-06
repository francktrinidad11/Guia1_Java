import java.util.Scanner;
import java.text.DecimalFormat;

public class Caso7 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		DecimalFormat df=new DecimalFormat("#.0");
				
		float problema=(float) ((17*2+ Math.pow(3,2)-6)/5-2*(4.7f-(1.2f*2)));
		
		System.out.println("==============");
		System.out.println("Resultado");
		System.out.println("==============");
		System.out.println("Respuesta: "+df.format(problema));
	}

}
