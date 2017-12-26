import java.util.*;
import java.lang.*;

class NthDivisibleNumber {
static long alt;
	public static void main(String[] args)
	{
		try
		{
		Scanner scan = new Scanner(System.in);
		
		int t = scan.nextInt();
		while(t>0)
		{
			
			long a = scan.nextLong();
			long b = scan.nextLong();
			long n = scan.nextLong();
			if(n==0){
				System.out.println("0");
		alt=0;}
			else if(a==0&& b==0)
			{
				System.out.println("0");
	alt = 0;	}
			else
			{
			long ans = Bs(a,b,n);
			alt = ans;
			System.out.println(ans);
			}
		t--;}
	}catch(Exception e)
	{
		System.out.println(alt);
	}
	}

	private static long Bs(long a, long b, long n) {
		// TODO Auto-generated method stub
		long low=1;
		long mid=0,count;
		long high = (long) 1e18;
		long lcm = (a*b)/Gcd(a,b);
		while(low<=high)
		{
			mid = (low+high)/2;
			count = ((mid/a) + (mid/b)) - (mid/lcm);
			if(count>n)
				high = mid-1;
			if(count<n)
				low = mid+1;
			if(count==n)
				break;
		}
		while((mid%a)!=0 && (mid%b)!=0)
			mid--;
		return mid;
	}

	private static long Gcd(long a, long b) {
		// TODO Auto-generated method stub
		if(a==0)
			return b;
		else
			return Gcd(b%a,a);
	}
}
