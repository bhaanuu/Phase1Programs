import java.util.Scanner;
public class Arrays 
{
	public static void main(String[] args) 
	{
		int[] a = {11,22,33,44};
		
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]);
		}
		
		int[][] b= {{10,20,30},{40,50,60}};

		for(int k=0;k<b.length;k++)
			for(int n=0;n<=b.length;n++)
				System.out.println(b[k][n]);		
	}

}
