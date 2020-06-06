import java.util.Scanner;
public class Caso12 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		String frase="Escuela de Tecnologia e Informatica";
		String pal1= frase.substring(0,7);
		String pal2= frase.substring(11,21);
		String pal3= frase.substring(24,35);
		
		System.out.println("==============");
		System.out.println("Resultado");
		System.out.println("==============");
		System.out.println("Primera palabra: "+pal1);
		System.out.println("Segundna palabra: "+pal2);
		System.out.println("Tercera palabra: "+pal3);
	}

}
