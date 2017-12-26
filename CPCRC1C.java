import java.util.*;
import java.lang.*;

class Subsets
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
	int s=1;
	while(s>0)
	{
	long a = scan.nextLong();
    long b = scan.nextLong();
	if(a!=-1 && b!=-1)
	{
		
		long aa = SumOfDigits(a);
		long bb = SumOfDigits(b);
		   int sum = 0;
		    while (a != 0)
		    {
		        sum += a %10;
		        a   = a /10;
		    }
		    
		long ans = bb-aa+sum;
		System.out.println(ans);
		
		
	}
	else
	{
		s=0;
		break;
	}
	}
	}
	
	public static long SumOfDigits(long n)
{
	if(n<10)
		return n*(n+1)/2;
	long d = (int) Math.log10(n);
	//System.out.println(d);
	long [] arr = new long[(int) (d+1)];
	arr[0]=0;
	arr[1]=45;
	for(long i=2; i<=d; i++)
	{
		arr[(int) i] = (int) (arr[(int) (i-1)]*10 + 45*(Math.pow(10, i-1)));
	}
	long p = (int) (Math.pow(10,d));
	long msd = (int) (n/p);
	return msd*arr[(int) d] + (msd*(msd-1)/2)*p + msd*(1+n%p) + SumOfDigits(n%p);
}
}