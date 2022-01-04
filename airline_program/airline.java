import java.util.Scanner;

public class airline {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		//Declaring all variables needed and initialising them to 0.
		
        int choice = 0, 
        
           pm = 0,cm = 0,pi = 0,ci = 0,ps = 0,cs = 0,
            
            passmalta = 100, runcommalta = 50, cargmalta = 150, runcargmalta = 75, cargweightmalta = 2000, 
            passitaly = 110, runcomitaly = 75, cargitaly = 175, runcargitaly = 100, cargweightitaly = 2000,
        	passspain = 120, runcomspain = 100, cargspain = 200, runcargspain = 120, cargweightspain = 2000,
        
            cosm = 0, cosi = 0, coss = 0, carm = 0, cari = 0, cars = 0, inccommal = 0, inccomita = 0, 
            inccomspa = 0, inccarmal = 0, inccarita = 0, inccarspa = 0, totalkgmalta = 0, totalkgitaly = 0,
            totalkgspain = 0,
        	
        	profitmalta = 0, profititaly = 0, profitspain = 0,
        	profitcargmalta = 0, profitcargitaly = 0, profitcargspain = 0;
        
        //Declaring a boolean variable to be used for option 6 to exit program.	
        
        boolean exit = false;
        
        
        /* Putting the program in a do/while loop so menu keeps displaying after each section until 
           exit option is chosen. */
        
        	do {
        		
        		/*Menu being called from method and gives 6 options to the user. 
        		 Chosen option will be stored in "choice" variable.*/
        
        printmenu.menu();
		
        
		choice = sc.nextInt();
		
		//Creating a switch statement for the 6 menu options.
		
        switch (choice) {
	    
	    
	    case 1 :  /* Asks user to input total number of passengers
	              and a while loop to check if a positive number input is entered.
	              If a negative input is entered the user is asked again to enter a positive entry.
	              All inputs are stored in a variable.
	              After a positive entry program continues to next question. */
	    	
	    	     pm = commercialmalta.getTotalPassengers();	 
	    		 
	             cm = cargomalta.getcargomalta();
	          
           
	           
	           break;
	           
	
	    case 2 : /* Asks user to input total number of passengers
                    and a while loop to check if a positive number input is entered.
                    If a negative input is entered the user is asked again to enter a positive entry.
                    All inputs are stored in a variable.
                    After a positive entry program continues to next question. */
	    	
	    	    pi = commercialitaly.getcommitaly();	    	    
	    	    
	    	    ci = cargoitaly.getcargoitaly();
	    	    
	    	    
               break;
        
	    case 3 : /* Asks user to input total number of passengers
                    and a while loop to check if a positive number input is entered.
                    If a negative input is entered the user is asked again to enter a positive entry.
                    All inputs are stored in a variable.
                    After a positive entry program continues to next question. */
	    	
	    	
	    	     ps = commercialspain.getcommspain();
	    	     
	    	     cs = cargospain.getcargospain();
	    	     
	    	     break;
	    	       
               
               
	    case 4: //Arithmetic operations to calculate statistics and storing them in a variable.
	    	
	            inccommal = pm * passmalta;
	            inccomita = pi * passitaly;
	            inccomspa = ps * passspain;
	            inccarmal = cm * cargmalta;
	            inccarita = ci * cargitaly;
	            inccarspa = cs * cargspain;
	            cosm = pm * runcommalta;
	            cosi = pi * runcomitaly;
	            coss = ps * runcomspain;
	            carm = cm * runcargmalta;
	            cari = ci * runcargitaly;
	            cars = cs * runcargspain;
	            profitmalta = inccommal - (runcommalta * pm);
	            profititaly = inccomita - (runcomitaly * pi);
	            profitspain = inccomspa - (runcomspain * ps);
	            profitcargmalta = inccarmal - (runcargmalta * cm);
	            profitcargitaly = inccarita - (runcargitaly * ci);
	            profitcargspain = inccarspa - (runcargspain * cs);
	            totalkgmalta = (cm * cargweightmalta);
	            totalkgitaly = (ci * cargweightitaly);
	            totalkgspain = (cs * cargweightspain);
	            
	            
	            System.out.println("");
	            System.out.println("Statistics calculated. Press 5 to view :");
	            
	            break;
	            
	    case 5:  /*Displaying the results in two tables using the printf() function to be
	               able to edit string placement and have a neater output. */
	    	
	    	    System.out.printf("%s\n","|Commercial Flights | Malta | Italy | Spain |");
	            System.out.println("---------------------------------------------------");
	            System.out.printf("%s%4d%8d%8d\n","|Total Passengers    |",pm,pi,ps);
	            System.out.printf("%s%4d%8d%8d\n","|Total Income €      |",inccommal,inccomita,inccomspa);
	            System.out.printf("%s%4d%8d%8d\n","|Running Costs €     |",cosm,cosi,coss);
	            System.out.printf("%s%4d%8d%8d\n","|Total Profit €      |",profitmalta,profititaly,profitspain);
	            System.out.println("");
	            System.out.println("----------------------------------------------------");
	            System.out.println("");
	            System.out.printf("%s\n","|Cargo Flights      | Malta | Italy | Spain |");
	            System.out.println("---------------------------------------------------");
	            System.out.printf("%s%4d%8d%7d\n","|Total Flights      |",cm,ci,cs);
	            System.out.printf("%s%4d%8d%8d\n","|Total Income €     |",inccarmal,inccarita,inccarspa);
	            System.out.printf("%s%4d%8d%8d\n","|Running Costs €    |",carm,cari,cars);
	            System.out.printf("%s%4d%8d%8d\n","|Total Profit €     |",profitcargmalta,profitcargitaly,profitcargspain);
	            System.out.println("");
	            System.out.println("----------------------------------------------------");
	            System.out.println("");
	            
	            /*Operations calculating total number of passenger from the three locations and
	            the total cargo delivered in kilogrammes */
	            
	            System.out.println("Total number of passengers who used airline : " + (pm + pi + ps));
	            System.out.println("");
	            System.out.println("Total weight of cargo Kg delivered :" + (totalkgmalta + totalkgitaly + totalkgspain));
	            System.out.println("");
	            
	            //If statements to compare profit results and display most profitable location.
	            
	            if (profitmalta > profititaly && profitmalta > profitspain)
	            System.out.println("Most profitable commercial location is Malta. " + profitmalta + " € profit done.");
	            
	            else if (profititaly > profitmalta && profititaly > profitspain)
	            System.out.println("Most profitable commercial location is Italy. "+ profititaly + " € profit done.");
	            
	            else 
	            System.out.println("Most profitable commercial location is Spain. "+ profitspain + " € profit done.");
	            
	            System.out.println("");
	            
	            if (profitcargmalta > profitcargitaly && profitcargmalta > profitcargspain)
		        System.out.println("Most profitable cargo location is Malta. "+ profitcargmalta + " € profit done.");
		            
		        else if (profitcargitaly > profitcargmalta && profitcargitaly > profitcargspain)
		        System.out.println("Most profitable cargo location is Italy. "+ profitcargitaly + " € profit done.");
		            
		        else 
		        System.out.println("Most profitable cargo location is Spain. "+ profitcargspain + " € profit done.");
	            
	            
	            	break;
	    
	    
	    case 6 : //Turns boolean variable to true and program exits.
	    	
	    	
	    	exit = true;
	    	System.out.println("Program exited.");
	    	
	    
	        break;
        
	    
        
	}
	
        	} while (!exit);
        	
	}
	
	
		}
	
   
         
	
	
	
	


		
		
		

