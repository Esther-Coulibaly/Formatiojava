 import java.util.Scanner;
 
 public class MonApplicationexo7{ 
 
    public static void main (String arg[]) { 
        System.out.println("demo Boucle While");

		String prenom;
		char reponse='o';
		Scanner sc = new Scanner(System.in);

		do
		{
		   System.out.println("Donnez un prénom: ");
		   prenom = sc.nextLine();
		   System.out.println("Bonjour " + prenom + " .Comment vas tu ?");
		   
		  do {
		  	System.out.println("Voulez vous ressayer ? O/N ");
		    reponse = sc.nextLine().charAt(0);
		  }while(reponse != 'o' && reponse != 'n' );
		 
		}while(reponse == 'o');
			 System.out.println("Au revoir ");

	 }
  }