import java.util.Scanner;

class SpojCoin {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext())
		{
			long n = scan.nextLong();
			long ans = Coin(n);
			System.out.println(ans);
		}
		
	}

	private static long Coin(long n) 
	{
	 if(n<12)
		 return n;
	 
	 return Math.max(n, (Coin(n/2)+Coin(n/3)+Coin(n/4)) );
	}
}
