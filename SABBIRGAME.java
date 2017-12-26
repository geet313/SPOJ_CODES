import java.util.*;
import java.lang.*;

 class SabbirGame {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		int t = scan.nextInt();
		while(t>0)
		{
			long min=999999999;
			int ind =0;
			int n = scan.nextInt();
			long sum=0;
			int arr[] = new int[n];
			for(int i=0; i<n; i++)
			{
				arr[i] = scan.nextInt();
				sum = sum + arr[i];
				min = Min(min,sum);
			}
			if(min>0)
				System.out.println("0");
			else
			{
				long a = -min +1;
				System.out.println(a);
			}
		t--;}
	}

	private static long Min(long min, long sum) 
	{
		if(min>sum)
			return sum;
		else
			return min;
	}
}
