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
    	int sum=0;
    	int n = scan.nextInt();
    	int []m = new int[n];
    	int []f = new int [n];
    	for(int i=0; i<n; i++)
    	{
    		m[i]=scan.nextInt();
    	}
    	  Arrays.sort(m);
    	for(int i=0; i<n; i++)
    	{
    		f[i]=scan.nextInt();
    	}
    	  Arrays.sort(f);
    	for(int i=0; i<n; i++)
    	{
    		sum=sum + (m[i]*f[i]);
    	}
    	System.out.println(sum);
    	
    t--;}
	}
}