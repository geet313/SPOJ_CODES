//package turri;

import java.util.Scanner;

 class NumberSteps {

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		long n=10000;
		int count=0;
		int j=0;
		int k=0;
		long arr1[] = new long[(int)n];
		long arr2[] = new long[(int)n];
		for(long i=0;i<n;i++)
		{
			if(count==0 || count ==1)
			{
				arr1[j++] = i;
				count++;
			}
			else if(count==2 || count ==3)
			{
				arr2[k++] = i;
				count++;
			}
			if(count==4)
				count=0;
		}
		int t = scan.nextInt();
		while(t>0)
		{
			long x = scan.nextLong();
			long y = scan.nextLong();
			if(y==x)
				System.out.println(arr1[(int)x]);
			else if(y==x-2)
				System.out.println(arr2[(int)y]);
			else
				System.out.println("No Number");
		t--;}
	//	for(int i=0;i<j;i++)
		//	System.out.print(arr1[4499]+" ");
	//	System.out.println();
//		for(int i=0;i<k;i++)
//			System.out.print(arr2[4499]+" ");
	}
}
