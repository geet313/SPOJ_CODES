import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner scan=new Scanner(System.in);
    long n=scan.nextLong();
    long count=0;
    int k=(int) Math.sqrt(n);
    for(int i=1; i<=k; i++)
    {
    	count = count + ((n/i) - (i-1));
    }
    System.out.println(count);
	}
}