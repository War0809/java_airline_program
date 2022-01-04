import java.util.Scanner;

public class commercialitaly {
	
	static Scanner sc = new Scanner(System.in);

	static  int getcommitaly() {
		 int pi = 0;
		 
		 while (pi <= 0) {
		    	
	    	   System.out.println("Enter total number of passengers from Italy :");
             pi=sc.nextInt();
             
             if (pi <= 0) {
          	   
          	   printpositive.positive ();
	               
	               continue;
             }
		    } 
		 
		return pi;
		}
}