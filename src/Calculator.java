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
		int a = sc.nextInt();
		int b = sc.nextInt();
		Calculator c = new Calculator();
		System.out.println("Addition:"+c.Add(a,b));
		System.out.println("Subtraction"+c.Subtraction(a,b));
		System.out.println("Multiply"+c.Multiply(a,b));
		System.out.println("Division"+c.Division(a,b));
		
	}

}
