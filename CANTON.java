import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner scan=new Scanner(System.in);
	int t =scan.nextInt();
	while(t>0)
	{
		long n = scan.nextLong();
		long sum=0;
		long pre=0;
		long pre1=0;
		for(long i=1; i<n; i++)
		{
		 pre1=sum;	
		 sum=sum+i;
		 pre=i;
		 if(sum>=n)
		 {
			 break;
		 }
		}
		
		long dif = n-pre1;
		
		if(pre%2!=0)
		{
		System.out.println("TERM"+" "+(n)+" "+"IS"+" "+( pre-(dif-1))+"/"+(1+(dif-1)));
		}
		else
		{
			System.out.println("TERM"+" "+(n)+" "+"IS"+" "+(1+(dif-1))+"/" +(pre-(dif-1)));
		}
	t--;}
	}
}