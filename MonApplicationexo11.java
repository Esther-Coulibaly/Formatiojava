 public class MonApplicationexo11{ 
 
    public static void main (String arg[]) { 
        System.out.println("Bienvenue dans son application de gestion ressources humaines");
      
	  String employe1 = "yves" ;
	  
	 ServicePayeexo servicePaye; 
	 
	 servicePaye=new ServicePayeexo();
	 
	 int salaire1 = servicePaye.calculerSalaire (employe1);
	  
	 System.out.println (employe1 + " a un salaire de " + salaire1);
		}
     }