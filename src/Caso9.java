import java.util.Scanner;
public class Caso9 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Ingrese lado 1: ");
		
		int lado1=sc.nextInt();
		
		System.out.print("Ingrese lado 2: ");
		
		int lado2= sc.nextInt();
		
		int area=  lado1*lado2;
		int perimetro= (lado1+lado2)*2;
		
		
		System.out.println("=============");
		System.out.println("Resultado");
		System.out.println("=============");
		System.out.println("El área del rectangulo es: "+area);
		System.out.println("El perimetro del rectangulo es: "+perimetro);
		

	}

}
