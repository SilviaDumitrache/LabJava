import java.io.*;

public class Strings{

	public static void main (String[] args)
	{
		//Cerinta nr2 din anexa 1:
	    int[] anArray; 				// Declararea unui array de tip integer 
	    anArray = new int[3];		//Vectorul contine 3 elemente
	    
	    anArray[0] = 100;			//Primul element al vectorului
	    anArray[1] = 200;			//Al doilea element al vectorului
	    anArray[2] = 300;			//Al treilea element al vectorului
	    
	    System.out.println("Primul element al vectorului este: "		//Afisarea in consola a valorilor elementelor vectorului.
	            + anArray[0]);
	    System.out.println("Al doilea element al vectorului este: "
	            + anArray[1]);
	    System.out.println("Al treilea element al vectorului este: "
	            + anArray[2]);
	    System.out.println();

	    
	    //Cerinta nr3 din anexa 1:
	    String str = "My string";					//Declararea unei variabile de tip string
	    
	    System.out.println("Lungimea sirului este: ");
	    System.out.println(str.length());			//Functia length() afiseara nr de caractere din string
	    
	    System.out.println("In urma folosirii functiei replace(), se obtine: ");
	    System.out.println(str.replace('M','m'));	//Functia replace() schimba caracterul M cu caracterul m
	    
	    System.out.println();
	    
	    //Cerinta nr4 din anexa 1:
	    String strM = "Placinta"; 							//Declararea unei variabile de tip string
	    
	    //Subpunctul a
	    int mijloc = strM.length() / 2;						//Prin aceasta operatie, se determina mijlocul sirului de caractere strM
	    String[] jumatatea= {strM.substring(0, mijloc),strM.substring(mijloc)};		//Prin aceasta operatie, stringul este impartit in 2 parti egale, delimitate de mijloc
	    System.out.println("Prima jumatate a stringului este: ");
	    System.out.println(jumatatea[0]); 					//Prima jumatate
	    System.out.println("A doua jumatatea a stringului este: ");
	    System.out.println(jumatatea[1]); 					//A doua jumatate
	    System.out.println("In urma inversarii celor doua jumatati se obtine: ");
	    System.out.println(jumatatea[1] + jumatatea[0]); 	//Afiseaza cele doua jumatati ale stringului initial, inversate.
	    System.out.println();
	    
	    //Subpunctul b
	    System.out.println("Pozitia literei c in cadrul stringului este: ");
	    int m;
	    m= strM.indexOf("c");		//variabila m reprezinta pozitia la care se gaseste litera c in cadrul stringului 
	    System.out.println(m);
	    
	    String[] rezultat= {strM.substring(0, m), strM.substring(m)}; 	//Prin aceasta operatie, stringul este impartit in doua parti, delimitate de litera c
	    System.out.println("Caracterele din stanga literei c sunt: ");
	    System.out.println(rezultat[0]);		//Afisarea rezultatului cerintei b
	    
	}
}