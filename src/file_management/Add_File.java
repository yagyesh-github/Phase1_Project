package file_management;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Add_File {
	 Scanner scanner;
	 Scanner sc;
	public void Add__File() throws IOException{
		 
 	     scanner = new Scanner( System.in );
 	    System.out.println("Enter the directory path:\n ");
 	    String dirPath = scanner.nextLine();
 	   File folder = new File(dirPath);
       if(folder.isDirectory()){
	    sc= new Scanner(System.in);
        System.out.println("Enter the file name\n");
	    String name=sc.nextLine();
		String f=dirPath+File.separator+name;
		File file= new File(f);
		if(name.isEmpty()){
			System.out.println("Name of the file was not inputted.\n ");
		}
		boolean result;
		try{
			result= file.createNewFile();
			if(result){
				System.out.println("File created"+file.getCanonicalPath()+"\n");
			}
			else{
				System.out.println("File already exist in the location"+file.getCanonicalPath()+"\n");
			}
		}
		catch(IOException e){
			System.out.println("Please check the input\nTry creating/inputting a new/another directory\n");
		}
		
       }
       else System.out.println("NOT A VALID DIRECTORY!!\n");
		
	}
}
