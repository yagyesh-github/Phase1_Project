package file_management;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class First_User_Interface 
{		 Scanner sc;
	public void firstuserinterface() throws IOException {
		  int i=0;
	      Sort_File sof=new Sort_File();
			
	      Second_User_interface suf=new Second_User_interface();
		      
		  sc = new Scanner(System.in);
	      while(i<7){
		  try{ 
		
	    
	      System.out.print("Enter ur choice \n 1.view all files in directory \n 2.Add,delete or search for a file \n 3.Close the application\n");
	      int choice = Integer.parseInt(sc.nextLine());
	   
	      switch (choice)
	      {
	      case 1 :
	    	  sof.sortfile();
	         break;
	
	      case 2 :
	    	  suf.SecondInterface();
	    	  break;
	          
	      case 3 :
			System.out.println("Application has closed.\n");
	    	  	System.exit(0);
	
	         break;
	
	   
	      default :
	         System.out.println("Invalid input!!!\n");
	      }
	     
		     }
		 catch(NoSuchElementException e){
			   System.out.println("Oops!!error");
	     }  
		  catch(NumberFormatException e){
			   System.out.println("Don't enter anything except numbers between 1-3 \n");
	     }  
		i++;
		if(i==7)System.out.println("maximum number of chances exceeded!!!!\n \nRestart the application.");
	}
}

}
