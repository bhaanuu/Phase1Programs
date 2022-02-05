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

		for(int i=0;i<b.length;i++)
			for(int j=0;j<=b.length;j++)
				System.out.println(b[i][j]);		
	}

}
