import java.util.*;
import java.lang.*;

 class Gcd3 {

	 public static void main(String[] args)
	 {
		 Scanner scan = new Scanner(System.in);
		 long a  = scan.nextLong();
		 long b  = scan.nextLong();
		 long c  = scan.nextLong();
		 long a1=0;
		 long b1=0;
		 long c1=0;
		 if(a>b && a>c)
		 {
			 a1 = a;
			 if(b>c)
			 {
				 b1=b;
				 c1=c;
			 }
			 else
			 {
				 b1=c;c1=b;
			 }
		 }
		 else if(b>a && b>c)
		 {
			 a1 = b;
			 if(a>c)
			 {
				 b1=a;
				 c1=c;
			 }
			 else
			 {
				 b1=c;c1=a;
			 }
		 }
		 else if(c>b && c>a)
		 {
			 a1 = c;
			 if(b>a)
			 {
				 b1=b;
				 c1=a;
			 }
			 else
			 {
				 b1=a;c1=b;
			 }
		 }
		 
		 long ans1 = GCD(a1,b1);
		 long ans = GCD(ans1,c1);
		 System.out.println(ans);
	 }

	private static long GCD(long a1, long b1) 
	{
		if(b1==0)
			return a1;
		return GCD(b1,a1%b1);
		
	}
}
