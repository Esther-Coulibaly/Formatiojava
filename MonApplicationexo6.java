 import java.util.Scanner;
 
 public class MonApplicationexo6{ 
 
    public static void main (String arg[]) { 
        System.out.println("demo Boucle While");

		String prenom;
		char reponse='o';
		Scanner sc = new Scanner(System.in);
		//tant que la reponse donnée est égale à oui
		while(reponse == 'o')
		{
		  //On affiche une instruction
		   System.out.println("Donnez un prénom: ");
		  //On recupère le prénom saisi
		  prenom = sc.nextLine();
		  //On affiche notre phrase avec le prénom
		   System.out.println("Bonjour " + prenom + " .Comment vas tu ?");
		  //On demande si la personne veut faire un autre essaie
		  	System.out.println("Voulez vous ressayer ? O/N ");
		  //On recupère la reponse de l'utilisateur
		  reponse = sc.nextLine().charAt(0);
		}
				          System.out.println("Au revoir ");

	 }
  }