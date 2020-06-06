import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso16 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		DecimalFormat df= new DecimalFormat("#.00");
		
		System.out.print("Ingrese horas trabajadas: ");
		
		int horas= sc.nextInt();
		
		System.out.print("Ingrese tarifa por hora: ");
		
		float tph= sc.nextFloat();
		
		float sueldo= horas*tph;
		
		float bono= sueldo*0.05f;
		
		float sueldoT= sueldo+bono;
		
		float dolares= sueldoT/3.24f;
		
		
		System.out.println("============");
		System.out.println("Resultado");
		System.out.println("============");
		System.out.println("Sueldo: "+ sueldo);
		System.out.println("Bono: "+bono);
		System.out.println("Total: "+sueldoT);
		System.out.println("Total en dolares: "+df.format(dolares));

	}

}
