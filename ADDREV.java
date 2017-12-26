import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
	long t=scan.nextLong();
	while(t>0)
	{
		int a1=0,b1=0,s1=0;
	  long a=scan.nextLong();
	  while(a>0)
	  {
		  long rev=0;
		int r=(int) (a%10);
		a1=a1*10+r;
		a=a/10;
	  }
	  long b=scan.nextLong();
	  while(b>0)
	  {
		  long rev=0;
		int r=(int) (b%10);
		b1=b1*10+r;
		b=b/10;
	  }
	  int sum=a1+b1;
	  while(sum>0)
	  {
		  long rev=0;
		int r=(int) (sum%10);
		s1=s1*10+r;
		sum=sum/10;
	  }
	  System.out.println(s1);
		
		
	t--;}	
	}
}