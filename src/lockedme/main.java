package lockedme;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileWriter;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class main {

	    public static void main(String[] args) {
	    	Scanner obj=new Scanner(System.in);
	    	int ch;
	    	do {
	    	displayMenu();
	    	System.out.println(" enter your choice= ");
	    	ch=Integer.parseInt(obj.nextLine());
	    	switch(ch)
	    	{
	    	case 1 :getFiles();
	    	break;
	    	case 3: deleteFiles();
	    	break;
	    	case 2: createNewFile();
	    	break;
	    	case 4:searchFiles();
	    	break;
	    	case 5: System.exit(0);
	    	break;
	    	default:System.out.println(" invalid option ");
	    	break;
	    	}
	    	}
	    	while(ch>0);
	    	obj.close();
	    		
	    	}
	    	
	    	

	      
	    

	    public static void displayMenu() {
	        System.out.println("======================================================================");
	        System.out.println("\t\t Welcome to Lockedme.com designed by Dibyendu Paul    ");
	        System.out.println("======================================================================");
	        System.out.println(" please press one of the followings below : ");
	        System.out.println("\t\t1. Display all the Files ");
	        System.out.println(("\t\t2. Create new file "));
	        System.out.println("\t\t3. Delete a file ");
	        System.out.println("\t\t4. Search a file ");
	        System.out.println("\t\t5. Exit");
	        System.out.println("======================================================================");
	    }
	   

	    public static void getFiles() {
	        try {
	            File folder = new File("D:\\java");
	            File[] listofFile = folder.listFiles();
	            if (listofFile.length == 0) {
	                System.out.println(" no file exists");
	            } else {
	                for (var v : listofFile) {
	                    System.out.println(v.getName());
	                }
	            }
	        } catch (Exception ex) {
	            System.out.println(" some error occurred. please contact hr@123abc.com");
	        }


	    }

	    public static void createNewFile()  {
	    	try {
	    	Scanner obj=new Scanner(System.in);
	    	String fileName ;
	    	System.out.println("enter file name : ");
	    	fileName=obj.nextLine();
	    	//Scanner obj1 = new Scanner(new FileInputStream("D:\\java"), "UTF-8");
	    	int linescount;
	    	System.out.println("enter the number of lines in the fies");
	    	linescount=Integer.parseInt(obj.nextLine());
	    	FileWriter mywriter=new FileWriter("D:\\java"+ "\\" +fileName);
	    	for(int i=1;i<=linescount;i++) {
	    		System.out.println(" enter the " + i + " line= ");
					mywriter.write(obj.nextLine()+"\n");
					
					
	    	}
	    	System.out.println(" text file has been created successfully");
	    	
				
	    	mywriter.close();
	    	obj.close();
	    	
	    }
	    	catch(NoSuchElementException ex) {
	    		System.out.println(" file created successfully ");
	    	}
	    	catch(Exception ex) {
	    		System.out.println("for anyproblem contact hr@123abc.com");
	    	}
}

	    public static void deleteFiles() {
	        try{
	        String Filename;
	        System.out.println("enter the file name you want to delete = ");
	        Scanner obj = new Scanner(System.in);
	        Filename = obj.nextLine();
	            File folder = new File("D:\\java");
	            File file = new File(folder+ "\\"  + Filename);
	            if (file.exists()) {
	                file.delete();
	                System.out.println(" file " + Filename + " deleted successfully");
	            }
	             else
	                System.out.println(" file does not exist");


	        } 
	        catch (Exception ex) {
	            System.out.println(" please check & enter correct file name ");
	        }
	    }
	    
	    public static void searchFiles() {
	    	try {
	    	String filename;
	    	Scanner obj=new Scanner(System.in);
	    	System.out.println("enter the file name this to be search");
	    	filename=obj.nextLine();
	    	File folder=new File("D:\\java");
	    	File[]listOfFiles=folder.listFiles();
	    	LinkedList<String> fileNames= new LinkedList<String>();
	    	for(var l:listOfFiles)
	    		fileNames.add(l.getName());
	    	if(fileNames.contains(filename))
	    		System.out.println("file is available");
	    	else
	    		System.out.println("file not available");
	    }
	    catch(Exception Ex) {
	    	System.out.println(" error while searching the file please contact hr@123abc.com ");
	    }
	}

}
