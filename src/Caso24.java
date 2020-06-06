import java.util.Scanner;
public class Caso24 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("Ingrese primero monto: ");
		float mont1= sc.nextFloat();
		
		System.out.print("Ingrese segundo monto: ");
		float mont2= sc.nextFloat();
		
		System.out.print("Ingrese tercer monto: ");
		float mont3= sc.nextFloat();
		
		/* problemas*/
		
		float sumamont= mont1+mont2+mont3;
		
		float problema1= mont1/5+(mont2*0.20f);
		float problema2= (mont3*0.60f)/2;
		float problema3= sumamont-(sumamont*0.08f);
		
		
		System.out.println("Resultado");
		System.out.println("============");
		System.out.println("Caso 1 : "+problema1);
		System.out.println("Caso 2: "+problema2);
		System.out.println("Caso 3: "+problema3);
	}

}
