import java.util.*;
import java.lang.*;


 class StudyRoom {

	 public static void main(String[] args)
	 {
		 Scanner scan = new Scanner(System.in);
		 int t = scan.nextInt();
		 int tt=1;
		 while(tt<=t)
		 {
			 int n = scan.nextInt();
			 int m = scan.nextInt();
			 int arr[] = new int[n+1];
			 long count=0;
			 for(int i=1;i<=m;i++)
			 {
				 int b = scan.nextInt();
				 arr[b]=1;
			 }
			 for(int i=1;i<n; i++)
			 {
				 if(arr[i]==1 || arr[i-1]==1 || arr[i+1]==1)
					 count++;
			 }
			 if(arr[n]==1 || arr[n-1]==1)
				 count++;
			 System.out.println("Case "+tt+": "+count);
		 tt++;}
	 }
}
