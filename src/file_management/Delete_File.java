package file_management;

import java.io.File;
import java.util.Scanner;


public class Delete_File {
	 Scanner sc;
	 Scanner scanner;
	public void Delete(){
		  scanner = new Scanner( System.in );
	 	    System.out.println("Enter the directory path:\n ");
	 	    String dirPath = scanner.nextLine();
	 	   File folder = new File(dirPath);
	       if(folder.isDirectory()){
		    sc= new Scanner(System.in);
		    System.out.println("Enter the file name to be deleted\n");
		    String name=sc.nextLine();
			String f=dirPath+File.separator+name;
			File file= new File(f);
		    if(file.delete()){
		    	System.out.println("File has been deleted.\n");
		    }
		    else{
		    	System.out.println("File doesn't exist.\n");
		    }
       }
	       else
	    	   System.out.println("NOT A VALID DIRECTORY!!");
	       
	}
	
}    