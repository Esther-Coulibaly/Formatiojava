 import java.util.Scanner;
 
 public class MonApplicationexo6{ 
 
    public static void main (String arg[]) { 
        System.out.println("demo Boucle While");

		String prenom;
		char reponse='o';
		Scanner sc = new Scanner(System.in);
		//tant que la reponse donn�e est �gale � oui
		while(reponse == 'o')
		{
		  //On affiche une instruction
		   System.out.println("Donnez un pr�nom: ");
		  //On recup�re le pr�nom saisi
		  prenom = sc.nextLine();
		  //On affiche notre phrase avec le pr�nom
		   System.out.println("Bonjour " + prenom + " .Comment vas tu ?");
		  //On demande si la personne veut faire un autre essaie
		  	System.out.println("Voulez vous ressayer ? O/N ");
		  //On recup�re la reponse de l'utilisateur
		  reponse = sc.nextLine().charAt(0);
		}
				          System.out.println("Au revoir ");

	 }
  }