import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
			
			Scanner scan=new Scanner(System.in);
			long n = scan.nextLong();
			
			long s = 10;
			long count = 0;
			while(s>9)
			{
				long sum =0;
				
				while(n>0)
				{
					
					
					int rem = (int)n%10;
					sum = sum + (rem*rem);
					n = n/10;
					
				}
				count++;
				
				n=sum;
				s=sum;
			}
			
			if(s==1)
			{
				System.out.println(count);
			}
			else
			{
				System.out.println("-1");
			}
             			
	}
}