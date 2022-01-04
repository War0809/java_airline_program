import java.util.Scanner;

public class commercialspain {
	
	static Scanner sc = new Scanner(System.in);

	static  int getcommspain() {
		 int ps = 0;
		 
		 while (ps <= 0) {
		    	
	    	   System.out.println("Enter total number of passengers from Spain :");
             ps=sc.nextInt();
             
             if (ps <= 0) {
          	   
          	   printpositive.positive ();
	               
	               continue;
             }
		    } 
		 
		return ps;
		}
}