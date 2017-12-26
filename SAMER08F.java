import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner scan=new Scanner(System.in);

	int t=1;
	while(t>0)
	{
		int n = scan.nextInt();
		if(n==0)
		{
			t=0;
			break;
		}
		else
		{
				long sq = ((n)*(n+1)*(2*n +1))/6;
				System.out.println(sq);
		}
	}
	System.out.println(" ");
	}
}