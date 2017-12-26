import java.util.*;
import java.lang.*;
import java.math.BigInteger;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner scan=new Scanner(System.in);
    int t=scan.nextInt();
    while(t>0)
    {
    	
    	BigInteger fact=BigInteger.ONE;
    	int n=scan.nextInt();
    	for(int i=n;i>0;i--)
    	{
    		fact = fact.multiply(new BigInteger(String.valueOf(i)));
    	}
    	System.out.println(fact);
    	
    t--;}
	}
}