import java.util.Scanner;

public class cargoitaly {
	
	static Scanner sc = new Scanner(System.in);

	static  int getcargoitaly() {
		 int ci = 0;
		 
		 while (ci <= 0) {
 	    	
             System.out.println("Enter total number of cargo flights from Italy:");
           ci = sc.nextInt();
           
           if (ci <= 0) {
        	   
        	   printpositive.positive ();
               
               continue;
           }
    	    }
		 
		return ci;
		}
}