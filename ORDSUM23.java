import java.util.Scanner;
 class SumOf2And3 {
 public static void main(String[] args)
	 {
		 Scanner scan = new Scanner(System.in);
		 long arr[] = new long[1000001];
		 arr[0]=0%1000000007;
		 arr[1]=0%1000000007;
		 arr[2]=1%1000000007;
		 arr[3]=1%1000000007;
		 for(int i=4;i<=1000000;i++)
		 {
			 arr[i] = (arr[i-2]%1000000007+arr[i-3]%1000000007)%1000000007;
		 }
		 int t = scan.nextInt();
		 while(t>0)
		 {
			 int n = scan.nextInt();
			 
			 System.out.println(arr[n]);
		 t--;}
	 }
}
