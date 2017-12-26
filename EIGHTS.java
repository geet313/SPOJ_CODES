import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner scan=new Scanner(System.in);

	long t = scan.nextLong();
	
	while(t>0)
	{
		
		long k = scan.nextLong();
		long s ;
		s = 192 + 250*(k-1);
		System.out.println(s);
		t--;}
	}
}