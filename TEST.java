import java.util.*;
import java.lang.*;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner scan=new Scanner(System.in);
		int n=0;
		while(n!=42)
		{
			int num = scan.nextInt();
			if(num!=42)
			{
				System.out.println(num);
				n=num;
			}
			else
				break;
		}
	}
}