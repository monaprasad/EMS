package Girnar;

import java.util.*;

public class Execution
{
	public static int option()
	{
		System.out.println("Choose one option ");
	  	System.out.println("1) For manager :");
	  	System.out.println("2) For Employee :");
	  	Scanner scr = new Scanner(System.in);
	  	return scr.nextInt();
	
	}
  public static int menu()
  {
    System.out.println("Choose one option from following : ");
  	System.out.println("1) Add a new employee.");
  	System.out.println("2) Retrive an employee via emp_ssn.");
  	System.out.println("3) Delele an employee via emp_ssn");
  	System.out.println("4) List all employees.");
  	System.out.println("5) Change the Role management");
  	System.out.println("6) Exit.");
  	Scanner sc = new Scanner(System.in);
  	return sc.nextInt();
  }

  public static void main(String[] args)
   {
	  Details detailsEmployee=new Employee();
	  Details detailsManager=new Manager();
	  
	  
	  int option=option();
	  switch(option)
	  {
	  case 1:
		  
		HashMap<Integer, Employee> hm = new HashMap<Integer, Employee>();
		int choice = menu();
		while(choice != 5)
		{
		  System.out.println();
		  switch (choice)
		  {
	      case 1:
		Scanner no = new Scanner(System.in);
		  do {

			System.out.println("Please enter EMP_SSN");
			while (!no.hasNextInt()) {
				System.out.println("It's not a number. Please enter a valid no.");
				no.next(); // this is important!
			}
			int n = no.nextInt();

			String name; 
			while (true) {
				System.out.println("Please enter name");
				name = no.next();
				try {
					int a = Integer.parseInt(name);
					System.out.println("Its not a string.Please enter the string");
					continue;
				} catch (Exception e) {
					
				}
				
				break;
			}
			String designation; 
			while (true) {
				System.out.println("Please enter designation");
				designation = no.next();
				try {
					int a = Integer.parseInt(name);
					System.out.println("Its not a string.Please enter the string.");
					continue;
				} catch (Exception e) {
					
				}
				
				break;
			}
			Employee employee=new Employee();
			employee.setSsn(n);
			employee.setName(name);
			employee.setDesignation(designation);
//			detailsEmployee.setSsn(n);
//			detailsEmployee.setName(name);
//			detailsEmployee.setDesignation(designation);

			hm.put(n,employee);
			System.out.println("Do you want to add another employee deatails. (Yes/No) : ");
			String value = no.next();
			if (!value.equalsIgnoreCase("yes")) {
				break;
			}
		} while (true);


     break;
        
	      case 2:
	    	  Scanner input3 = new Scanner(System.in);

		      System.out.println("Please enter the SSN of the employee you wish to retrive: ");
		      int retStr = input3.nextInt();
		  
	            if(hm.containsKey(retStr))
	            {
	            	
	         Employee received_data = hm.get(retStr);
	            	System.out.println(received_data.toString());
	            	System.out.println("");

		        }

		      else
		      {
			        System.out.println("No such SSN.");
			        System.out.println("");
		      }


	break;
	
	      case 3:
	    	  Scanner input2 = new Scanner(System.in);
	    	  System.out.println("Please enter the SSN of the employee you wish to delete: ");
	    	  int idToDelete = input2.nextInt();
	    	  if(hm.containsKey(idToDelete))
	            {
	    		  detailsEmployee = hm.get(idToDelete);
	            	hm.remove(idToDelete, detailsEmployee);
	            	System.out.println("");

		        }
	    	  break;
	    	   
	      case 4:
	  	       System.out.println("list all employees details :");

	  			for (Map.Entry r : hm.entrySet()) {
	  				System.out.println( r.getValue());
	  			}
	  		
	       break;
     
	  case 6:
		     
	    break;
	}
	  choice = menu();
  }
	  break;
	  case 2:
		  System.out.println("Not Allowed");
		  break;
	  }
}
   }
  
 
  


