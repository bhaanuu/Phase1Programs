import java.util.Scanner;
public class longestSquence {
		public static int long_seq(int arr[], int len){
		      int arr_seq[] = new int[len];
		      int i, j, max = 0;
		      for (i = 0; i < len; i++)
		      {
		         arr_seq[i] = 1;
		      }
		      for (i = 1; i < len; i++)
		      {
		      for (j = 0; j < i; j++)
		      {
		      if (arr[i] > arr[j] && arr_seq[i] < arr_seq[j] + 1)
		      arr_seq[i] = arr_seq[j] + 1;
		      }
		      }
		      for (i = 0; i < len; i++)
		      {
		      if (max < arr_seq[i])
		      max = arr_seq[i];
		      }
		      return max;
		      }
		
	public static void main(String[] args)
	{
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) 
        {
            arr[i] = sc.nextInt();
        }

        int arr_len = arr.length;
        System.out.println("The length of the longest increasing subsequence is " +  long_seq(arr, arr_len));
     }

        
}
    