import java.io.File;
import java.io.IOException;
import java.util.Arrays;
import java.util.Scanner;
public class lockedme{
	
	String Directory;
	File file_name;
	
	public lockedme()
	{
		Directory = System.getProperty("user.dir");
		file_name = new File(Directory+"/Files");
		if(!file_name.exists())
			file_name.mkdirs();
		System.out.println("Directory is "+file_name+"/files");
		
	}
	
	void sortingFiles() 
	{
        if (file_name.list().length==0)
            System.out.println(" folder is empty");
        else {
            String[] list = file_name.list();
            System.out.println(" files in "+ file_name +" are :");
            Arrays.sort(list);
            for (String str:list) {
                System.out.println(str);
            }
        }
    }
	
	
	void addFiles(String fname) throws IOException 
	{
        File filepath = new File(file_name +"/"+fname);
        String[] list = file_name.list();
        for (String file: list) {
            if (fname.equalsIgnoreCase(file)) {
                System.out.println("File " + fname + " is already exists in " + file_name);
                return;
            }
        }
        filepath.createNewFile();
        System.out.println("File "+fname+"is added successfully");
    }
	
	void deleteFile(String fname) {
        File filepath = new File(file_name +"/"+fname);
        String[] list = file_name.list();
        for (String file: list) {
            if (fname.equals(file) && filepath.delete()) {
                System.out.println("File " + fname + " is deleted successful ");
                return;
            }
        }
        System.out.println("File not found");
    }

    void searchFile(String fname) {
        String[] list = file_name.list();
        for (String file: list) {
            if (fname.equals(file)) {
                System.out.println("File " + fname + " Exists ");
                return;
            }
        }
        System.out.println("File not found");
    }
	
	


	public static void main(String[] args) throws IOException
	{
		
		lockedme lock = new lockedme();
		System.out.println("WELCOME TO Company Lockers Pvt. Ltd. \n      LockedMe.com");
		System.out.println("Press any key to enter the menu");
		System.in.read();
		System.out.println("Welcome to the Menu\n 1. Retrieve All Files inside the Main Folder\n 2. File Handling Operations\n 3. Close the app");

		
		Scanner sc = new Scanner(System.in);
		int ch = sc.nextInt();

		if(ch==1)
		{
			try
			{		
			lock.sortingFiles();
			}
			catch(Exception e)
			{
				System.out.println();
			}

			
		}
		
		if(ch==2)
		{
			System.out.println("Enter the file operation to do\n 1. Adding file\n 2. Deleting file\n 3. Searching file");
			int i=sc.nextInt();

			System.out.println("Enter filename");
			String fname = sc.next();

			
			if(i==1)
			{
			try
			{
				lock.addFiles(fname);
			}
			catch(Exception e)
			{
				System.out.println();
			}
			}
			if(i==2)
			{
			try
			{
				lock.deleteFile(fname);
			}
			catch(Exception e)
			{
				System.out.println();
			}
			} 
			if(i==3)
			{
			try
			{
				lock.searchFile(fname);
			}
			catch(Exception e)
			{
				System.out.println();
			}
			
			}
		}
		if(ch==3)
		{
			System.out.println("Thank You For Using LockedMe");
            System.exit(0);
        }
		if(ch>3)
			System.out.println("Enter valid key");
		
	
	}
	
	
	}



