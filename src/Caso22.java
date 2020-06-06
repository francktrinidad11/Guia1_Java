import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso22 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		DecimalFormat df=new DecimalFormat("#.0");
		
		System.out.print("Ingrese Nombre del alumno: ");
		String name= sc.nextLine();
		
		System.out.print("Ingrese nota 1: ");
		float nota1= sc.nextFloat();
		
		System.out.print("Ingrese nota 2: ");
		float nota2=sc.nextFloat();
		
		System.out.print("Ingrese nota 3: ");
		float nota3=sc.nextFloat()
				;
		float promedio= (float) (nota1*0.20+nota2*0.30+nota3*0.50);
		
		System.out.println("Resultado");
		System.out.println("===========");
		System.out.println("Promedio: "+df.format(promedio));
		
		
		
	}

}
