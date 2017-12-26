import java.util.*;
import java.lang.*;

class MathLove {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int t = scan.nextInt();
		while(t>0)
		{
			long y = scan.nextLong();
			long ans = (long) ((-1 + (Math.sqrt(1+(8*y))))/2);
			long che = (ans*(ans+1))/2;
			if(che==y)
				System.out.println(ans);
			else
				System.out.println("NAI");
		t--;}
	}
}
