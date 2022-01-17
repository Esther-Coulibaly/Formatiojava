 public class MonApplicationexo4{ 
 
    public static void main (String arg[]) { 
        System.out.println("demo condition");
		
	  int note = 10;
	 
	 switch (note)
	 {
	    case 0:
		        System.out.println("Ouch");
			break;
		case 10:
		        System.out.println("Vous avez juste la moyenne");
			break;
		case 20:
		        System.out.println("Parfait");
			break;
		default:
			   System.out.println("Il faut davantage travailler");
	 }
	 }
  }