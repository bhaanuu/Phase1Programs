import java.util.Scanner;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.Arrays;
import java.util.List;


public class logfile 
{
	int n1,n2,result;
	char op;
	public void Calculator() throws IOException
	{
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		int b=sc.nextInt();
		int result = a+b;
		System.out.println("Addition="+result);
			
			File file=new File("C:\\Files\\testFile1.txt");
			
			if(file.createNewFile())
			{
				System.out.println("File is created");
			}
			else
			{
				System.out.println("File is already Exist");
			}			
			
			FileWriter w=new FileWriter(file);
			w.append("First num="+a+"\nSecond num="+b+"\nAddition="+result);
			w.close();
			
			FileReader reader= new FileReader("C:\\Files\\testFile1.txt");
			int data;
			while((data=reader.read())!=-1)
			{
				System.out.print((char)data);
			}
			System.out.println(" ");
		}
	
	public static void main(String[] args) throws IOException
	{
		logfile f = new logfile();
		f.Calculator();
	}
		
		}
