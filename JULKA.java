import java.util.*;
import java.lang.*;
import java.math.BigInteger;

class Main
{
	public static void main (String[] args) throws java.lang.Exception
	{
			Scanner scan=new Scanner(System.in);

	int t = 10;
	
	while(t>0)
	{
		
		BigInteger num=scan.nextBigInteger();
		BigInteger dif=scan.nextBigInteger();
		BigInteger number = num.subtract(dif);
		
		BigInteger com = number.divide(BigInteger.valueOf(2));
		BigInteger res = com.add(dif);
		System.out.println(res);
		System.out.println(com);
		
		t--;}
	}
}