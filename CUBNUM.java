import java.util.*;
import java.lang.*;

class CubeNumbers {

	 public static void main(String[] args)
	 {
		 Scanner scan  = new Scanner(System.in);
		 long arr[] = new long[100001];
		 arr[0] = 0;
		 arr[1] = 1;
		 arr[2] = 2;
		 arr[3] = 3;
		 arr[4] = 4;
		 arr[5] = 5;
		 arr[6] = 6;
		 arr[7] = 7;
		 for(int i=8;i<100001;i++)
		 {
			 arr[i]=i;
			 for(int j=1;j<=i;j++)
			 {
				 long temp = j*j*j;
				 if(temp>i)
					 break;
				 else
					 arr[i] = Math.min(arr[i], 1+arr[(int) (i-temp)]);
			 }
		 }
		 int tt=0;
		 while(scan.hasNextInt())
		 {
			 int n = scan.nextInt();
			 tt++;
			 long ans  = arr[n];
			 System.out.println("Case #"+tt+": "+ans);
		 }
	 }
}
