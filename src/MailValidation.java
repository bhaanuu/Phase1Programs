import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;
import java.util.Arrays;


public class MailValidation {

	public static void main(String[] args) 
	{
		Scanner sc =  new Scanner(System.in);
		System.out.println("Enter input");
		String str[]= {"duggana@gmail.com","bhanu@gmail.com","Me@gmail.com"};
		
		String input = sc.nextLine();
		int c=0;
		
	    for(int i=0; i<=2;i++)
	    {
		Pattern pattern = Pattern.compile(str[i]);
		Matcher match = pattern.matcher(input);
		
		if(match.matches())
			break;
		else
			c++;
		}
	    
	    if(c<=2)
	    	System.out.println("valid");
	    else
	    	System.out.println("invalid");
	   
	}
}
