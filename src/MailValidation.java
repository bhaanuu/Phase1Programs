import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.Arrays;


public class MailValidation {

	public static void main(String[] args) 
	{
		System.out.println("Enter input");
		
		Scanner sc =  new Scanner(System.in);
		String input = sc.nextLine();
		
		String str[]= {"duggana@gmail.com","bhanu@gmail.com","Me@gmail.com"};
   
		
		int c=0;
		
	    for(int i=0; i< str.length ;i++)
	    {
		Pattern pattern = Pattern.compile(str[i]);
		Matcher match = pattern.matcher(input);
		
		if(match.matches())
			break;
		else
			c++;

		}
	    
	    if(c<str.length)
	    	System.out.println("valid");
	    else
	    	System.out.println("invalid");
	   
	}
}
