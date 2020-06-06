import java.util.Scanner;
public class Caso4 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		//Lectura de Valores
		
		System.out.print("Ingrese primero numero: ");
		
		float num1= sc.nextFloat();
		
		System.out.print("Ingrese segundo numero: ");
		
		float num2= sc.nextFloat();
		
		//Proceso de valores
		
		float suma= num1+num2;
		float resta= num1-num2;
		float multiplicacion= num1*num2;
		float division= num1 / num2;
		float restoentero= num1 % num2;
		
		
		//impresion
		
		System.out.print("Resultado"+"\n");
		System.out.print("=================="+ "\n");
		System.out.print("Suma:..."+ suma + "\n");
		System.out.print("Resta:..."+ resta + "\n");
		System.out.print("Multiplicacion:..."+ multiplicacion + "\n");
		System.out.print("Division:..."+ division + "\n");
		System.out.print("Resto Entero:..."+ restoentero);
		
		

	}

}
