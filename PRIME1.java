import java.util.*;
import java.lang.*;

class PrimeGenerator {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t>0)
		{
			
			long n = scan.nextLong();
			long m = scan.nextLong();
			for(long i=n;i<=m;i++)
			{
				int count=0;
				for(long j=2;j<=Math.sqrt(i);j++)
				{
					if(i%j==0)
					{
						count=1;
						break;
					}
				}
				if(count==0 && i!=1)
					System.out.println(i);
			}
			System.out.println();
		t--;}
	}
}
