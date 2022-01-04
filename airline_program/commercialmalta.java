import java.util.Scanner;

public class commercialmalta {
	
	static Scanner sc = new Scanner(System.in);

	static  int getTotalPassengers() {
		 int pm = 0;
		 
		  while (pm <= 0) {
		    System.out.println("Enter total number of  passengers from Malta :");
		    pm = sc.nextInt();
			            
		    if (pm <= 0) {
		      printpositive.positive ();
		      continue;
		    } 
		 }

		return pm;
		}
}
