import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner scan=new Scanner(System.in);
int s=0;
	long n = scan.nextLong();
	while(n>1)
	{
		if(n%2==0)
		{
			n = n/2;
			
		}
		else
		{
			s=1;
			break;
		}
		
	}
	if(s==0)
	{
		System.out.println("TAK");
	}
	else
	{
		System.out.println("NIE");
	}
	}
}