import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
	  	Scanner scan=new Scanner(System.in);
    int t=scan.nextInt();
    while(t>0)
    {
    	int a=scan.nextInt();
    	int c=a%10;
    	long b=scan.nextLong();
    	int k=(int) (b%4);
    	if(b==0)
    	{
    		System.out.println("1");
    	}
    	else
    	{
    	
    	if(k==0)
    	{
    		int kk=(int) Math.pow(c, 4);
    		int kkk = kk%10;
    		System.out.println(kkk);
    	}
    	else
    	{
    		int tt= (int) Math.pow(c, k);
    		int ttt = tt%10;
    		System.out.println(ttt);
    	}
    	}
    t--;}	
	}
}