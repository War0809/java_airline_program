import java.util.Scanner;

public class cargospain {
	
	static Scanner sc = new Scanner(System.in);

	static  int getcargospain() {
		 int cs = 0;
		 
		 while (cs <= 0) {
	    	   
  	       
             System.out.println("Enter total number of cargo flights from Spain :");
             cs = sc.nextInt();
             
              if (cs <= 0) {
              	
                 printpositive.positive ();
	               
	               continue;
              }
	    	       }
		 
		return cs;
		}
}