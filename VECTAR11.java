import java.util.*;
import java.lang.*;

class SquareGame {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int arr[] = new int[1000001];
		for(int i=1;i<=1000;i++)
		{
			arr[i*i]=1;
		}
		for(int i=1;i<=1000000;i++)
		{
			if(arr[i]==0)
				check(arr,i);
		}
		int t = scan.nextInt();
		while(t>0)
		{
			int n = scan.nextInt();
			if(arr[n]==1)
				System.out.println("Win");
			else
				System.out.println("Lose");
		t--;}
	}

	private static void check(int[] arr, int i) 
	{
		int s = (int) Math.sqrt(i);
		for(int j =s;j>=1;j--)
		{
			if(arr[i-(j*j)]==0)
			{
				arr[i]=1;
			break;
		}
		}
	}
}
