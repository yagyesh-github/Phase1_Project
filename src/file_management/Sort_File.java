package file_management;
import java.io.*;
import java.util.Arrays;

import java.util.Scanner;



    public class Sort_File{
    	Scanner scanner;

        public  void sortfile()
        {
        	
     	    scanner = new Scanner( System.in );
     	    System.out.println("Enter the directory:\n ");
     	    String dirPath = scanner.nextLine();
     	   File folder = new File(dirPath);
     	   if(folder.isDirectory()){
       	
                File[] fileList = folder.listFiles();

                Arrays.sort(fileList);

                System.out.println("\nTotal number of items present in the directory: " + fileList.length+"\n");


                // Lists only files since we have applied file filter
                for(File file:fileList)
                {
                    System.out.println(file.getName());
                }

                // Creating a filter to return only files.
                FileFilter fileFilter = new FileFilter()
                {
                    @Override
                    public boolean accept(File file) {
                        return !file.isDirectory();
                    }
                };

                fileList = folder.listFiles(fileFilter);

                // Sort files by name
                Arrays.sort(fileList, (f1, f2) -> ((File) f1).getName().compareTo(((File) f2).getName()));
                System.out.println("\nTotal number of files present in the directory: " + fileList.length);
                //Prints the files in file name ascending order
                for(int i=0;i<fileList.length;i++)
                {   
                	File file=fileList[i];
                    System.out.println(file.getName());
                    System.out.println("\n");
                }
            }
     	   else 
     		   System.out.println("Enter the valid directory to be viewed\n");
  	   }
}
        	
