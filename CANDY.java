import java.util.Arrays;
import java.util.Scanner;

 class SpojQuestion {

	 public static void main(String[] args)
	 {
		 Scanner scan = new Scanner(System.in);
		 long n = scan.nextLong();
		 while(n!=-1)
		 {
	     long sum = 0;
		 long arr[] = new long[(int) n];
		 for(long i=0; i<n; i++)
		 {
			 arr[(int) i] = scan.nextLong();
			 sum = sum + arr[(int) i];
		 }
		 long ans=0;
		 if(sum%n==0)
		 {
			 
			 long ele = sum/n;
			 for(long i=0; i<n; i++)
			 {
				 ans = ans + Math.abs(ele - arr[(int)i]);
			 }
			 System.out.println(ans/2);
		 }
		 else
			 System.out.println("-1");
		 
		n = scan.nextLong(); 
	 }
	 }
}
