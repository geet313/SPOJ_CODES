import java.math.BigInteger;
import java.util.Scanner;

 class Summation {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		int tt=1;
		
		while(tt<=t)
		{
			BigInteger sum = BigInteger.ZERO;
			BigInteger modd = BigInteger.valueOf(100000007);
			int n = scan.nextInt();
			//BigInteger nn = BigInteger.valueOf(n+1);
			BigInteger arr[] = new BigInteger[(int)n];
			for(int i=0;i<n;i++)
			{
				arr[i] = scan.nextBigInteger();
			}
			for(int i=0;i<n;i++)
			{
				sum = ( (sum.mod(modd)).add((arr[i].mod(modd) ))).mod(modd);
			}
			BigInteger qw = BigInteger.valueOf(2);
			BigInteger po = (qw.pow(n-1)).mod(modd);
			//BigInteger nn = BigInteger.valueOf(po);

			sum = (sum.multiply(po.mod(modd))).mod(modd);
			System.out.println("Case "+tt+":"+" "+sum);
		//	System.out.println("Case tt: sum");
		tt++;}
	}
}
