import java.util.Scanner;
public class Calculator {
	int Add(int a, int b)
	{
		return a+b;
	}
	int Subtraction(int a, int b)
	{
		return a-b;
	}
	int Multiply(int a, int b)
	{
		return a*b;
	}
	int Division(int a, int b)
	{
		return a/b;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Operation \n 1. Addition \n 2. Subtraction \n 3. Multiplication \n 4. Division ");
		int operation = sc.nextInt();
		if(operation < 5)
		{
		System.out.println("Enter two values");
		int a = sc.nextInt();
		int b = sc.nextInt();
		Calculator c = new Calculator();
		if(operation == 1)
		System.out.println("Addition: "+c.Add(a,b));
		if(operation == 2)
		System.out.println("Subtraction: "+c.Subtraction(a,b));
		if(operation == 3)
		System.out.println("Multiply: "+c.Multiply(a,b));
		if(operation == 4)
		System.out.println("Division: "+c.Division(a,b));
		}
		else
		System.out.println("Invalid input");	
	}
}
