import java.util.*;
import java.lang.*;

class RunnerG {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner (System.in);
		double x = scan.nextDouble();
		double y = scan.nextDouble();
		double n = scan.nextDouble();
		double temp = Math.abs(x-y);
		double ans = Math.sqrt((n-temp)*(n-temp) * 2.0) * 2 + Math.sqrt(temp * temp * 2) * 2;
		System.out.println(ans);
	}
}
}