import java.util.Scanner;
public class Caso5 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
			
		
		//lectura de datos
		
		System.out.print("Ingrese primer numero: ");
		
		float num1= sc.nextFloat();
		
		System.out.print("Ingrese segundo numero: ");
		
		float num2= sc.nextFloat();
		
		//Proceso de Datos
		
		float promedio=(num1+num2)/2;
		float num1aumentado= num1+(num1*0.2f);
		float num2disminuido= num2-(num2*0.3f);
		
		//Impresion
		
		System.out.println("RESULTADO");
		System.out.println("===============");
		System.out.println("Promedio: "+promedio);
		System.out.println("Primer numero aumentado en 20%: "+num1aumentado);
		System.out.println("Segundo numero disminuido en 30%: "+num2disminuido);
		
		
		
		
		
		

	}

}
