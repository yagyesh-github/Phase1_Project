package file_management;

import java.io.File;
import java.util.Scanner;

public class Search_File {
	Scanner sc;
	Scanner scanner;
		public void Search(){
				 scanner = new Scanner( System.in );
				System.out.println("Enter the directory:\n ");
				String dirPath = scanner.nextLine();
			    File directory= new File(dirPath);
			   
			    if(directory.isDirectory()){
			    
			    	String[] flist = directory.list();
			    	sc= new Scanner(System.in);
			    	System.out.println("enter the file name to be searched\n");
				    String name=sc.nextLine();
				    int flag=0;
				   
				    if(flist==null){
				    	System.out.println("Empty directory!!!\n");
			    	}
				     
				    else{
				    	for(int i=0;i<flist.length;i++){
				    			String filename=flist[i];
				    			if(filename.equalsIgnoreCase(name)){
				    					System.out.println(filename+ "  found\n");
				    					flag=1;
					            }
					  
				        }
				    	
			       }
				    if(flag==0){
						   System.out.println("File not found!!!\n");
					     }
				    
			    }
				    
				    else 
				           System.out.println("NOT A VALID DIRECTORY");
				  
			 
	   
	     } 
}