
public class Calculator {
	int add(int a, int b)
	{
		return a+b;
	}
	int sub(int a, int b)
	{
		return a-b;
	}
	int div(int a, int b)
	{
		return a/b;
	}
	int mod(int a, int b)
	{
		return a%b;
	}

	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		System.out.println(c.add(5,5));
		System.out.println(c.sub(20,10));
		System.out.println(c.div(100,10));
		System.out.println(c.mod(10,10));
	}

}
