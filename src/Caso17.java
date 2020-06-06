import java.util.Scanner;
import java.text.DecimalFormat;
public class Caso17 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		DecimalFormat df= new DecimalFormat("#.00");
		
		System.out.print("Numero de aprobados: ");
		
		int na= sc.nextInt();
		
		System.out.print("Numero de reprobados: ");
		
		int nd= sc.nextInt();
		
		System.out.print("Numero de retirados: ");
		
		int nr= sc.nextInt();
		
		int totala= na+nd+nr;
		
		float aprobados=(float) (na*100)/totala;
		float desaprobados= (float) (nd*100)/totala;
		float retirados= (float) (nr*100)/totala;
		
		System.out.println("Aprobados: "+df.format(aprobados));
		System.out.println("Desaparobados: "+df.format(desaprobados)+"%");
		System.out.println("Retirados: "+df.format(retirados)+"%");
		
		
	}

}
