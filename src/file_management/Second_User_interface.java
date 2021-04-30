package file_management;

import java.io.IOException;
import java.util.Scanner;

public class Second_User_interface  {
	Scanner sc;
		public void SecondInterface() throws IOException{
			
			Add_File fr=new Add_File();
			Delete_File df=new Delete_File();
			Search_File sf=new Search_File();
			First_User_Interface fui=new First_User_Interface();
	
			
		
		int c;   
	
	    
	   sc= new Scanner(System.in);
	
	     
	     System.out.print("Enter number 1.Add a file \n 2.delete a file \n 3.Search for a file\n 4.Previous options\n ");
	     c = sc.nextInt();
	
	    
	     switch (c)
	     {
	     case 1 :
	   	  fr.Add__File();
	
	        break;
	
	     case 2 :
	   	  df.Delete();
	
	        break;
	
	     case 3 :
	   	  sf.Search();
	        break;
	
	     case 4 :
	    	 
	    	 fui.firstuserinterface();
	       break;
	
	     default :
	        System.out.println("Invalid input!!!\n");

      	    break;
}
	    

		}
		
}