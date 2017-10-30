import java.util.Scanner;

public class AriaTriunghi {
	public static void main(String[] args) {
		
	
	System.out.println("Baza este : ");			//Parametrul este introdus de la tastatura
	Scanner sc1 = new Scanner(System.in);
	float b = sc1.nextInt();

	System.out.println("Inaltimea este : ");			//Parametrul este introdus de la tastatura
	Scanner sc2 = new Scanner(System.in);
	float h = sc2.nextInt();
	
	double aria;
	aria= b*h /2 ;
	System.out.println("Aria este: " + aria);
	
	

}
}