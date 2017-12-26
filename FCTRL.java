import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		
			Scanner scan = new Scanner(System.in);
		long t=scan.nextLong();
		while(t>0)
		{
			long n = scan.nextLong();
			long ans =0;
            for(long i =5; n/i>0; i=i*5)
                {
                 ans = ans+n/i;
                }
			System.out.println(ans);
			t--;
		}
	}
}