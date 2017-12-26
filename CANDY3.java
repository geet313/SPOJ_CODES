import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner scan=new Scanner(System.in);

	long t = scan.nextLong();
	while(t>0)
	{
		System.out.println(" ");
		long sum=0;
		long n = scan.nextLong();
		long[] arr=new long[(int) n];
		for(long i=0; i<n; i++)
		{
			arr[(int)i] = scan.nextLong();
			sum = (sum + arr[(int)i]) % n;
		}
		if(sum==0)
		{
			System.out.println("YES");
		}
		else
		{
			System.out.println("NO");
		}
	t--;}
	}
}