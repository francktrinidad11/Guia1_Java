import java.util.Scanner;
public class Caso10 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Ingrese radio del circulo: ");
		
		float radio=sc.nextFloat();
		
		float area= (float) ((float) 3.1416* Math.pow(radio,2));
		
		float perimetro= 2*(3.1416f*radio);
	
		
		
		System.out.println("=============");
		System.out.println("Resultado");
		System.out.println("=============");
		System.out.println("El área del circulo es: "+area);
		System.out.println("El perimetro del circulo es: "+perimetro);
	
		

	}

}
