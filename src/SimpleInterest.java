import java.util.Scanner;

public class SimpleInterest {

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int p = sc.nextInt();
		int r = sc.nextInt();
		int n = sc.nextInt();
		int SI =0;
		SI= (p*r*n)/100;
		System.out.println("Simple Interest :"+SI);
	}
}
