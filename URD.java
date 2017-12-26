import java.util.*;
import java.lang.*;
import java.math.BigInteger;
class Main
{
	public static void main (String[] args) 
	{
		try{
			Scanner scan=new Scanner(System.in);
			long t = scan.nextLong();
			while(t>0)
			{
				String n1 = scan.next();
				String n2 = scan.next();
				BigInteger s1 = new BigInteger(n1);
				BigInteger s2 = new BigInteger(n2);
				BigInteger pro = s1.multiply(s2);
				System.out.println(pro);
				
			t--;}

	}catch(Exception e)
	{
		return;
	}
	}
}