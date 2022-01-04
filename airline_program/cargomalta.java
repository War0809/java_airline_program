import java.util.Scanner;

public class cargomalta {
	
	static Scanner sc = new Scanner(System.in);

	static  int getcargomalta() {
		 int cm = 0;
		 
		 while (cm <= 0) {
             
	           System.out.println("Enter total number of cargo flights from Malta :");
	           cm = sc.nextInt();
	           
	           if (cm <= 0) {
	        	   
	        	   printpositive.positive ();
	               
	              continue;
	              
	               
	           }
		    } 
		 
		return cm;
		}
}